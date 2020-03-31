package com.zrq.haikoapp.users.fragment.pager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zrq.haikoapp.R;
/**
 * 此类是主页fragment类
 * 获取视图view
 * 布局设置
 */

public class HomePagerFragment extends Fragment implements View.OnClickListener {

    /**
     * 创建视图
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;
        //获取xml布局
        view = inflater.inflate(R.layout.users_page_01,null);

        initview(view);
        return view;
    }

    /**
     * 布局初始化
     * @param view
     */
    private void initview(View view) {
    }


    /**
     * 点击事件设置
     * @param v v.getid();获取view视图的id
     */
    @Override
    public void onClick(View v) {


    }
}
