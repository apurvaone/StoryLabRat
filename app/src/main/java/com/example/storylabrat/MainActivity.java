package com.example.storylabrat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView storiesBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        init();


    }

    private void init(){

        storiesBar= findViewById(R.id.storiesBar);

        List<Story> stories= new ArrayList<>();

        stories.add(new Story(true));
        stories.add(new Story(false));
        stories.add(new Story(false));
        stories.add(new Story(true));
        stories.add(new Story(false));
        stories.add(new Story(false));

        StoriesAdapter adapter= new StoriesAdapter(stories,this);
        storiesBar.setAdapter(adapter);
        storiesBar.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        storiesBar.addItemDecoration(new StoriesDecoration(10));






    }


}