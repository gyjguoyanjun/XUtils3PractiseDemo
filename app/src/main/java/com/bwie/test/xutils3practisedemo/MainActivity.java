package com.bwie.test.xutils3practisedemo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.bwie.test.xutils3practisedemo.adapters.MyIndicatorAdapter;
import com.bwie.test.xutils3practisedemo.adapters.MyViewPagerAdapter;
import com.bwie.test.xutils3practisedemo.fragments.FragmentModel;
import com.bwie.test.xutils3practisedemo.utils.URLUtils;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.ViewPagerHelper;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;

import java.util.ArrayList;

public class MainActivity extends FragmentActivity {

    private MagicIndicator magic_indicator;
    private ViewPager viewPager;
    private CommonNavigator mCommonNavigator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        ArrayList<Fragment> list = new ArrayList<>();
        ArrayList<String> urls = URLUtils.getStringURL();
        for (int i =0;i<urls.size();i++){
            FragmentModel fragmentModel = FragmentModel.newInstance(urls.get(i));
            list.add(fragmentModel);
        }
        viewPager.setAdapter(new MyViewPagerAdapter(getSupportFragmentManager(),list));
        magic_indicator.setBackgroundColor(Color.parseColor("#ffffff"));
        mCommonNavigator = new CommonNavigator(this);
        mCommonNavigator.setSkimOver(true);
        ArrayList<String> titles = URLUtils.getStringTitle();
        MyIndicatorAdapter adapter = new MyIndicatorAdapter(titles,viewPager);
        mCommonNavigator.setAdapter(adapter);
        magic_indicator.setNavigator(mCommonNavigator);
        ViewPagerHelper.bind(magic_indicator, viewPager);


    }

    private void initView() {
        magic_indicator = (MagicIndicator) findViewById(R.id.magic_indicator);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
    }


}
