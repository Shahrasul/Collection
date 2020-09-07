package com.example.collection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView errorText;
    EditText login, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        errorText = findViewById(R.id.text_error);
        login = findViewById(R.id.vvodtxt);
        password = findViewById(R.id.vvodtxt2);
    }

    public void onClick(View view) {
        String log = login.getText().toString();
        String pass = password.getText().toString();
        if (TextUtils.isEmpty(log) || TextUtils.isEmpty(pass)) {
            errorText.setText("Вы ввели не правильные данные");
            errorText.setTextColor(Color.RED);
        } else {
            errorText.setText("Все правильно!");
            errorText.setTextColor(Color.GREEN);
        }
    }
}