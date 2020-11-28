package com.gandroid.multifragment.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.gandroid.multifragment.view.ContactUs;
import com.gandroid.multifragment.view.InBox;
import com.gandroid.multifragment.view.Profile;

public class PagerAdapter extends FragmentStatePagerAdapter {

    int tabCount;

    public PagerAdapter(@NonNull FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new InBox();
            case 1:
                return new ContactUs();
            case 2:
                return new Profile();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}