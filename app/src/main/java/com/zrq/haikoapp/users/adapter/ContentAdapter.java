package com.zrq.haikoapp.users.adapter;


import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

/**
 * 适配器
 */
public class ContentAdapter extends FragmentPagerAdapter {

    //存放Fragment碎片集合（list）
    private List<Fragment> list;

    //fragmentManager，Fragment管理
    FragmentManager fragmentManager ;


    public ContentAdapter(FragmentManager fm,List<Fragment> views) {
        super(fm);
        this.list = views;
        this.fragmentManager = fm;
    }

    /**
     * //返回页面数量
     * @return
     */
    @Override
    public int getCount() {

        return this.list.size();
    }

    /**
     * 实例化一个页面
     * @param position
     * @return
     */
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }


}
