package ridickle.co.kr.mylittlepet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment1 extends Fragment {

    public MainFragment1() {
        // Required empty public constructor
    }

    public static MainFragment1 newInstance() {
        MainFragment1 fragment = new MainFragment1();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_fragment1, container, false);
    }
}
