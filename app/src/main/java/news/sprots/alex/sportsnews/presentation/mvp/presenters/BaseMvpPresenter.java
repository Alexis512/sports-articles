package news.sprots.alex.sportsnews.presentation.mvp.presenters;

import news.sprots.alex.sportsnews.presentation.mvp.views.BaseMvpView;

/**
 * Created by alex on 16.04.2018.
 */

public interface BaseMvpPresenter<V extends BaseMvpView> {

    void attachView(V mView);
    void detachView();
}
