package com.example.HelloConstraint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SayHelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hello);
        TextView sayHello_showcount = findViewById(R.id.textCount);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.extra_message);
        sayHello_showcount.setText(message);
    }
}
