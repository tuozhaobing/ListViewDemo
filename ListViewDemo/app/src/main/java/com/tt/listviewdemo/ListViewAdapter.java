package com.tt.listviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by tuozhaobing on 15-12-6.
 * adapter for listview
 */
public class ListViewAdapter extends BaseAdapter{
    private static final String TAG = "ListViewAdapter";
    private Context mContext;


    public ListViewAdapter(Context context) {
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return 50;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(mContext);
        textView.setText("我是ListView的第"+position+"个子项(TextView)");
        return textView;
    }
}
