package news.sprots.alex.sportsnews.presentation.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import news.sprots.alex.sportsnews.App;
import news.sprots.alex.sportsnews.R;
import news.sprots.alex.sportsnews.model.DetailArticle;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.DetailPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.views.DetailArticleView;

public class DetailArticleActivity extends BaseActivity<DetailArticleView, DetailPresenter> implements DetailArticleView {

    @BindView(R.id.fact1)
    TextView fact1;
    @BindView(R.id.fact2)
    TextView fact2;
    @BindView(R.id.fact3)
    TextView fact3;
    @BindView(R.id.header1)
    TextView header1;
    @BindView(R.id.header2)
    TextView header2;
    @BindView(R.id.header3)
    TextView header3;
    @BindView(R.id.team1)
    TextView team1;
    @BindView(R.id.team2)
    TextView team2;
    @BindView(R.id.timeDetail)
    TextView time;
    @BindView(R.id.placeDetail)
    TextView placeDetail;
    @BindView(R.id.prediction)
    TextView prediction;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.separator)
    TextView separator;
    @BindView(R.id.headerPrediction)
    TextView headerPrediction;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tournament)
    TextView tournament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ((App) getApplication()).getAppComponent().inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_article);
        ButterKnife.bind(this);
        toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mvpPresenter.loadDetailArticle(getIntent().getStringExtra("article"));
    }

    @Override
    public void onSuccessLoadDetail(DetailArticle detailArticle) {
        progressBar.setVisibility(View.GONE);
        separator.setVisibility(View.VISIBLE);
        headerPrediction.setVisibility(View.VISIBLE);
        team1.setText(detailArticle.getTeam1());
        team2.setText(detailArticle.getTeam2());
        time.setText(detailArticle.getTime());
        placeDetail.setText(detailArticle.getPlace());
        fact1.setText(detailArticle.getArticle().get(0).getText());
        fact2.setText(detailArticle.getArticle().get(1).getText());
        fact3.setText(detailArticle.getArticle().get(2).getText());
        header1.setText(detailArticle.getArticle().get(0).getHeader());
        header2.setText(detailArticle.getArticle().get(1).getHeader());
        header3.setText(detailArticle.getArticle().get(2).getHeader());
        prediction.setText(detailArticle.getPrediction());
        tournament.setText(detailArticle.getTournament());
    }

    @Override
    public void onFailureLoadDetail() {
        progressBar.setVisibility(View.GONE);
        Toast.makeText(this, "При загрузке статьи произошла ошибка.", Toast.LENGTH_LONG).show();
    }


}
