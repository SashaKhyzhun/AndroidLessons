package com.khyzhun.sasha.gridview_with_atrib;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {

    String[] data = {"Салаты", "Пица", "Горячее", "Суши", "Десерт", "f", "g", "h", "i", "j", "k"};

    GridView gridView;
    ArrayAdapter<String> adapter;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(adapter);
        //gridView.setAdapter(new ImageAdapter(this));
        adjustGridView();
    }


    private void adjustGridView() {
        gridView.setNumColumns(1);
        // gvMain.setColumnWidth(50);
        // gvMain.setVerticalSpacing(5);
        // gvMain.setHorizontalSpacing(5);
        // gvMain.setStretchMode(GridView.NO_STRETCH);
        //gvMain.setNumColumns(GridView.AUTO_FIT);
    }

}