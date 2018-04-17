package news.sprots.alex.sportsnews.presentation.ui.pager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

import news.sprots.alex.sportsnews.presentation.ui.fragments.BasketballFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.CybersportFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.FootballFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.HockeyFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.TennisFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.VolleyballFragment;

/**
 * Created by alex on 16.04.2018.
 */

public class CategoryTabPagerAdapter extends FragmentPagerAdapter {

    public CategoryTabPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FootballFragment();
            case 1:
                return new VolleyballFragment();
            case 2:
                return new HockeyFragment();
            case 3:
                return new BasketballFragment();
            case 4:
                return new TennisFragment();
            case 5:
                return new CybersportFragment();
        }
        return null;
    }


    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null;
    }
}
