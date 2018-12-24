package com.duanjiefei.github.mvptest.modle;

import com.duanjiefei.github.mvptest.modle.bean.UserInfo;

public interface IUserModle {

    void saveUserInfo(int id,String userName);

    UserInfo loadUser(int id);
}
