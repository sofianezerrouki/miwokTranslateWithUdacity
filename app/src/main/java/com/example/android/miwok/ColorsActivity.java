package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        //Create an ArrayList of nembers (word)
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        words.add(new Word("green","otiiko",R.drawable.color_green));
        words.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        words.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        words.add(new Word("black","massokka",R.drawable.color_black));
        words.add(new Word("white","mustard",R.drawable.color_white));
        words.add(new Word("dusty","ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Word("yellow","chiwiiṭә",R.drawable.color_mustard_yellow));




        WordAdapter itemsAdapter = new WordAdapter( this,words, R.color.category_colors);

        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
