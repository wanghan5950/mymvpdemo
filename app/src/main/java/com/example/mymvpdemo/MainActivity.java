package com.example.mymvpdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.mymvpdemo.mvp.presenter.TestPresenter;
import com.example.mymvpdemo.mvp.view.MvpView;

public class MainActivity extends AppCompatActivity {

    //根据返回数据类型定义presenter
    private TestPresenter<String> presenter;
    private TextView mainText;
    private Button btnRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        mainText = findViewById(R.id.main_text);
        btnRequest = findViewById(R.id.btn_request);
        //调用presenter的方法获取数据
        btnRequest.setOnClickListener(v -> presenter.getData1());
    }

    /**
     * 在需要获取数据的地方如activity,fragment中定义presenter并初始化
     */
    private void initPresenter() {
        presenter = new TestPresenter<>(new MvpView<String>() {
            @Override
            public void onLoading() {
                //加载中
            }

            @Override
            public void onSuccess(String msg) {
                //加载成功
            }

            @Override
            public void showData(String data) {
                //加载成功返回的数据
                mainText.setText(data);
            }

            @Override
            public void onFailed(String msg) {
                //加载失败
            }
        });
    }
}
