package com.example.mymvpdemo.base;

/**
 * 获取数据的回调接口
 * @param <T>
 */
public interface Callback<T> {

    void onSuccess(T data, String msg);

    void onFailed(String msg);
}
