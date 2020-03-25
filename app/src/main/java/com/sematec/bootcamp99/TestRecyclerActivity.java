package com.sematec.bootcamp99;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);

        RecyclerView recycler = findViewById(R.id.recycler);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Pouya Heydari");
        names.add("Ali Rostami");
        names.add("Arad Khanipour");
        names.add("Vahid Shokoohi");
        names.add("Yasin Gorgij");

        TestRecyclerAdapter adapter = new TestRecyclerAdapter(names);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));
    }
}
