package news.sprots.alex.sportsnews.presentation.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import javax.inject.Inject;


import news.sprots.alex.sportsnews.R;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.BaseMvpPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.views.BaseMvpView;

/**
 * Created by alex on 16.04.2018.
 */

abstract class BaseActivity<V extends BaseMvpView, P extends BaseMvpPresenter<V>> extends AppCompatActivity implements BaseMvpView {

    @Inject
    protected P mvpPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        mvpPresenter.attachView((V) this);
        super.onCreate(savedInstanceState);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
    }

    @Override
    protected void onDestroy() {
        mvpPresenter.detachView();
        super.onDestroy();
    }
}
