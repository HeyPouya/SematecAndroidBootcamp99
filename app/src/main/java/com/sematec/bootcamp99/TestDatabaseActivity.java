package com.sematec.bootcamp99;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TestDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_database);

        final EditText edtName = findViewById(R.id.edtName);
        final EditText edtFamily = findViewById(R.id.edtFamily);
        final EditText edtGrade = findViewById(R.id.edtGrade);
        final TextView txtName = findViewById(R.id.txtName);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnShow = findViewById(R.id.btnShow);


        final TestSqliteDBHelper helper = new TestSqliteDBHelper(TestDatabaseActivity.this, "sematec", null, 1);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtName.getText().toString();
                String family = edtFamily.getText().toString();
                int grade = Integer.parseInt(edtGrade.getText().toString());
                helper.insertStudent(name, family, grade);
            }
        });

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<String> names = helper.getStudentsNames();
                String data = "";
                for (int i = 0; i < names.size(); i++) {
                    data = data + names.get(i) + "\n";
                }
                txtName.setText(data);
            }
        });
    }
}
