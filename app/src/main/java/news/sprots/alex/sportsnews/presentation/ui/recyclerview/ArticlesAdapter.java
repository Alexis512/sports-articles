package news.sprots.alex.sportsnews.presentation.ui.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import news.sprots.alex.sportsnews.R;
import news.sprots.alex.sportsnews.model.Articles;
import news.sprots.alex.sportsnews.model.Event;

/**
 * Created by alex on 16.04.2018.
 */

public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesHolder> {

    private ArrayList<Event> articles;
    private View.OnClickListener listener;

    public ArticlesAdapter(ArrayList<Event> articles) {
        this.articles = articles;
        this.listener = listener;
    }

    @Override
    public ArticlesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cardview, parent, false);
        return new ArticlesHolder(v);
    }

    @Override
    public void onBindViewHolder(ArticlesHolder holder, int position) {
        holder.bind(articles.get(position));
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }
}
