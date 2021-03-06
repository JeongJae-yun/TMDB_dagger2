// Generated by Dagger (https://dagger.dev).
package com.example.tmdb_dagger2.repository;

import dagger.MembersInjector;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitRepository_MembersInjector implements MembersInjector<RetrofitRepository> {
  private final Provider<Retrofit> retrofitProvider;

  public RetrofitRepository_MembersInjector(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  public static MembersInjector<RetrofitRepository> create(Provider<Retrofit> retrofitProvider) {
    return new RetrofitRepository_MembersInjector(retrofitProvider);}

  @Override
  public void injectMembers(RetrofitRepository instance) {
    injectRetrofit(instance, retrofitProvider.get());
  }

  public static void injectRetrofit(RetrofitRepository instance, Retrofit retrofit) {
    instance.retrofit = retrofit;
  }
}
