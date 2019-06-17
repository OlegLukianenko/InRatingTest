package inratind.test.application.app.home.adapter.viewholder;

import inratind.test.application.base.BaseViewHolder;
import inratind.test.application.data.retrofit.response.StatsStatistics;
import inratind.test.application.databinding.MentionsRecyclerItemBinding;

public class MentionsViewHolder extends BaseViewHolder<MentionsRecyclerItemBinding, StatsStatistics.Data> {

    public MentionsViewHolder(MentionsRecyclerItemBinding binding) {
        super(binding);
    }

    @Override
    public void bind(StatsStatistics.Data data) {
        getBinding().setData(data);
    }
}
