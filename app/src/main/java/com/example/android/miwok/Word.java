package com.example.android.miwok;

/**
 * Created by sof on 22/03/2019.
 */

public class Word {

    String miwokTranslation;
    String defaultTranslation;
    int imageResourceId = -1;
    int hasImg = imageResourceId;
    int idResAudio ;


    public Word(String defaultTranslation, String miwokTranslation, int RessourceIdAudio) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.idResAudio = RessourceIdAudio;
    }
    public Word(String defaultTranslation,String miwokTranslation,int src,int RessourceIdAudio) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = src;
        this.idResAudio = RessourceIdAudio;
    }
    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getAudioRessourceId() {
        return idResAudio;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        return hasImg != imageResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "miwokTranslation='" + miwokTranslation + '\'' +
                ", defaultTranslation='" + defaultTranslation + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", hasImg=" + hasImg +
                ", idResAudio=" + idResAudio +
                '}';
    }
}
