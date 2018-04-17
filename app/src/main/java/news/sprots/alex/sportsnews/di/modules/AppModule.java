package news.sprots.alex.sportsnews.di.modules;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alex on 16.04.2018.
 */

@Module
public class AppModule {

    private Application app;

    public AppModule(Application app) {
        this.app = app;
    }

    @Singleton
    @Provides
    public Application providesApplication() {
        return app;
    }

    @Singleton
    @Provides
    public Context providesContext() {
        return app;
    }
}

