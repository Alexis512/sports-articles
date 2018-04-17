package news.sprots.alex.sportsnews.di.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import news.sprots.alex.sportsnews.model.RequestApiServer;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alex on 16.04.2018.
 */

@Module
public class DataModule {

    @Singleton
    @Provides
    RequestApiServer providesServerApi() {
        return new Retrofit.Builder()
                .baseUrl(" http://mikonatoruri.win/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(RequestApiServer.class);
    }
}
