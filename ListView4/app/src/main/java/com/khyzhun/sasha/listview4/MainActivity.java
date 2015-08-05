package com.khyzhun.sasha.listview4;

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

    private static String month[] = {"Add","Delete","Down","Information","Help",
            "Download","Mail","Search","Settings"};

    private static String desc[] = {"Add desc","Delete desc","Down desc",
            "Information desc","Help desc","Download desc","Mail desc",
            "Search desc","Settings desc"};

    private static int icons[] = {R.drawable.add, R.drawable.delete,
            R.drawable.down, R.drawable.info, R.drawable.help,
            R.drawable.download, R.drawable.mail,
            R.drawable.search, R.drawable.settings};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lview3 = (ListView) findViewById(R.id.listView4);
        adapter = new ListViewCustomAdapter(this, month, desc, icons);
        lview3.setAdapter(adapter);

        lview3.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> arg0, View arg1, int position, long id) {
        // TODO Auto-generated method stub
        Toast.makeText(this, "Title => "+month[position]+" n Description => "+desc[position], Toast.LENGTH_SHORT).show();
    }
}