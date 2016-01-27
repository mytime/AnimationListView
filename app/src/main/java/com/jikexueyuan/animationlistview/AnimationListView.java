package com.jikexueyuan.animationlistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * 使用资源文件配置列表动画效果
 */
public class AnimationListView extends ListActivity {
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                new String[]{"煎饼","茶叶蛋","豆浆"});

        setListAdapter(adapter);
    }
}
