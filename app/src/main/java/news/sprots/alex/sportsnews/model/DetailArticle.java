package news.sprots.alex.sportsnews.model;

import java.util.ArrayList;

/**
 * Created by alex on 17.04.2018.
 */

public class DetailArticle {

    private String team1;
    private String team2;
    private String time;
    private String tournament;
    private String place;
    private ArrayList<Fact> article;
    private String prediction;

    public String getTeam1() {
        return team1;
    }

    public String getTeam2() {
        return team2;
    }

    public String getTime() {
        return time;
    }

    public String getTournament() {
        return tournament;
    }

    public String getPlace() {
        return place;
    }

    public ArrayList<Fact> getArticle() {
        return article;
    }

    public String getPrediction() {
        return prediction;
    }
}
