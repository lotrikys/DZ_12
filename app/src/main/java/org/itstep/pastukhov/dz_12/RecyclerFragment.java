package org.itstep.pastukhov.dz_12;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lotrik on 11.10.15.
 */
public class RecyclerFragment extends Fragment {
    static RecyclerView mRecyclerView;
    static RecyclerView.Adapter mAdapter;
    static RecyclerView.LayoutManager mLayoutManager;
    static String[] myDataset;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycler_fragment, container, false);
        myDataset = getDataSet();

        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecycleAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }

    public static String[] getDataSet() {

        String[] mDataSet = new String[20];
        for (int i = 0; i < 20; i++) {
            mDataSet[i] = "Element " + (i+1);
        }
        return mDataSet;
    }
}
