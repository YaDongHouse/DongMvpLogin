package com.tyt.dong.dongmvptest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.tyt.dong.dongmvptest.R;
import com.tyt.dong.dongmvptest.model.bean.User;
import com.tyt.dong.dongmvptest.presenter.UserLoginPresenter;

public class MainActivity extends AppCompatActivity implements IUserLoginView {

  @BindView(R.id.username) EditText username;
  @BindView(R.id.password) EditText password;
  @BindView(R.id.login) Button login;
  @BindView(R.id.clear) Button clear;
  @BindView(R.id.progress) ProgressBar progress;
  private UserLoginPresenter presenter = new UserLoginPresenter(this);

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
  }

  @Override public String getUserName() {
    return username.getText().toString();
  }

  @Override public String getPassWord() {
    return password.getText().toString();
  }

  @Override public void clearUserName() {
    username.setText("");
  }

  @Override public void clearPassWord() {
    password.setText("");
  }

  @Override public void showLoading() {
    progress.setVisibility(View.VISIBLE);
  }

  @Override public void hideLoading() {
    progress.setVisibility(View.GONE);
  }

  @Override public void toSecondActivity(User user) {
    Toast.makeText(this, user.getUsername() + "login success,to SecondActivity", Toast.LENGTH_LONG)
        .show();
  }

  @Override public boolean dispatchTouchEvent(MotionEvent ev) {
    return super.dispatchTouchEvent(ev);
  }

  @Override public void showFailedError() {
    Toast.makeText(this, "login Failed", Toast.LENGTH_LONG).show();
  }

  @OnClick({ R.id.login, R.id.clear }) public void onClick(View view) {
    switch (view.getId()) {
      case R.id.login:
        presenter.login();
        break;
      case R.id.clear:
        presenter.clear();
        break;
    }
  }
}
