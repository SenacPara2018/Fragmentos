package com.example.speed.fragmentos.frag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.speed.fragmentos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragMembros extends Fragment {


    public FragMembros() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_membros, container, false);
    }

}
