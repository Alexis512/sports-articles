package news.sprots.alex.sportsnews.presentation.mvp.presentersImpls;

import javax.inject.Inject;

import news.sprots.alex.sportsnews.presentation.mvp.presenters.BaseMvpPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.MainPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.views.MainView;

/**
 * Created by alex on 16.04.2018.
 */

public class MainPresenterImpl extends BaseMvpPresenterImpl<MainView> implements MainPresenter {

    @Inject
    public MainPresenterImpl(){}

}
