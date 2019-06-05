package com.example.mymvpdemo.mvp.callback;

/**
 * model给presenter返回数据的回调接口
 * @param <T>
 */
public interface Callback<T> {

    void onSuccess(T data, String msg);

    void onFailed(String msg);
}
