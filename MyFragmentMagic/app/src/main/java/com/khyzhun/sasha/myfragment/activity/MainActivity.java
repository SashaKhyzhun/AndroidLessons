package com.khyzhun.sasha.myfragment.activity;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.khyzhun.sasha.myfragment.R;
import com.khyzhun.sasha.myfragment.fragment.LastFragment;

public class MainActivity extends FragmentActivity {

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
        initFragmentLast();
    }

    private void initFragmentLast() {
        transaction = manager.beginTransaction();
        transaction.add(R.id.container, new LastFragment());
        transaction.commit();
    }


}
