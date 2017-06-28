package com.tyt.dong.dongmvptest.view;

import com.tyt.dong.dongmvptest.model.bean.User;

/**
 * Created by user on 2017/3/9.
 */

public interface IUserLoginView {
    String getUserName();
    String getPassWord();
    void clearUserName();
    void clearPassWord();
    void showLoading();
    void hideLoading();
    void toSecondActivity(User user);
    void showFailedError();
}
