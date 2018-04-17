package news.sprots.alex.sportsnews.presentation.mvp.presentersImpls;

import news.sprots.alex.sportsnews.presentation.mvp.presenters.BaseMvpPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.views.BaseMvpView;

/**
 * Created by alex on 16.04.2018.
 */

public abstract class BaseMvpPresenterImpl<V extends BaseMvpView> implements BaseMvpPresenter<V> {

    protected V mView;

    @Override
    public void attachView(V mView) {
        this.mView = mView;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
