package com.sasha.khyzhun.runtracker;

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;


public abstract class DataLoader<Token> extends AsyncTaskLoader<Token> {
    private Token mData;

    public DataLoader(Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        if (mData != null) {
            deliverResult(mData);
        } else {
            forceLoad();
        }
    }

    @Override
    public void deliverResult(Token data) {
        mData = data;
        if (isStarted())
            super.deliverResult(data);
    }
}