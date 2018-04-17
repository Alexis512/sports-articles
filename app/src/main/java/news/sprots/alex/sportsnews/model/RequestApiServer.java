package news.sprots.alex.sportsnews.model;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by alex on 16.04.2018.
 */

public interface RequestApiServer {

    @GET("list.php")
    Call<Articles> getArticlesForCategory(@Query("category") String category);

    @GET("post.php")
    Call<DetailArticle> getDetailArticle(@Query("article") String article);
}
