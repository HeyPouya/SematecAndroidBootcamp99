package com.sematec.bootcamp99;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TestViewPagerAdapter extends FragmentPagerAdapter {

    public TestViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TestFragment fragment = new TestFragment();
                return fragment;
            case 1:
                TestFragment fragment1 = new TestFragment();
                return fragment1;
            case 2:
                TestFragment fragment2 = new TestFragment();
                return fragment2;
            default:
                TestFragment fragment3 = new TestFragment();
                return fragment3;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "First Fragment";
            case 1:
                return "Second Fragment";
            case 2:
                return "Third Fragment";
            default:
                return "Unknown Fragment!";
        }
    }
}
