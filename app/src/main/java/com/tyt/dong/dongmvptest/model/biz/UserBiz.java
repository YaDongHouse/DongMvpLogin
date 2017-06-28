package com.tyt.dong.dongmvptest.model.biz;

import com.tyt.dong.dongmvptest.model.bean.User;

/**
 * Created by user on 2017/3/9.
 * 业务方法的实现
 */

public class UserBiz implements IUserBiz {
    @Override
    public void login(final String username, final String password, final OnLoginListener loginListener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if ("aaa".equals(username)&&"123".equals(password)){
                    User user =new User(username,password);
                    loginListener.loginSuccess(user);
                }else {
                    loginListener.loginFailed();
                }
            }
        }).start();
    }
}
