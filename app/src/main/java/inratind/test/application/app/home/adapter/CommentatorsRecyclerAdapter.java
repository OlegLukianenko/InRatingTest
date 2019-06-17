package inratind.test.application.app.home.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import inratind.test.application.R;
import inratind.test.application.app.home.adapter.viewholder.CommentatorsViewHolder;
import inratind.test.application.base.BaseRecyclerAdapter;
import inratind.test.application.data.retrofit.response.StatsStatistics;
import inratind.test.application.databinding.CommentatorsRecyclerItemBinding;

public class CommentatorsRecyclerAdapter extends BaseRecyclerAdapter<CommentatorsRecyclerItemBinding, StatsStatistics.Data, CommentatorsViewHolder> {

    @Inject
    public CommentatorsRecyclerAdapter() {

    }

    @Override
    protected CommentatorsRecyclerItemBinding getBinding(LayoutInflater inflater, ViewGroup parent) {
        return DataBindingUtil.inflate(inflater, R.layout.commentators_recycler_item, parent, false);
    }

    @Override
    protected CommentatorsViewHolder getViewHolder(CommentatorsRecyclerItemBinding binding) {
        binding.setAdapter(this);
        return new CommentatorsViewHolder(binding);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}
