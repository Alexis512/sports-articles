package news.sprots.alex.sportsnews.presentation.mvp.presenters;

import news.sprots.alex.sportsnews.presentation.mvp.views.CategoryView;

/**
 * Created by alex on 16.04.2018.
 */

public interface CategoryPresenter extends BaseMvpPresenter<CategoryView> {

    void onLoadArticleForCategory(String category);
}
