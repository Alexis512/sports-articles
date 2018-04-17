package news.sprots.alex.sportsnews.domain;

import java.util.ArrayList;

import javax.inject.Inject;

import news.sprots.alex.sportsnews.model.Articles;
import news.sprots.alex.sportsnews.model.DetailArticle;
import news.sprots.alex.sportsnews.model.Event;
import news.sprots.alex.sportsnews.model.RequestApiServer;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.PresenterListener;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by alex on 16.04.2018.
 */

public class LoaderArticlesInteractor {

    private RequestApiServer loader;
    private PresenterListener listener;

    @Inject
    public LoaderArticlesInteractor(RequestApiServer serverApi) {
        loader = serverApi;
    }

    public void loadArticlesForCategory(String category) {

        loader.getArticlesForCategory(category)
                .enqueue(new Callback<Articles>() {

                    @Override
                    public void onResponse(Call<Articles> call, Response<Articles> response) {
                        listener.onSuccessLoadArticles(response.body());
                    }

                    @Override
                    public void onFailure(Call<Articles> call, Throwable t) {
                        listener.onFailureLoadArticles();
                    }
                });
    }


    public void loadDetailArticle(String article) {
        loader.getDetailArticle(article)
                .enqueue(new Callback<DetailArticle>() {
                    @Override
                    public void onResponse(Call<DetailArticle> call, Response<DetailArticle> response) {
                        listener.onSuccessLoadDetailArticle(response.body());
                    }

                    @Override
                    public void onFailure(Call<DetailArticle> call, Throwable t) {
                        listener.onFailureLoadDetailArticle();
                    }
                });
    }

    public void setPresenter(PresenterListener listener) {
        this.listener = listener;
    }

}
