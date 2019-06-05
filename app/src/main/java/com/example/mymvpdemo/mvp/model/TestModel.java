package com.example.mymvpdemo.mvp.model;

import com.example.mymvpdemo.mvp.callback.Callback;
import com.example.mymvpdemo.mvp.contract.MvpContract;

/**
 * model中去请求数据
 */
public class TestModel implements MvpContract.model {

    @Override
    public void getData1(Callback<String> callback) {
        //获取数据，并回调callback
    }
}
