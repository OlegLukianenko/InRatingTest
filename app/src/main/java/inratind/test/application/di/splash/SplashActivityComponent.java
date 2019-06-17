package inratind.test.application.di.splash;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import inratind.test.application.app.splash.SplashActivity;

@Subcomponent(modules = SplashModule.class)
public interface SplashActivityComponent extends AndroidInjector<SplashActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<SplashActivity> {}

}


