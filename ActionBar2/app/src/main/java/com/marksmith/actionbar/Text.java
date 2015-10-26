package com.marksmith.actionbar;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Text extends Fragment {
    TextView text;

    public Text() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_text, container, false);
        text = (TextView)v.findViewById(R.id.txt);
        String menu = getArguments().getString("Menu");
        text.setText(menu);
        return v;
    }


}
