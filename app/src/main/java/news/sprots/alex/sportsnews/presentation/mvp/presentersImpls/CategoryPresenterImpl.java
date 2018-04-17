package news.sprots.alex.sportsnews.presentation.mvp.presentersImpls;

import android.util.Log;

import java.util.ArrayList;

import javax.inject.Inject;

import news.sprots.alex.sportsnews.domain.LoaderArticlesInteractor;
import news.sprots.alex.sportsnews.model.Articles;
import news.sprots.alex.sportsnews.model.DetailArticle;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.CategoryPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.PresenterListener;
import news.sprots.alex.sportsnews.presentation.mvp.views.CategoryView;

/**
 * Created by alex on 16.04.2018.
 */

public class CategoryPresenterImpl extends BaseMvpPresenterImpl<CategoryView> implements CategoryPresenter, PresenterListener {

    private LoaderArticlesInteractor loaderInteractor;

    @Inject
    public CategoryPresenterImpl(LoaderArticlesInteractor loaderArticlesInteractor) {
        this.loaderInteractor = loaderArticlesInteractor;
        this.loaderInteractor.setPresenter(this);
    }

    @Override
    public void onLoadArticleForCategory(String category) {
        loaderInteractor.loadArticlesForCategory(category);
    }


    @Override
    public void onSuccessLoadArticles(Articles events) {
        if (mView != null)
            mView.onSuccessLoadArticles(events);
    }

    @Override
    public void onFailureLoadArticles() {
        mView.onFailureArticles();
    }

    @Override
    public void onSuccessLoadDetailArticle(DetailArticle detail) {

    }

    @Override
    public void onFailureLoadDetailArticle() {

    }
}
