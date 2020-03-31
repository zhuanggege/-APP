package com.zrq.haikoapp.users.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zrq.haikoapp.R;

/**
 * 此类是动态fragment类
 * 获取视图view
 * 布局设置
 */

public class DynamicPagerFragment extends Fragment implements View.OnClickListener {

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
        view = inflater.inflate(R.layout.users_page_02,null);

        //初始化视图（xml布局）
        initview(view);
        
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    /**
     * 初始化视图
     * @param view
     */
    private void initview(View view) {
    }

    /**
     * 点击事件设置
     * @param v
     */
    @Override
    public void onClick(View v) {

    }
}
