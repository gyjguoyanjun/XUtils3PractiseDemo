package com.bwie.test.xutils3practisedemo.utils;

import java.util.ArrayList;

/**
 * Created by tianjieyu on 2017/4/10.
 */

public class URLUtils {
    public static final String URLS = "http://result.eolinker.com/k2BaduF2a6caa275f395919a66ab1dfe4b584cc60685573";
    public static ArrayList<String> getStringTitle(){
        ArrayList<String> list = new ArrayList<>();
        list.add("头条");
        list.add("国际");
        list.add("国内");
        list.add("时尚");
        list.add("财经");
        list.add("科技");
        list.add("军事");
        list.add("体育");
        list.add("娱乐");
        list.add("社会");
        return list;
    }
    public static ArrayList<String> getStringURL(){
        ArrayList<String> list = new ArrayList<>();
        list.add("tt");
        list.add("gj");
        list.add("gn");
        list.add("ss");
        list.add("cj");
        list.add("kj");
        list.add("js");
        list.add("ty");
        list.add("yl");
        list.add("shehui");
        return list;
    }
}
