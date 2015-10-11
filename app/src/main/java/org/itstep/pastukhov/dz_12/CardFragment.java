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
public class CardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.card_fragment, container, false);

        RecyclerFragment.myDataset = RecyclerFragment.getDataSet();

        RecyclerFragment.mRecyclerView = (RecyclerView)rootView.findViewById(R.id.my_card_view);
        RecyclerFragment.mRecyclerView.setHasFixedSize(true);
        RecyclerFragment.mLayoutManager = new LinearLayoutManager(getActivity());
        RecyclerFragment.mRecyclerView.setLayoutManager(RecyclerFragment.mLayoutManager);

        RecyclerFragment.mAdapter = new CardAdapter(RecyclerFragment.myDataset);
        RecyclerFragment.mRecyclerView.setAdapter(RecyclerFragment.mAdapter);

        return rootView;
    }
}
