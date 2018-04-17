package news.sprots.alex.sportsnews.presentation.mvp.views;

import java.util.ArrayList;

import news.sprots.alex.sportsnews.model.Articles;
import news.sprots.alex.sportsnews.model.Event;

/**
 * Created by alex on 16.04.2018.
 */

public interface CategoryView extends BaseMvpView{

    void onSuccessLoadArticles(Articles articles);
    void onFailureArticles();
}
