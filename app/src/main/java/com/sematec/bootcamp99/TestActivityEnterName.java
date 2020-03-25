package com.sematec.bootcamp99;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class TestActivityEnterName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_enter_name);

        Button btnShow = findViewById(R.id.btnShow);
        final EditText edtName = findViewById(R.id.edtName);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                Intent intent = new Intent(TestActivityEnterName.this, TestActivityShowName.class);
                intent.putExtra("name",name);
                startActivity(intent);
            }
        });
    }
}
