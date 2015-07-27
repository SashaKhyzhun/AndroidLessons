package com.khyzhun.sasha.gridview_with_atrib;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends Activity {

    String[] data = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"};

    GridView gvMain;
    ArrayAdapter<String> adapter;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(adapter);
        adjustGridView();
    }


    private void adjustGridView() {
        // gvMain.setNumColumns(3);
        // gvMain.setColumnWidth(50);
        // gvMain.setVerticalSpacing(5);
        // gvMain.setHorizontalSpacing(5);
        // gvMain.setStretchMode(GridView.NO_STRETCH);
        gvMain.setNumColumns(GridView.AUTO_FIT);
    }

}