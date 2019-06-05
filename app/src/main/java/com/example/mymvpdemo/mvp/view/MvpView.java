package com.example.mymvpdemo.mvp.view;

public interface MvpView<T> extends MvpBaseView<T> {

    void onLoading();

    void onSuccess(String msg);
}
