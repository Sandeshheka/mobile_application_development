package com.example.android.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.android.todoapp.tasks.TasksActivity;

public class SplashScreen extends AppCompatActivity {

    private ImageView applogo;

    public static int splashTimeOut = 5000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        applogo = (ImageView) findViewById(R.id.logo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashScreen.this, TasksActivity.class);
                startActivity(intent);
                finish();

            }
        },splashTimeOut);

        Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.myscreenanimation);
        applogo.startAnimation(myAnim);



    }
}
