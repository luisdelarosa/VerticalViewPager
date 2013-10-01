package com.luisdelarosa.verticalviewpager;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

abstract public class VerticalStatePagerAdapter extends FragmentStatePagerAdapter {

	public VerticalStatePagerAdapter(FragmentManager fm) {
		super(fm);
	}

	// The proportional height (in terms of screen height) of each page
	abstract public float getPageHeight(int mCurItem);

}
