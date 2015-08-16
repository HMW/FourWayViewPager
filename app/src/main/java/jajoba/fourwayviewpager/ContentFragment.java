package jajoba.fourwayviewpager;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.ref.WeakReference;

public class ContentFragment extends Fragment {

    public static interface Callback {
        // TODO add callback methods
    }

    private WeakReference<Callback> callbackRef;
    private int tag;

    public static ContentFragment newFragment(Callback cb, int tag) {
        ContentFragment fragment = new ContentFragment();
        fragment.tag = tag;
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            // There is no reason to try to create its view hierarchy
            // because it won't be displayed.
            return null;
        }
        View rootView = inflater.inflate(R.layout.fragment_content, container, false);
        TextView text = (TextView) rootView.findViewById(R.id.text);
        text.setText("I am " + tag);

        return rootView;
    }

    public int getPageTag() {
        return tag;
    }

    public void setCallback(Callback cb) {
        callbackRef = new WeakReference<Callback>(cb);
    }

    public Callback getCallback() {
        if (callbackRef != null) {
            return callbackRef.get();
        }

        return null;
    }

}
