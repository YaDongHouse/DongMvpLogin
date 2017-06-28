package com.tyt.dong.dongmvptest.model.biz;

import com.tyt.dong.dongmvptest.model.bean.User;

/**
 * Created by user on 2017/3/9.
 */

public interface OnLoginListener
{
    void loginSuccess(User user);
    void loginFailed();
}
