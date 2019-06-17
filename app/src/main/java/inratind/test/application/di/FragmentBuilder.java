package inratind.test.application.di;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;
import inratind.test.application.app.home.StatisticsPostFragment;
import inratind.test.application.di.home.statisticsPost.StatisticsPostFragmentComponent;

@Module
public abstract class FragmentBuilder {

    @Binds
    @IntoMap
    @FragmentKey(StatisticsPostFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindUserFragment(StatisticsPostFragmentComponent.Builder builder);

}


