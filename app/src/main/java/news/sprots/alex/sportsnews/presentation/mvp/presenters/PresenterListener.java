package news.sprots.alex.sportsnews.presentation.mvp.presenters;

import java.util.ArrayList;

import news.sprots.alex.sportsnews.model.Articles;
import news.sprots.alex.sportsnews.model.DetailArticle;
import news.sprots.alex.sportsnews.model.Event;

/**
 * Created by alex on 16.04.2018.
 */

public interface PresenterListener {

    void onSuccessLoadArticles(Articles events);

    void onFailureLoadArticles();

    void onSuccessLoadDetailArticle(DetailArticle detail);

    void onFailureLoadDetailArticle();
}
