package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        ArrayList<String> posts = new ArrayList<>();
        /*for (int i = 0; i < 20; i++){
            posts.add("Post " + i);
            Log.i("posts: ", posts.get(i));

        }*/
        posts.add("Красный");
        posts.add("Оранжевый");
        posts.add("Желтый");
        posts.add("Зеленый");
        posts.add("Голубой");
        posts.add("Синий");
        posts.add("Фиолетовый");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, posts);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //view.setVisibility(View.GONE);
                Toast.makeText(MainActivity.this, "Номер " + position + " - " + posts.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}