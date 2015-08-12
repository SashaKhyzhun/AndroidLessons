package com.khyzhun.sasha.criminalintent;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by Sasha on 11.08.15.
 */
public class CrimeListFragment extends ListFragment {

    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        mCrimes = CrimeLab.get(getActivity()).getCrimes();

        ArrayAdapter<Crime> adapter =
                new ArrayAdapter<Crime>(getActivity(),
                        android.R.layout.simple_list_item_1,
                        mCrimes);
        setListAdapter(adapter);

    }

}
