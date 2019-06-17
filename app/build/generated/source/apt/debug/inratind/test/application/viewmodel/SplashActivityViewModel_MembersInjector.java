// Generated by Dagger (https://google.github.io/dagger).
package inratind.test.application.viewmodel;

import dagger.MembersInjector;
import inratind.test.application.data.repository.RepositoryApi;
import javax.inject.Provider;

public final class SplashActivityViewModel_MembersInjector
    implements MembersInjector<SplashActivityViewModel> {
  private final Provider<RepositoryApi> repositoryApiProvider;

  public SplashActivityViewModel_MembersInjector(Provider<RepositoryApi> repositoryApiProvider) {
    this.repositoryApiProvider = repositoryApiProvider;
  }

  public static MembersInjector<SplashActivityViewModel> create(
      Provider<RepositoryApi> repositoryApiProvider) {
    return new SplashActivityViewModel_MembersInjector(repositoryApiProvider);
  }

  @Override
  public void injectMembers(SplashActivityViewModel instance) {
    injectRepositoryApi(instance, repositoryApiProvider.get());
  }

  public static void injectRepositoryApi(
      SplashActivityViewModel instance, RepositoryApi repositoryApi) {
    instance.repositoryApi = repositoryApi;
  }
}
