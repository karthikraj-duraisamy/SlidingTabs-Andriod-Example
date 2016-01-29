package net.karthikraj.example.slidingtabsexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Karthikraj Duraisamy on 1/30/2016.
 * link : www.karthikraj.net
 * A class for displaying scrollable and dynamically added tags content.
 */
public class DynamicTabsFragment  extends Fragment {
    public static final String ARG_PAGE = "ARG_PAGE";

    private int mPage;

    public static DynamicTabsFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        DynamicTabsFragment fragment = new DynamicTabsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dynamic_tabs_layout, container, false);
        TextView textView = (TextView) view.findViewById(R.id.tvDynamicTabsText);
        textView.setText("Tab number " + mPage);
        return view;
    }
}
