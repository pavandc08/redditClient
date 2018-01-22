package app.pavandc.redditclient.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import app.pavandc.redditclient.R;
import app.pavandc.redditclient.adapters.MainAdapter;
import app.pavandc.redditclient.model.RedditObject;
import app.pavandc.redditclient.presenters.MainPresenter;
import app.pavandc.redditclient.util.NetworkUtils;
import app.pavandc.redditclient.views.MainView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView {

    @BindView(R.id.recycler_view_posts)
    RecyclerView recyclerView;
    @BindView(R.id.progress)
    ProgressBar progressBar;
    @BindView(R.id.textview_error)
    TextView errorTextView;
    @BindView(R.id.error_view)
    View errorView;

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenter(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        recyclerView.setVisibility(View.GONE);
    }

    @Override
    public void hideProgress() {
        recyclerView.setVisibility(View.VISIBLE);
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setItems(RedditObject redditObject) {
        errorView.setVisibility(View.GONE);
        MainAdapter adapter  = (MainAdapter) recyclerView.getAdapter();
        if(adapter == null) {
            MainAdapter mainAdapter = new MainAdapter(redditObject, presenter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(mainAdapter);
        } else {
            adapter.updateDataSet(redditObject);
        }
    }

    @Override
    public void showError(int message) {
        recyclerView.setVisibility(View.GONE);
        errorView.setVisibility(View.VISIBLE);
        errorTextView.setText(message);
    }

    @Override
    public boolean isConnected() {
        return NetworkUtils.isConnected(this);
    }
}
