package news.sprots.alex.sportsnews;

import android.app.Application;

import news.sprots.alex.sportsnews.di.components.AppComponent;
import news.sprots.alex.sportsnews.di.components.DaggerAppComponent;
import news.sprots.alex.sportsnews.di.modules.AppModule;

/**
 * Created by alex on 16.04.2018.
 */

public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    public AppComponent getAppComponent(){
        return appComponent;
    }

    private void initDagger() {
        appComponent = DaggerAppComponent
                .builder()
                .appModule(new AppModule(this))
                .build();
    }
}
