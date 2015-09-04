package com.khyzhun.sasha.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Sasha on 11.08.15.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new CrimeListFragment();
    }


    @Override
    protected int getLayoutResId() {
        return R.layout.activity_masterdetail;
    }

}

