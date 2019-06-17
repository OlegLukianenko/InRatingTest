package inratind.test.application.app.home.adapter.viewholder;

import inratind.test.application.base.BaseViewHolder;
import inratind.test.application.data.retrofit.response.StatsStatistics;
import inratind.test.application.databinding.LikersRecyclerItemBinding;

public class LikersViewHolder extends BaseViewHolder <LikersRecyclerItemBinding, StatsStatistics.Data>{

    public LikersViewHolder(LikersRecyclerItemBinding binding) {
        super(binding);
    }

    @Override
    public void bind(StatsStatistics.Data data) {
        getBinding().setData(data);
    }
}
