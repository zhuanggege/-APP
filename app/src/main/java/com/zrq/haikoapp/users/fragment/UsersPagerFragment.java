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
 * 此类是用户fragment类
 * 获取视图view
 * 布局设置
 */
public class UsersPagerFragment extends Fragment implements View.OnClickListener {

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
        view = inflater.inflate(R.layout.users_page_04,null);

        //布局初始化(xml布局视图)
        initview(view);

        return view;
    }

    /**
     * 视图初始化
     * @param view
     */
    private void initview(View view) {
    }

    /**
     * 单击事件设置
     * @param v
     */
    @Override
    public void onClick(View v) {

    }
}
