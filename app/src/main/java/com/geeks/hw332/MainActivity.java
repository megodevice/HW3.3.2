package com.geeks.hw332;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final ArrayList<String> buttonTextArray = new ArrayList<>();
    private final Random random = new Random();
    private RecyclerView rvButtons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        RVButtonsAdapter rvButtonsAdapter = new RVButtonsAdapter(loadData(buttonTextArray));
        rvButtons.setAdapter(rvButtonsAdapter);
    }

    private ArrayList<String> loadData(ArrayList<String> list) {
        for (int i = 0; i < 30; i++) {
            list.add(String.valueOf(random.nextInt(1000)));
        }
        return list;
    }

    private void initView() {
        rvButtons = findViewById(R.id.rv_buttons);
    }
}