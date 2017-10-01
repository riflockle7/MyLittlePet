package ridickle.co.kr.mylittlepet.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ridickle.co.kr.mylittlepet.R;

/**
 * Created by ridickle on 2017. 9. 30..
 */

public class MainF1Fragment3 extends Fragment implements MainPresenter.Fragment1_3 {
    MainPresenter mPresenter;

    public MainF1Fragment3() {
        // Required empty public constructor
        mPresenter = MainPresenterImpl.newInstance(getActivity(), this);
    }

    public static MainF1Fragment3 newInstance() {
        MainF1Fragment3 fragment = new MainF1Fragment3();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1_fragment3, container, false);
    }

    @Override
    public void viewSetting() {

    }
}