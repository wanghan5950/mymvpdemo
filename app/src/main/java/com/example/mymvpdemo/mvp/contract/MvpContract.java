package com.example.mymvpdemo.mvp.contract;

import com.example.mymvpdemo.mvp.callback.Callback;

/**
 * 契约接口，定义出presenter和model需要实现的方法，可以不要，直接在presenter和model中写方法就可以了
 */
public interface MvpContract {

    interface presenter {
        void getData1();
    }

    interface model {
        void getData1(Callback<String> callback);
    }
}
