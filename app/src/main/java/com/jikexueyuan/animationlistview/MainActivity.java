package com.jikexueyuan.animationlistview;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.LayoutAnimationController;
import android.view.animation.ScaleAnimation;
import android.widget.ArrayAdapter;

/**
 * 为列表添加动画
 */
public class MainActivity extends ListActivity {

    private ArrayAdapter<String> adapter;
    private LayoutAnimationController lac; //布局动画控制器
    private ScaleAnimation sa; //缩放动画

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //这个布局不需要，使用android.R.layout.simple_list_item_1 呈现数据
//        setContentView(R.layout.activity_main);

        //数据适配器
        adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                new String[]{"Hello", "World", "jikexueyuan"});
        setListAdapter(adapter); //装载数据

        sa = new ScaleAnimation(0, 1, 0, 1); // 效果是从无到有
        sa.setDuration(1000); //持续时间1秒
        lac = new LayoutAnimationController(sa, 0.5f); //0.5f: 第一个原件显示50%时，开始下一个元件加载

        getListView().setLayoutAnimation(lac);//getListView：获取当前列表
    }
}
