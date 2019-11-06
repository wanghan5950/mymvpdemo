package com.example.mymvpdemo.main.contract;

import com.example.mymvpdemo.entity.MainResult;
import com.example.mymvpdemo.base.BasePresenter;
import com.example.mymvpdemo.base.BaseView;

public interface MainContract {

    interface MainPresenter extends BasePresenter {

        void fetchData();

    }

    interface MainView extends BaseView<MainPresenter> {

        void updateMainData(MainResult result);

    }
}
