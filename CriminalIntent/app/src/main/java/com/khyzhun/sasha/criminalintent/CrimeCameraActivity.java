package com.khyzhun.sasha.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Sasha on 24.08.15.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }

}
