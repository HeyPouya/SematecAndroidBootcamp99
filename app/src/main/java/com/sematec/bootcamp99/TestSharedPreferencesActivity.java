package com.sematec.bootcamp99;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TestSharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shared_preferences);
        final EditText edtName = findViewById(R.id.edtName);
        final TextView txtName = findViewById(R.id.txtName);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnShow = findViewById(R.id.btnShow);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE)
                        .edit().putString("name", name).apply();
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name =
                        getSharedPreferences(getString(R.string.app_name), MODE_PRIVATE)
                                .getString("name", "Unknown User Name!");

                txtName.setText(name);
            }
        });

    }
}
