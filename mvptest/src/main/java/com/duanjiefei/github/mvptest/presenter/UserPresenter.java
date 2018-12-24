package com.duanjiefei.github.mvptest.presenter;

import com.duanjiefei.github.mvptest.modle.IUserModle;
import com.duanjiefei.github.mvptest.modle.UserModle;
import com.duanjiefei.github.mvptest.modle.bean.UserInfo;
import com.duanjiefei.github.mvptest.view.IActivityView;

public class UserPresenter {
    private IActivityView mIActivityView;
    private IUserModle mIUserModle;

    public UserPresenter(IActivityView IActivityView) {
        mIActivityView = IActivityView;
        mIUserModle = new UserModle();
    }

    public void saveUser(int id,String name){
        mIUserModle.saveUserInfo(id,name);
    }

    public void loadUserName(int id){
        UserInfo userInfo = mIUserModle.loadUser(id);
        mIActivityView.showUserName(userInfo.getUserName());
    }


}
