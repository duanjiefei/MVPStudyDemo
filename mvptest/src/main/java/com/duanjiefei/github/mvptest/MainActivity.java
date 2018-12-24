package com.duanjiefei.github.mvptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.duanjiefei.github.mvptest.presenter.UserPresenter;
import com.duanjiefei.github.mvptest.view.IActivityView;

public class MainActivity extends AppCompatActivity implements IActivityView{

    private EditText ed_userId;
    private EditText ed_userName;


    private UserPresenter mUserPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_layout);

        mUserPresenter  = new UserPresenter(this);
        initView();
    }

    private void initView() {
        ed_userId = findViewById(R.id.user_id);
        ed_userName = findViewById(R.id.user_name);
    }

    public void save(View view) {
        int Id = Integer.parseInt(ed_userId.getText().toString());
        String name = ed_userName.getText().toString();
        saveUserInfo(Id,name);
    }

    public void get(View view) {
        int Id = Integer.parseInt(ed_userId.getText().toString());
        mUserPresenter.loadUserName(Id);
    }

    @Override
    public void saveUserInfo(int id, String userName) {
        mUserPresenter.saveUser(id,userName);
    }

    @Override
    public void showUserName(String userName) {
        ed_userName.setText(userName);
    }
}
