package com.zrq.haikoapp.users.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zrq.haikoapp.R;

public class CarertActivity extends Fragment implements View.OnClickListener {

    private Button home_btn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.users_page_01,null);
        initview(view);
        return view;
    }

    private void initview(View view) {

        home_btn = view.findViewById(R.id.home_btn);
        home_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.home_btn:
                Intent intent = new Intent(getActivity(), HomePagerFragment.class);
                startActivity(intent);
                break;

            default:
                break;
        }

    }

//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_caret);
//
//    }
}
