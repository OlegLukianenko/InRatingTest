package inratind.test.application.app.home.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import inratind.test.application.R;
import inratind.test.application.app.home.adapter.viewholder.LikersViewHolder;
import inratind.test.application.base.BaseRecyclerAdapter;
import inratind.test.application.data.retrofit.response.StatsStatistics;
import inratind.test.application.databinding.LikersRecyclerItemBinding;

public class LikersRecyclerAdapter extends BaseRecyclerAdapter<LikersRecyclerItemBinding, StatsStatistics.Data, LikersViewHolder> {

    @Inject
    public LikersRecyclerAdapter() {

    }

    @Override
    protected LikersRecyclerItemBinding getBinding(LayoutInflater inflater, ViewGroup parent) {
        return DataBindingUtil.inflate(inflater, R.layout.likers_recycler_item, parent, false);
    }

    @Override
    protected LikersViewHolder getViewHolder(LikersRecyclerItemBinding binding) {
        binding.setAdapter(this);
        return new LikersViewHolder(binding);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}