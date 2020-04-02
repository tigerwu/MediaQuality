package com.tiger.mediaquality;

import android.net.Uri;

import androidx.fragment.app.Fragment;


public class MediaQCActivity extends SingleFragmentActivity implements VideoQCFragment.OnFragmentInteractionListener {

    @Override
    protected Fragment createFragment() {
        return VideoQCFragment.newInstance();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
