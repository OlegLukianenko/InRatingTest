// Generated by Dagger (https://google.github.io/dagger).
package inratind.test.application.app.home.adapter;

import dagger.internal.Factory;

public final class CommentatorsRecyclerAdapter_Factory
    implements Factory<CommentatorsRecyclerAdapter> {
  private static final CommentatorsRecyclerAdapter_Factory INSTANCE =
      new CommentatorsRecyclerAdapter_Factory();

  @Override
  public CommentatorsRecyclerAdapter get() {
    return provideInstance();
  }

  public static CommentatorsRecyclerAdapter provideInstance() {
    return new CommentatorsRecyclerAdapter();
  }

  public static CommentatorsRecyclerAdapter_Factory create() {
    return INSTANCE;
  }

  public static CommentatorsRecyclerAdapter newCommentatorsRecyclerAdapter() {
    return new CommentatorsRecyclerAdapter();
  }
}