package com.example.listapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Correctly reference ListView
        ListView listView = findViewById(R.id.listView);

        // Define and initialize the List
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Grapes");

        // Create and set up the ArrayAdapter
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);

        // Set item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = list.get(position);
                Toast.makeText(MainActivity.this, "Clicked: " + selectedItem, Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    startActivity(new Intent(MainActivity.this,Apple_Activity.class));
                    // Action for "Apple"
                    Toast.makeText(MainActivity.this, "You clicked Apple", Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    // Action for "Orange"
                    Toast.makeText(MainActivity.this, "You clicked Orange", Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    // Action for "Banana"
                    Toast.makeText(MainActivity.this, "You clicked Banana", Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    // Action for "Grapes"
                    Toast.makeText(MainActivity.this, "You clicked Grapes", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
