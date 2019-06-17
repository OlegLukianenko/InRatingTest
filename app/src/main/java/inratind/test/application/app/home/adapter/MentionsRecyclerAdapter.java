package inratind.test.application.app.home.adapter;

import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import javax.inject.Inject;

import inratind.test.application.R;
import inratind.test.application.app.home.adapter.viewholder.MentionsViewHolder;
import inratind.test.application.base.BaseRecyclerAdapter;
import inratind.test.application.data.retrofit.response.StatsStatistics;
import inratind.test.application.databinding.MentionsRecyclerItemBinding;

public class MentionsRecyclerAdapter extends BaseRecyclerAdapter<MentionsRecyclerItemBinding, StatsStatistics.Data, MentionsViewHolder> {

    @Inject
    public MentionsRecyclerAdapter() {

    }

    @Override
    protected MentionsRecyclerItemBinding getBinding(LayoutInflater inflater, ViewGroup parent) {
        return DataBindingUtil.inflate(inflater, R.layout.mentions_recycler_item, parent, false);
    }

    @Override
    protected MentionsViewHolder getViewHolder(MentionsRecyclerItemBinding binding) {
        binding.setAdapter(this);
        return new MentionsViewHolder(binding);
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }
}

