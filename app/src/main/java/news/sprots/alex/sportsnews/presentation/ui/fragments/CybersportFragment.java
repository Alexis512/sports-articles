package news.sprots.alex.sportsnews.presentation.ui.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import news.sprots.alex.sportsnews.App;
import news.sprots.alex.sportsnews.R;
import news.sprots.alex.sportsnews.presentation.mvp.presenters.CategoryPresenter;
import news.sprots.alex.sportsnews.presentation.mvp.views.BaseMvpView;
import news.sprots.alex.sportsnews.presentation.mvp.views.CategoryView;


public class CybersportFragment extends BaseFragment<CategoryView, CategoryPresenter> {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((App) getActivity().getApplication()).getAppComponent().inject(this);

        return inflater.inflate(R.layout.fragment_cybersport, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        mvpPresenter.onLoadArticleForCategory("cybersport");
    }
}
