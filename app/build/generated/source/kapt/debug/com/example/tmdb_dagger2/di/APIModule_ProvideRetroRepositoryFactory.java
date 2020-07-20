// Generated by Dagger (https://dagger.dev).
package com.example.tmdb_dagger2.di;

import com.example.tmdb_dagger2.repository.RetrofitRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIModule_ProvideRetroRepositoryFactory implements Factory<RetrofitRepository> {
  private final APIModule module;

  public APIModule_ProvideRetroRepositoryFactory(APIModule module) {
    this.module = module;
  }

  @Override
  public RetrofitRepository get() {
    return provideRetroRepository(module);
  }

  public static APIModule_ProvideRetroRepositoryFactory create(APIModule module) {
    return new APIModule_ProvideRetroRepositoryFactory(module);
  }

  public static RetrofitRepository provideRetroRepository(APIModule instance) {
    return Preconditions.checkNotNull(instance.provideRetroRepository(), "Cannot return null from a non-@Nullable @Provides method");
  }
}