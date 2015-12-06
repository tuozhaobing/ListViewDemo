package com.tt.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ListViewAdapter mListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    public void initView(){
        mListView = (ListView)findViewById(R.id.listview);
        mListViewAdapter = new ListViewAdapter(this);
    }

    public void initData(){
        mListView.setAdapter(mListViewAdapter);
    }
}
