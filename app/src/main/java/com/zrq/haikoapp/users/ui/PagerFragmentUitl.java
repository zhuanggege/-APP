package com.zrq.haikoapp.users.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/**
 * 此类是fragment配置类
 * 切换碎片布局函数
 */

public class PagerFragmentUitl extends AppCompatActivity {

    //设置fragment管理
    private FragmentManager fragmentManager = null;
    //设置fragment管理事务
    private FragmentTransaction fragmentTransaction = null;

    /**
     * 布局函数   fragment信息
     * @param
     * @param
     */
    public PagerFragmentUitl() {

        this.fragmentManager = getSupportFragmentManager();
        this.fragmentTransaction = fragmentManager.beginTransaction();

    }

    /**
     * 获取同一个FragmentTransaction
     * @return
     */
    public FragmentTransaction getFragmentTransaction() {

        this.fragmentManager = getSupportFragmentManager();
        this.fragmentTransaction = fragmentManager.beginTransaction();
        return this.fragmentTransaction;
    }

    /**
     * 设置切换碎片布局函数
     * @param fragment_container
     * @param fg
     */
    public void setFragmentTransaction (int fragment_container , Fragment fg) {

        FragmentTransaction replace = fragmentTransaction.replace(fragment_container, fg);
    }

}
