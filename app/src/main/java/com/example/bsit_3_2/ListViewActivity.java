package com.example.bsit_3_2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ListViewActivity extends AppCompatActivity {

    ListView listView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.List);

        final String[] items = {
                "Black Myth: Wukong",
                "Elden Ring",
                "Sekiro",
                "Time",
                "Sagad",
                "Mario",
                "Luigi",
                "Hatdog",
                "Jett",
                "Arnold",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(ListViewActivity.this, Item0Activity.class);
                    startActivity(intent);
                    finish();
                }
                if (i == 1){
                    Intent intent = new Intent(ListViewActivity.this, Item1Activity.class);
                    startActivity(intent);
                    finish();
                }
                if (i == 2){
                    Intent intent = new Intent(ListViewActivity.this, Item2Activity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}