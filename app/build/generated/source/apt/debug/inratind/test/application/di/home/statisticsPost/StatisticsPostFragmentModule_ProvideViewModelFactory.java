// Generated by Dagger (https://google.github.io/dagger).
package inratind.test.application.di.home.statisticsPost;

import android.arch.lifecycle.ViewModelProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import inratind.test.application.app.home.StatisticsPostFragment;
import inratind.test.application.viewmodel.StatisticsPostFragmentViewModel;
import javax.inject.Provider;

public final class StatisticsPostFragmentModule_ProvideViewModelFactory
    implements Factory<StatisticsPostFragmentViewModel> {
  private final StatisticsPostFragmentModule module;

  private final Provider<StatisticsPostFragment> fragmentProvider;

  private final Provider<ViewModelProvider.Factory> factoryProvider;

  public StatisticsPostFragmentModule_ProvideViewModelFactory(
      StatisticsPostFragmentModule module,
      Provider<StatisticsPostFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    this.module = module;
    this.fragmentProvider = fragmentProvider;
    this.factoryProvider = factoryProvider;
  }

  @Override
  public StatisticsPostFragmentViewModel get() {
    return provideInstance(module, fragmentProvider, factoryProvider);
  }

  public static StatisticsPostFragmentViewModel provideInstance(
      StatisticsPostFragmentModule module,
      Provider<StatisticsPostFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return proxyProvideViewModel(module, fragmentProvider.get(), factoryProvider.get());
  }

  public static StatisticsPostFragmentModule_ProvideViewModelFactory create(
      StatisticsPostFragmentModule module,
      Provider<StatisticsPostFragment> fragmentProvider,
      Provider<ViewModelProvider.Factory> factoryProvider) {
    return new StatisticsPostFragmentModule_ProvideViewModelFactory(
        module, fragmentProvider, factoryProvider);
  }

  public static StatisticsPostFragmentViewModel proxyProvideViewModel(
      StatisticsPostFragmentModule instance,
      StatisticsPostFragment fragment,
      ViewModelProvider.Factory factory) {
    return Preconditions.checkNotNull(
        instance.provideViewModel(fragment, factory),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
