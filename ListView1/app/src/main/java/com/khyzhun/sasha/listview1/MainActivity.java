package com.khyzhun.sasha.listview1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity implements OnItemClickListener {
    /** Called when the activity is first created. */

    ListView lview;
    private final static String month[] = {"January","February","March","April","May",
            "June","July","August","September","October","November","December"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview = (ListView) findViewById(R.id.listView1);
        lview.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, month));
        lview.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView arg0, View arg1, int position, long id) {
        // TODO Auto-generated method stub
        Toast.makeText(this,"Item clicked => "+month[position], Toast.LENGTH_SHORT).show();
    }
}