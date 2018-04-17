package news.sprots.alex.sportsnews.presentation.ui.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import news.sprots.alex.sportsnews.R;
import news.sprots.alex.sportsnews.model.Articles;
import news.sprots.alex.sportsnews.model.Event;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.BaseMvpPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.views.BaseMvpView;
import news.sprots.alex.sportsnews.presentation.mvp.views.CategoryView;
import news.sprots.alex.sportsnews.presentation.ui.recyclerview.ArticlesAdapter;

/**
 * Created by alex on 16.04.2018.
 */

public abstract class BaseFragment<V extends BaseMvpView, P extends BaseMvpPresenter<V>> extends Fragment
        implements CategoryView {

    @Inject
    protected P mvpPresenter;

    @BindView(R.id.rvArticles)
    RecyclerView rvArticles;
    @BindView(R.id.pbArticle)
    ProgressBar pbArticle;
    Unbinder unbinder;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        unbinder = ButterKnife.bind(this, view);
        super.onViewCreated(view, savedInstanceState);
        mvpPresenter.attachView((V) this);
    }

    @Override
    public void onDestroy() {
        mvpPresenter.detachView();
        unbinder.unbind();
        super.onDestroy();
    }

    @Override
    public void onSuccessLoadArticles(Articles articles) {
        pbArticle.setVisibility(View.GONE);
        ArticlesAdapter adapter = new ArticlesAdapter(articles.getEvents());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplication().getApplicationContext());
        rvArticles.setHasFixedSize(true);
        rvArticles.setLayoutManager(mLayoutManager);
        rvArticles.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    @Override
    public void onFailureArticles() {
        pbArticle.setVisibility(View.GONE);
        Toast.makeText(getActivity(), "При загрузке событий произошла ошибка.", Toast.LENGTH_LONG).show();
    }
}
