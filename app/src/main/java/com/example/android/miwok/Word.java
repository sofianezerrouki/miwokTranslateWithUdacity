package com.example.android.miwok;

/**
 * Created by sof on 22/03/2019.
 */

public class Word {

    String miwokTranslation;
    String defaultTranslation;
    int imageResourceId = -1;
    int hasImg = imageResourceId;

    public Word(String defaultTranslation,String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }
    public Word(String defaultTranslation,String miwokTranslation,int src) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = src;
    }
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }



    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        return hasImg != imageResourceId;
    }
}
