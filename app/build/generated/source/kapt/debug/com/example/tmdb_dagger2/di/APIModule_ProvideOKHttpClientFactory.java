// Generated by Dagger (https://dagger.dev).
package com.example.tmdb_dagger2.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIModule_ProvideOKHttpClientFactory implements Factory<OkHttpClient> {
  private final APIModule module;

  public APIModule_ProvideOKHttpClientFactory(APIModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return provideOKHttpClient(module);
  }

  public static APIModule_ProvideOKHttpClientFactory create(APIModule module) {
    return new APIModule_ProvideOKHttpClientFactory(module);
  }

  public static OkHttpClient provideOKHttpClient(APIModule instance) {
    return Preconditions.checkNotNull(instance.provideOKHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
