package com.tyt.dong.dongmvptest.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.tyt.dong.dongmvptest.R;

public class SecondActivity extends AppCompatActivity {

  @BindView(R.id.editText) EditText editText;
  @BindView(R.id.button) Button button;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);
    ButterKnife.bind(this);
    button.setOnClickListener(view -> {
      Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
    });
  }
}
