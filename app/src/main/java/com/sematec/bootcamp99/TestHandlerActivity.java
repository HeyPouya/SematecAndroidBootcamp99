package com.sematec.bootcamp99;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TestHandlerActivity extends AppCompatActivity {

    Boolean hasUserClickedOnBack = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_handler);


    }

    @Override
    public void onBackPressed() {
        if (hasUserClickedOnBack == true) {
            super.onBackPressed();
        } else {
            Toast.makeText(this, "Press back again", Toast.LENGTH_SHORT).show();
            hasUserClickedOnBack = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    hasUserClickedOnBack = false;
                }
            }, 2000);
        }
    }
}
