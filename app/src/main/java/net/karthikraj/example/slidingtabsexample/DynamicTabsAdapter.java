package net.karthikraj.example.slidingtabsexample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Karthikraj Duraisamy on 1/30/2016.
 * link : www.karthikraj.net
 * A class for serving adapter for the tabs fragment.
 */
public class DynamicTabsAdapter  extends FragmentPagerAdapter {
    final int PAGE_COUNT = 17;
    private String tabTitles[] = new String[PAGE_COUNT];
    private Context context;

    public DynamicTabsAdapter(FragmentManager fragmentManager, Context context) {
        super(fragmentManager);
        this.context = context;

        for(int i = 0; i < PAGE_COUNT; i++){
            tabTitles[i] = "TAB"+(i+1);
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        return DynamicTabsFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
