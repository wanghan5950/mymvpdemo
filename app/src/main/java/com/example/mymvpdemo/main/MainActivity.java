package com.example.mymvpdemo.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.mymvpdemo.R;
import com.example.mymvpdemo.entity.MainResult;
import com.example.mymvpdemo.main.contract.MainContract;
import com.example.mymvpdemo.main.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {

    private MainPresenter presenter;
    private TextView mainText;
    private Button btnRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = findViewById(R.id.main_text);
        btnRequest = findViewById(R.id.btn_request);

        presenter = new MainPresenter(this);

        btnRequest.setOnClickListener(v -> presenter.fetchData());
    }


    @Override
    public void updateMainData(MainResult result) {
        mainText.setText(result.getData());
    }

    @Override
    public void setPresenter(MainContract.MainPresenter presenter) {

    }
}
