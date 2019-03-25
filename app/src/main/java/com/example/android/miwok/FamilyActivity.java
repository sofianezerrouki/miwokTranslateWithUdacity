package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);

        //Create an ArrayList of nembers (word)
        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("father","әpә",R.drawable.family_father));
        words.add(new Word("mother","әṭa",R.drawable.family_mother));
        words.add(new Word("son","angs",R.drawable.family_son));
        words.add(new Word("daughter","tune",R.drawable.family_daughter));
        words.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        words.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        words.add(new Word("older sister","teṭe",R.drawable.family_older_sister));
        words.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        words.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        words.add(new Word("grandfather","paapa",R.drawable.family_grandfather));



        WordAdapter itemsAdapter = new WordAdapter( this,words, R.color.category_family);

        ListView listView =(ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
