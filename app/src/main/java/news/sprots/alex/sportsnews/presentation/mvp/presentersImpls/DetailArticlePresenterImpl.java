package news.sprots.alex.sportsnews.presentation.mvp.presentersImpls;

import javax.inject.Inject;

import news.sprots.alex.sportsnews.domain.LoaderArticlesInteractor;
import news.sprots.alex.sportsnews.model.Articles;
import news.sprots.alex.sportsnews.model.DetailArticle;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.DetailPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.PresenterListener;
import news.sprots.alex.sportsnews.presentation.mvp.views.DetailArticleView;

/**
 * Created by alex on 17.04.2018.
 */

public class DetailArticlePresenterImpl extends BaseMvpPresenterImpl<DetailArticleView> implements PresenterListener, DetailPresenter {

    private LoaderArticlesInteractor loadArticle;

    @Inject
    public DetailArticlePresenterImpl(LoaderArticlesInteractor loaderArticlesInteractor) {
        this.loadArticle = loaderArticlesInteractor;
        this.loadArticle.setPresenter(this);
    }

    @Override
    public void onSuccessLoadArticles(Articles events) {
    }

    @Override
    public void onFailureLoadArticles() {
    }

    @Override
    public void onSuccessLoadDetailArticle(DetailArticle detail) {
        if (mView != null)
            mView.onSuccessLoadDetail(detail);
    }

    @Override
    public void onFailureLoadDetailArticle() {
        mView.onFailureLoadDetail();
    }

    @Override
    public void loadDetailArticle(String article) {
        loadArticle.loadDetailArticle(article);
    }
}
