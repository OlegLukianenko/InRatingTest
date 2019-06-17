package inratind.test.application.app.home.adapter.viewholder;

import inratind.test.application.base.BaseViewHolder;
import inratind.test.application.data.retrofit.response.StatsStatistics;
import inratind.test.application.databinding.CommentatorsRecyclerItemBinding;

public class CommentatorsViewHolder extends BaseViewHolder<CommentatorsRecyclerItemBinding, StatsStatistics.Data> {

    public CommentatorsViewHolder(CommentatorsRecyclerItemBinding binding) {
        super(binding);
    }

    @Override
    public void bind(StatsStatistics.Data data) {
        getBinding().setData(data);
    }
}
