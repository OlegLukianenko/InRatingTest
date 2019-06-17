package inratind.test.application.di.splash;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;

import dagger.Module;
import dagger.Provides;
import inratind.test.application.app.splash.SplashActivity;
import inratind.test.application.viewmodel.SplashActivityViewModel;

@Module
public class SplashModule {

    @Provides
    SplashActivityViewModel provideSplashViewModel(SplashActivity activity, ViewModelProvider.Factory factory) {
        return ViewModelProviders.of(activity, factory).get(SplashActivityViewModel.class);
    }

}
