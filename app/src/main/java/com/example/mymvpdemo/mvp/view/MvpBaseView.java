package com.example.mymvpdemo.mvp.view;

public interface MvpBaseView<T> {

    void showData(T data);

    void onFailed(String msg);
}
