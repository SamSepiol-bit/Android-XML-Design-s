package com.icbt.customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the ListView
        listView = findViewById(R.id.listView);

        // Data for the fruits and their descriptions
        String[] fruitList = {"Apple", "Orange", "Mango", "Grape", "Banana"};
        String[] description = {
                "A sweet red fruit", "A juicy citrus fruit", "A tropical yellow fruit",
                "A small, round, purple fruit", "A long yellow fruit"
        };

        // Image resources for the fruits
        int[] imageIds = {R.drawable.apple, R.drawable.orange, R.drawable.mango,
                R.drawable.grape, R.drawable.banana};

        // Set the custom adapter
        CustomAdapter adapter = new CustomAdapter(this, fruitList, description, imageIds);
        listView.setAdapter(adapter);

        // Set an item click listener to handle clicks on list items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected fruit and its description
                String selectedFruit = fruitList[position];
                String selectedDescription = description[position];

                // Display a Toast message with the fruit name and description
                Toast.makeText(MainActivity.this, "Selected: " + selectedFruit + "\n" + selectedDescription, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
