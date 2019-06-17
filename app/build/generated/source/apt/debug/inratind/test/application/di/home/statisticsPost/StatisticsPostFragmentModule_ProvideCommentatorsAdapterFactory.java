// Generated by Dagger (https://google.github.io/dagger).
package inratind.test.application.di.home.statisticsPost;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import inratind.test.application.app.home.adapter.CommentatorsRecyclerAdapter;

public final class StatisticsPostFragmentModule_ProvideCommentatorsAdapterFactory
    implements Factory<CommentatorsRecyclerAdapter> {
  private final StatisticsPostFragmentModule module;

  public StatisticsPostFragmentModule_ProvideCommentatorsAdapterFactory(
      StatisticsPostFragmentModule module) {
    this.module = module;
  }

  @Override
  public CommentatorsRecyclerAdapter get() {
    return provideInstance(module);
  }

  public static CommentatorsRecyclerAdapter provideInstance(StatisticsPostFragmentModule module) {
    return proxyProvideCommentatorsAdapter(module);
  }

  public static StatisticsPostFragmentModule_ProvideCommentatorsAdapterFactory create(
      StatisticsPostFragmentModule module) {
    return new StatisticsPostFragmentModule_ProvideCommentatorsAdapterFactory(module);
  }

  public static CommentatorsRecyclerAdapter proxyProvideCommentatorsAdapter(
      StatisticsPostFragmentModule instance) {
    return Preconditions.checkNotNull(
        instance.provideCommentatorsAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
