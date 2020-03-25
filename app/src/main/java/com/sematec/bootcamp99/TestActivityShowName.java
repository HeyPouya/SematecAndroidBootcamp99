package com.sematec.bootcamp99;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivityShowName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_show_name);

        TextView txtName = findViewById(R.id.txtName);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");

        txtName.setText(name);
    }
}
