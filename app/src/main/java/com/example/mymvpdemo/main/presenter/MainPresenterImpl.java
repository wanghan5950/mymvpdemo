package com.example.mymvpdemo.main.presenter;

import com.example.mymvpdemo.entity.MainResult;
import com.example.mymvpdemo.base.Callback;
import com.example.mymvpdemo.main.contract.MainContract;
import com.example.mymvpdemo.main.model.MainModel;

public class MainPresenterImpl implements MainContract.MainPresenter {

    private MainContract.MainView view;
    private MainModel model;

    public MainPresenterImpl(MainContract.MainView view) {
        this.view = view;
        model = new MainModel();
    }

    @Override
    public void fetchData() {
        model.getData(new Callback<MainResult>() {
            @Override
            public void onSuccess(MainResult data, String msg) {
                view.updateMainData(data);
            }

            @Override
            public void onFailed(String msg) {

            }
        });
    }

    @Override
    public void start() {

    }

}
