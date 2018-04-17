package news.sprots.alex.sportsnews.presentation.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;
import news.sprots.alex.sportsnews.App;
import news.sprots.alex.sportsnews.R;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.MainPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.views.MainView;
import news.sprots.alex.sportsnews.presentation.ui.pager.CategoryTabPagerAdapter;

public class MainActivity extends BaseActivity<MainView, MainPresenter> {

    @BindView(R.id.slidingTabs)
    TabLayout tabs;

    @BindView(R.id.pager)
    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((App) getApplication()).getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initTabs();
    }

    private void initTabs() {
        CategoryTabPagerAdapter tabsAdapter = new CategoryTabPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(tabsAdapter);
        tabs.setupWithViewPager(pager);
        tabs.getTabAt(0).setIcon(R.drawable.ic_foolball);
        tabs.getTabAt(1).setIcon(R.drawable.ic_volleyball);
        tabs.getTabAt(2).setIcon(R.drawable.ic_hockey);
        tabs.getTabAt(3).setIcon(R.drawable.ic_basketball);
        tabs.getTabAt(4).setIcon(R.drawable.ic_tennis);
        tabs.getTabAt(5).setIcon(R.drawable.ic_gamepad);


    }
}
