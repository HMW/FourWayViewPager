package jajoba.fourwayviewpager;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            // There is no reason to try to create its view hierarchy
            // because it won't be displayed.
            return null;
        }

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        return rootView;
    }
}
