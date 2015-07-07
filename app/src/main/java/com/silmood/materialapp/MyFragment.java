package com.silmood.materialapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {

    private static final String ARG_TITLE = "title";

    @Bind(R.id.textViewFragment)
    TextView textViewFragment;

    public static MyFragment newInstance(String title) {
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_TITLE, title);

        myFragment.setArguments(bundle);
        return myFragment;
    }


    public MyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View viewRoot = inflater.inflate(R.layout.fragment_my, container, false);
        ButterKnife.bind(this, viewRoot);

        textViewFragment.setText(getArguments().getString(ARG_TITLE));

        return viewRoot;
    }


}
