package inratind.test.application.di.app;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import inratind.test.application.app.App;

@Singleton
@Component( modules = {
        AppModule.class,
        ActivityBuilder.class,
        AndroidSupportInjectionModule.class,
        DataModule.class,
        RepositoryModule.class} )

public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(App app);

        AppComponent build();
    }

    void inject(App app);
}