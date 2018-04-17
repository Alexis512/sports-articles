package news.sprots.alex.sportsnews.presentation.mvp.views;

import news.sprots.alex.sportsnews.model.DetailArticle;

/**
 * Created by alex on 17.04.2018.
 */

public interface DetailArticleView extends BaseMvpView {

    void onSuccessLoadDetail(DetailArticle detailArticle);

    void onFailureLoadDetail();
}
