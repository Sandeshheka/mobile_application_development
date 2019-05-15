package com.example.HelloConstraint;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public  static final String extra_message = "com.example.android.SayHelloConstraint.extra.MESSAGE";
    private int mCount = 0;
    private TextView mShowCount;
    private Button bCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        bCount = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {

    }

    public void countUp(View view) {
        mCount++;
        bCount.setBackgroundResource(R.color.colorMagenta);
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void showActivity(View view) {
        Intent intent = new Intent(this, SayHelloActivity.class);
        String message = mShowCount.getText().toString();
        intent.putExtra(extra_message,message);
        startActivity(intent);
    }
}
