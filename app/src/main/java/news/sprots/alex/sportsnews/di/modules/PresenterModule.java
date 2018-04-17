package news.sprots.alex.sportsnews.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.CategoryPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.DetailPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.MainPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.presentersImpls.CategoryPresenterImpl;
import news.sprots.alex.sportsnews.presentation.mvp.presentersImpls.DetailArticlePresenterImpl;
import news.sprots.alex.sportsnews.presentation.mvp.presentersImpls.MainPresenterImpl;

/**
 * Created by alex on 16.04.2018.
 */

@Module
public class PresenterModule {

    @Singleton
    @Provides
    MainPresenter providesMainPresenter(MainPresenterImpl mPresenterImpl) {
        return mPresenterImpl;
    }


    @Provides
    CategoryPresenter providesCategoryPresenter(CategoryPresenterImpl categoryPresenter) {
        return categoryPresenter;
    }

    @Singleton
    @Provides
    DetailPresenter providesDetailPresenter(DetailArticlePresenterImpl detailArticlePresenter) {
        return detailArticlePresenter;
    }
}
