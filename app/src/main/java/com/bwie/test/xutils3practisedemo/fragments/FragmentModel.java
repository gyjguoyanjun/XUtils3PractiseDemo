package com.bwie.test.xutils3practisedemo.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.test.xutils3practisedemo.R;
import com.bwie.test.xutils3practisedemo.utils.MyXUtils3;

/**
 * Created by tianjieyu on 2017/4/10.
 */

public class FragmentModel extends Fragment {

    private String url;
    private RecyclerView recycleView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        url = bundle.getString("url");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getActivity(), R.layout.fragmentslayout, null);
        initView(view);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    private void initData() {
        MyXUtils3.httpXUtils(url,recycleView,getContext());
    }

    private void initView(View view) {
        recycleView = (RecyclerView) view.findViewById(R.id.recycleView);
    }
    public static FragmentModel newInstance(String url){
        Bundle bundle = new Bundle();
        bundle.putString("url",url);
        FragmentModel fragmentModel = new FragmentModel();
        fragmentModel.setArguments(bundle);
        return fragmentModel;
    }
}
