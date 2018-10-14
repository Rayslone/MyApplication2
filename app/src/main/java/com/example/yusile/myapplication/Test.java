package com.example.yusile.myapplication;

import com.google.gson.Gson;

/**
 * Created by yusile on 2018/6/28.
 */

public class Test {
    public static void main(String[] args) {
        Bean bean = new Bean();
        String s = new Gson().toJson(bean);
        System.out.println(s);
    }
}
