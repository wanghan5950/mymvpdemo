package com.example.mymvpdemo.mvp.presenter;

import com.example.mymvpdemo.mvp.callback.Callback;
import com.example.mymvpdemo.mvp.contract.MvpContract;
import com.example.mymvpdemo.mvp.model.TestModel;
import com.example.mymvpdemo.mvp.view.MvpView;

/**
 * presenter持有model和view的引用
 * @param <T>
 */
public class TestPresenter<T> implements MvpContract.presenter {

    private TestModel model;
    private MvpView<T> view;

    public TestPresenter(MvpView<T> view) {
        this.view = view;
        model = new TestModel();
    }

    @Override
    public void getData1() {
        view.onLoading();
        model.getData1(new Callback<String>() {
            @Override
            public void onSuccess(String data, String msg) {
                view.showData((T) data);
                view.onSuccess(msg);
            }

            @Override
            public void onFailed(String msg) {
                view.onFailed(msg);
            }
        });
    }
}
