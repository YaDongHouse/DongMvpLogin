package com.tyt.dong.dongmvptest.model.biz;

/**
 * Created by user on 2017/3/9.
 */

public interface IUserBiz
{
    void login(String username,String password,OnLoginListener loginListener);
}
