package com.khyzhun.sasha.listview2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {
    /** Called when the activity is first created. */

    ListView lview;
    ListViewAdapter lviewAdapter;

    private final static String month[] = {"January","February","March","April","May",
        "June","July","August","September","October","November","December"};

    private final static String number[] = {"Month - 1", "Month - 2","Month - 3",
        "Month - 4","Month - 5","Month - 6",
        "Month - 7","Month - 8","Month - 9",
        "Month - 10","Month - 11","Month - 12"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview = (ListView) findViewById(R.id.listView2);
        lviewAdapter = new ListViewAdapter(this, month, number);

        System.out.println("adapter => "+lviewAdapter.getCount());

        lview.setAdapter(lviewAdapter);

        lview.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        // TODO Auto-generated method stub
        Toast.makeText(this,"Title => "+month[position]+"=> n Description"+number[position], Toast.LENGTH_SHORT).show();
    }
}