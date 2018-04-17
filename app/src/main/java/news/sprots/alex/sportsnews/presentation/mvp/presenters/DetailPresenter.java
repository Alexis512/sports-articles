package news.sprots.alex.sportsnews.presentation.mvp.presenters;

import news.sprots.alex.sportsnews.presentation.mvp.views.DetailArticleView;

/**
 * Created by alex on 17.04.2018.
 */

public interface DetailPresenter extends BaseMvpPresenter<DetailArticleView> {

    void loadDetailArticle(String article);
}
