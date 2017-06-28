package com.tyt.dong.dongmvptest.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by user on 2017/6/1.
 */

public class DongView extends View {
  public DongView(Context context) {
    super(context);
  }

  public DongView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public DongView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  @Override public boolean onTouchEvent(MotionEvent event) {
    return super.onTouchEvent(event);
  }
}
