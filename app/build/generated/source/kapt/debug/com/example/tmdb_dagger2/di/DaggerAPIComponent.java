// Generated by Dagger (https://dagger.dev).
package com.example.tmdb_dagger2.di;

import com.example.tmdb_dagger2.AppModule;
import com.example.tmdb_dagger2.repository.RetrofitRepository;
import com.example.tmdb_dagger2.repository.RetrofitRepository_MembersInjector;
import com.example.tmdb_dagger2.view.MovieFragment;
import com.example.tmdb_dagger2.viewmodel.MovieViewModel;
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory;
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAPIComponent implements APIComponent {
  private final APIModule aPIModule;

  private Provider<GsonConverterFactory> provideGSONProvider;

  private Provider<OkHttpClient> provideOKHttpClientProvider;

  private Provider<Retrofit> provideRetrofitProvider;

  private DaggerAPIComponent(APIModule aPIModuleParam) {
    this.aPIModule = aPIModuleParam;
    initialize(aPIModuleParam);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final APIModule aPIModuleParam) {
    this.provideGSONProvider = DoubleCheck.provider(APIModule_ProvideGSONFactory.create(aPIModuleParam));
    this.provideOKHttpClientProvider = DoubleCheck.provider(APIModule_ProvideOKHttpClientFactory.create(aPIModuleParam));
    this.provideRetrofitProvider = DoubleCheck.provider(APIModule_ProvideRetrofitFactory.create(aPIModuleParam, provideGSONProvider, provideOKHttpClientProvider));
  }

  @Override
  public void inject(RetrofitRepository retrofitRepository) {
    injectRetrofitRepository(retrofitRepository);}

  @Override
  public void inject(MovieViewModel movieViewModel) {
  }

  @Override
  public void inject(MovieFragment movieFragment) {
  }

  @Override
  public void inject(MovieViewModelFactory movieViewModelFactory) {
    injectMovieViewModelFactory(movieViewModelFactory);}

  private RetrofitRepository injectRetrofitRepository(RetrofitRepository instance) {
    RetrofitRepository_MembersInjector.injectRetrofit(instance, provideRetrofitProvider.get());
    return instance;
  }

  private MovieViewModelFactory injectMovieViewModelFactory(MovieViewModelFactory instance) {
    MovieViewModelFactory_MembersInjector.injectRetrofitRepository(instance, APIModule_ProvideRetroRepositoryFactory.provideRetroRepository(aPIModule));
    return instance;
  }

  public static final class Builder {
    private APIModule aPIModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder aPIModule(APIModule aPIModule) {
      this.aPIModule = Preconditions.checkNotNull(aPIModule);
      return this;
    }

    public APIComponent build() {
      Preconditions.checkBuilderRequirement(aPIModule, APIModule.class);
      return new DaggerAPIComponent(aPIModule);
    }
  }
}
