package com.khyzhun.sasha.criminalintent;

import java.util.UUID;

/**
 * Created by Sasha on 07.08.15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;


    public UUID getId() {
        return mId;
    }


    public String getTitle() {
        return mTitle;
    }


    public void setTitle(String title) {
        mTitle = title;
    }

}