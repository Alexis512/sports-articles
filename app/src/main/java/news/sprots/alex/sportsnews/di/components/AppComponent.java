package news.sprots.alex.sportsnews.di.components;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Component;
import news.sprots.alex.sportsnews.di.modules.DataModule;
import news.sprots.alex.sportsnews.di.modules.PresenterModule;
import news.sprots.alex.sportsnews.presentation.ui.activity.DetailArticleActivity;
import news.sprots.alex.sportsnews.presentation.ui.activity.MainActivity;
import news.sprots.alex.sportsnews.di.modules.AppModule;
import news.sprots.alex.sportsnews.presentation.ui.fragments.BasketballFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.CybersportFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.FootballFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.HockeyFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.TennisFragment;
import news.sprots.alex.sportsnews.presentation.ui.fragments.VolleyballFragment;

/**
 * Created by alex on 16.04.2018.
 */
@Singleton
@Component(modules = {
        AppModule.class,
        PresenterModule.class,
        DataModule.class
})
public interface AppComponent {

    void inject(Application app);

    void inject(MainActivity mainActivity);

    void inject(FootballFragment footballFragment);

    void inject(BasketballFragment basketballFragment);

    void inject(VolleyballFragment volleyballFragment);

    void inject(CybersportFragment cybersportFragment);

    void inject(TennisFragment tennisFragment);

    void inject(HockeyFragment hockeyFragment);

    void inject(DetailArticleActivity detailArticleActivity);
}
