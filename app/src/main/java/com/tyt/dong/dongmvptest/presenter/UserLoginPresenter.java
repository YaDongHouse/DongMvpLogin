package com.tyt.dong.dongmvptest.presenter;

import android.os.Handler;

import com.tyt.dong.dongmvptest.model.bean.User;
import com.tyt.dong.dongmvptest.model.biz.IUserBiz;
import com.tyt.dong.dongmvptest.model.biz.OnLoginListener;
import com.tyt.dong.dongmvptest.model.biz.UserBiz;
import com.tyt.dong.dongmvptest.view.IUserLoginView;

/**
 * Created by user on 2017/3/9.
 */

public class UserLoginPresenter
{
    private IUserBiz userBiz;//这个是和model 对实体类的存储以及业务逻辑的处理
    private IUserLoginView userLoginView;//这个是view的接口  通过这个接口获取Activity中用户输入的数据以及更新UI
    private Handler handler = new Handler();

    public UserLoginPresenter(IUserLoginView userLoginView) {
        this.userLoginView = userLoginView;
        this.userBiz = new UserBiz() ;
    }
    public void login(){
        userLoginView.showLoading();
        userBiz.login(userLoginView.getUserName(), userLoginView.getUserName(), new OnLoginListener() {
            @Override
            public void loginSuccess(final User user) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.toSecondActivity(user);
                        userLoginView.hideLoading();
                    }
                });
            }

            @Override
            public void loginFailed() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        userLoginView.showFailedError();
                        userLoginView.hideLoading();
                    }
                });

            }
        });
    }
    public void clear(){
        userLoginView.clearPassWord();
        userLoginView.clearUserName();
    }
}
