package app.pavandc.redditclient.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import app.pavandc.redditclient.R;
import app.pavandc.redditclient.model.RedditObject;
import app.pavandc.redditclient.presenters.MainPresenter;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by pavandc on 2018-01-21.
 */

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.PostViewHolder> {

    private RedditObject redditParentObject;
    private MainPresenter presenter;
    private List<RedditObject> mDataset;

    public MainAdapter(RedditObject redditObject, MainPresenter presenter) {
        this.redditParentObject = redditObject;
        this.presenter = presenter;
        mDataset = redditObject.getData().getChildren();
    }

    @Override
    public PostViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_item_post, parent, false);

        return  new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PostViewHolder holder, int position) {
        RedditObject redditObject = mDataset.get(position);
        if(isLast(position)) {
            presenter.paginate(redditParentObject.getData().getmAfter());
        }
        holder.postTitle.setText(mDataset.get(position).getData().getmTitle());
        holder.description.setText(mDataset.get(position).getData().getmAuthor());
        Picasso.with(holder.thumbnail.getContext())
                .load(redditObject.getData().getThumbnail())
                .error(R.drawable.ic_ninja_warrior)
                .into(holder.thumbnail);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public void updateDataSet(RedditObject redditObject) {
        mDataset.addAll(redditObject.getData().getChildren());
        redditParentObject = redditObject;
        redditParentObject.getData().setChildren(mDataset);
        notifyDataSetChanged();
    }

    private boolean isLast(int position) {
        return mDataset.get(position).getData().getmName().equals(redditParentObject.getData().getmAfter());
    }

    class  PostViewHolder extends  RecyclerView.ViewHolder {
        @BindView(R.id.post_title)
        TextView postTitle;
        @BindView(R.id.post_sub_title)
        TextView description;
        @BindView(R.id.post_image)
        ImageView thumbnail;

        PostViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
