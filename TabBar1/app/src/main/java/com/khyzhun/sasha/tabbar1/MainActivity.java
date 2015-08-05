package com.khyzhun.sasha.tabbar1;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();
        TabHost.TabSpec spec;
        Intent intent;

        intent = new Intent().setClass(this, FirstActivity.class);
        spec = tabHost.newTabSpec("First").setIndicator("First")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, SecondActivity.class);
        spec = tabHost.newTabSpec("Second").setIndicator("Second")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, ThirdActivity.class);
        spec = tabHost.newTabSpec("Third").setIndicator("Third")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, FourthActivity.class);
        spec = tabHost.newTabSpec("Fourth").setIndicator("Fourth")
                .setContent(intent);
        tabHost.addTab(spec);
    }
}