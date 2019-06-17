package inratind.test.application.di.viewmodel;

import dagger.Subcomponent;
import inratind.test.application.viewmodel.StatisticsPostFragmentViewModel;
import inratind.test.application.viewmodel.SplashActivityViewModel;

@Subcomponent
public interface ViewModelComponent {

    @Subcomponent.Builder
    interface Builder {
        ViewModelComponent build();
    }

    SplashActivityViewModel splashActivityViewModel();

    StatisticsPostFragmentViewModel statisticsPostFragmentViewModel();
}
