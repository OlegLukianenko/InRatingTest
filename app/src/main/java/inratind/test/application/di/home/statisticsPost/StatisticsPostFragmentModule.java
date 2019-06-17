package inratind.test.application.di.home.statisticsPost;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import inratind.test.application.app.home.StatisticsPostFragment;
import inratind.test.application.app.home.adapter.CommentatorsRecyclerAdapter;
import inratind.test.application.app.home.adapter.LikersRecyclerAdapter;
import inratind.test.application.app.home.adapter.MentionsRecyclerAdapter;
import inratind.test.application.viewmodel.StatisticsPostFragmentViewModel;

@Module
public class StatisticsPostFragmentModule {

    @Provides
    StatisticsPostFragmentViewModel provideViewModel(StatisticsPostFragment fragment, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(fragment, factory).get(StatisticsPostFragmentViewModel.class);
    }

    @Provides
    LikersRecyclerAdapter provideUserAdapter() {
        return new LikersRecyclerAdapter();
    }

    @Provides
    CommentatorsRecyclerAdapter provideCommentatorsAdapter() {
        return new CommentatorsRecyclerAdapter();
    }

    @Provides
    MentionsRecyclerAdapter provideMentionsRecyclerAdapter() {
        return new MentionsRecyclerAdapter();
    }

}
