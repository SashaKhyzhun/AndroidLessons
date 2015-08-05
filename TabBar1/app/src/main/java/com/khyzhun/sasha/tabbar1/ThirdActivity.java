package com.khyzhun.sasha.tabbar1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Sasha on 05.08.15.
 */
public class ThirdActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_test);

        TextView txtView = (TextView) findViewById(R.id.txtDisplayedTab);
        txtView.setText("Пес, ты че страх потерял? ");
    }

}
