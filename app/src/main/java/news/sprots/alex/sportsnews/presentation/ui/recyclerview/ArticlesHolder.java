package news.sprots.alex.sportsnews.presentation.ui.recyclerview;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import news.sprots.alex.sportsnews.R;
import news.sprots.alex.sportsnews.model.Event;
import news.sprots.alex.sportsnews.presentation.ui.activity.DetailArticleActivity;

/**
 * Created by alex on 16.04.2018.
 */

public class ArticlesHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    @BindView(R.id.tvTitleArticle)
    TextView tvTitleArticle;
    @BindView(R.id.tvCoefficient)
    TextView tvCoefficient;
    @BindView(R.id.tvTime)
    TextView tvTime;
    @BindView(R.id.tvPlace)
    TextView tvPlace;
    @BindView(R.id.tvPreview)
    TextView tvPreview;

    private String articleDetail;

    public ArticlesHolder(View itemView) {
        super(itemView);
    }

    void bind(Event article) {
        ButterKnife.bind(this, itemView);
        tvTitleArticle.setText(article.getTitle());
        tvCoefficient.setText(article.getCoefficient());
        tvTime.setText(article.getTime());
        tvPlace.setText(article.getPlace());
        tvPreview.setText(tvPreview.getText() + article.getPreview());
        itemView.setOnClickListener(this);
        articleDetail = article.getArticle();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(itemView.getContext(), DetailArticleActivity.class);
        intent.putExtra("article", articleDetail);
        itemView.getContext().startActivity(intent);
    }
}
