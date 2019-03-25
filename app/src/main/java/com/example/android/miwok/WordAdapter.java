package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sof on 22/03/2019.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    //Validé................
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {

        super(context,0, words);
        mColorResourceId = colorResourceId;
    }//Validé...............



    //Validé ..
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Obligatoire
        Word currentWord = getItem(position);
        //define elements of list_item.xml file(exemple : TextView + ImageView + ...)
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokTextView);
        miwokTextView.setText(currentWord.getMiwokTranslation());


        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.defaultTextView);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        ImageView imageWord = listItemView.findViewById(R.id.list_item_icon);
        if (currentWord.hasImage()){
            imageWord.setImageResource(currentWord.getImageResourceId());
            imageWord.setVisibility(View.VISIBLE);
        }else{
            imageWord.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
