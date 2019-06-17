package inratind.test.application.di.home.statisticsPost;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import inratind.test.application.app.home.StatisticsPostFragment;

@Subcomponent(modules = StatisticsPostFragmentModule.class)
public interface StatisticsPostFragmentComponent extends AndroidInjector<StatisticsPostFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StatisticsPostFragment> {}
}

