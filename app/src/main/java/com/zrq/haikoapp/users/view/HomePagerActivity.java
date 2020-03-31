package com.zrq.haikoapp.users.view;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.zrq.haikoapp.users.adapter.ContentAdapter;
import com.zrq.haikoapp.R;
import com.zrq.haikoapp.users.fragment.CarertActivity;
import com.zrq.haikoapp.users.ui.PagerFragmentUitl;

import java.util.ArrayList;
import java.util.List;

public class HomePagerActivity extends AppCompatActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    //底部菜单的4个LinerLayout
    private LinearLayout ll_home;
    private LinearLayout ll_dynamic;
    private LinearLayout ll_coach;
    private LinearLayout ll_userhome;

    //底部菜单的4个图片imaget
    private ImageView iv_home;
    private ImageView iv_dynamic;
    private ImageView iv_coach;
    private ImageView iv_userhome;

    //底部菜单的4个文本text
    private TextView tv_home;
    private TextView tv_dynamic;
    private TextView tv_coach;
    private TextView tv_userhome;

    //中间内容区域组件
    private ViewPager av_center;

    //ViewPager的适配器ContentAdapter
    private ContentAdapter adapter;

    //中间内容视图集合
    private List<Fragment> viewList;

    //Fragment布局
    private PagerFragmentUitl transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.users_pager_main);

        //初始化视图
        initView();

        //初始化底部按钮
        initEvent();

    }

    /**
     * //初始化视图
     */
    private void initView() {

        //获取底部4个菜单组件
        this.ll_home = findViewById(R.id.ll_home);
        this.ll_dynamic = findViewById(R.id.ll_dynamic);
        this.ll_coach = findViewById(R.id.ll_coach);
        this.ll_userhome = findViewById(R.id.ll_userHome);

        //底部菜单的4个图片image
        this.iv_home = findViewById(R.id.iv_home);
        this.iv_dynamic = findViewById(R.id.iv_dynamic);
        this.iv_coach = findViewById(R.id.iv_coach);
        this.iv_userhome = findViewById(R.id.iv_userHome);

        //获取底部菜单4个文本text
        this.tv_home = findViewById(R.id.tv_home);
        this.tv_dynamic = findViewById(R.id.tv_dynamic);
        this.tv_coach = findViewById(R.id.tv_coach);
        this.tv_userhome = findViewById(R.id.tv_userHome);

        //获取主页中间内容组件
        this.av_center = findViewById(R.id.av_center);

        initFragment();
        //适配器
        View page_1 = View.inflate(HomePagerActivity.this, R.layout.users_page_01, null);
        View page_2 = View.inflate(HomePagerActivity.this, R.layout.users_page_02, null);
        View page_3 = View.inflate(HomePagerActivity.this, R.layout.users_page_03, null);
        View page_4 = View.inflate(HomePagerActivity.this, R.layout.users_page_04, null);

        viewList = new ArrayList<Fragment>();
        viewList.add(new CarertActivity());
//        viewList.add(page_2);
//        viewList.add(page_3);
//        viewList.add(page_4);

        this.adapter = new ContentAdapter(getSupportFragmentManager(),viewList);
        //将适配器放进中间内容区
        this.av_center.setAdapter(adapter);

    }

    /**
     * Fragment配置
     */
    private ContentAdapter initFragment() {

        return null;

    }

    /**
     * 给组件设置按键监听
     */
    private void initEvent() {
        //底部菜单linearLyaout
        this.ll_home.setOnClickListener(this);
        this.ll_dynamic.setOnClickListener(this);
        this.ll_coach.setOnClickListener(this);
        this.ll_userhome.setOnClickListener(this);

        //设置ViewPager滑动监听
        this.av_center.setOnClickListener(this);
    }

    /**
     * 单击事件触发处理
     * @param v
     */
    @Override
    public void onClick(View v) {
        //每次单击底部背景和textView都变为原来的颜色
        restartBotton();

        //当底部菜单被选中改变背景颜色和textView，显示viewpager视图
        switch (v.getId()) {
            case R.id.ll_home:
                this.tv_home.setTextColor(Color.RED);
                this.iv_home.setImageResource(R.drawable.train_pressed);
                this.av_center.setCurrentItem(0);
                break;
            case R.id.ll_dynamic:
                this.tv_dynamic.setTextColor(Color.RED);
                this.iv_dynamic.setImageResource(R.drawable.found_pressed);
                this.av_center.setCurrentItem(1);
                break;
            case R.id.ll_coach:
                this.tv_coach.setTextColor(Color.RED);
                this.iv_coach.setImageResource(R.drawable.coach_pressed);
                this.av_center.setCurrentItem(2);
                break;
            case R.id.ll_userHome:
                this.tv_userhome.setTextColor(Color.RED);
                this.iv_userhome.setImageResource(R.drawable.me_pressed);
                this.av_center.setCurrentItem(3);
                break;
            default:
                break;

        }


    }
    public void restartBotton() {

        //设置文本为黑色
        this.tv_home.setTextColor(Color.BLACK);
        this.tv_dynamic.setTextColor(Color.BLACK);
        this.tv_coach.setTextColor(Color.BLACK);
        this.tv_userhome.setTextColor(Color.BLACK);

        this.iv_home.setImageResource(R.drawable.train_unpressed);
        this.iv_dynamic.setImageResource(R.drawable.found_unpressed);
        this.iv_coach.setImageResource(R.drawable.coach_unpressed);
        this.iv_userhome.setImageResource(R.drawable.me_unpressed);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        //每次单击底部背景和textView都变为原来的颜色
        restartBotton();

        //当前view被选择的时候,改变底部菜单背景，文字颜色
        switch (position) {
            case 0:
                this.tv_home.setTextColor(Color.BLACK);
                this.iv_home.setImageResource(R.drawable.train_pressed);
                break;
            case 1:
                this.tv_dynamic.setTextColor(Color.BLACK);
                this.iv_dynamic.setImageResource(R.drawable.found_pressed);
                break;
            case 2:
                this.tv_coach.setTextColor(Color.BLACK);
                this.iv_coach.setImageResource(R.drawable.coach_pressed);
                break;
            case 3:
                this.tv_userhome.setTextColor(Color.BLACK);
                this.iv_userhome.setImageResource(R.drawable.me_pressed);
                break;
            default:
                break;
        }

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}