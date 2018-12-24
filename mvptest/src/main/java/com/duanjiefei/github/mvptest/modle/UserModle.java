package com.duanjiefei.github.mvptest.modle;

import android.util.SparseArray;

import com.duanjiefei.github.mvptest.modle.bean.UserInfo;

public class UserModle implements IUserModle {


    private SparseArray<UserInfo> userInfos = new SparseArray<UserInfo>();
    @Override
    public void saveUserInfo(int id, String userName) {
        UserInfo userInfo = new UserInfo(id,userName);
        userInfos.append(id,userInfo);
    }

    @Override
    public UserInfo loadUser(int id) {
        UserInfo userInfo = userInfos.get(id);
        return userInfo;
    }
}
