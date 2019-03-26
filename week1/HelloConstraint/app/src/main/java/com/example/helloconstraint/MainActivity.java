package com.example.helloconstraint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
            Button btnZero = findViewById(R.id.button_zero);
            btnZero.setBackgroundResource(R.color.pink);


        //setting background to gray when odd and default when even
        Button btnCount = (Button) view;
        if (mCount % 2 == 0)
        {
            btnCount.setBackgroundResource(R.color.colorPrimary);
        } else
        {
            btnCount.setBackgroundResource(R.color.grey);
        }


    }

    public void resetToZero(View view) {
        Button button_zero = (Button) view;

        //if counter at zero toast message
        if (mCount == 0)
        {
            Toast toast = Toast.makeText(this,"counter already at 0", Toast.LENGTH_SHORT);
            toast.show();

        }
        mCount = 0;
        //reset to zero
        if (mCount >= 0)
        {
            mShowCount.setText(Integer.toString(mCount));
            button_zero.setBackgroundResource(R.color.grey);
        }

    }
}
