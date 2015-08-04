package com.khyzhun.sasha.listview3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class MainActivity extends Activity implements OnItemClickListener {
    /** Called when the activity is first created. */

    ListView lview3;
    ListViewCustomAdapter adapter;

    private static String month[] = {"January","February","March","April","May",
            "June","July","August","September",
            "October","November","December"};

    private static String desc[] = {"Month - 1","Month - 2","Month - 3",
            "Month - 4","Month - 5","Month - 6","Month - 7",
            "Month - 8","Month - 9","Month - 10","Month - 11","Month - 12"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview3 = (ListView) findViewById(R.id.listView3);
        adapter = new ListViewCustomAdapter(this, month, desc);
        lview3.setAdapter(adapter);

        lview3.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        // TODO Auto-generated method stub
        Toast.makeText(this, "Title => "+month[position]+" n Description => "+desc[position], Toast.LENGTH_SHORT).show();
    }
}