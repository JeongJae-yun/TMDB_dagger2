// Generated by Dagger (https://dagger.dev).
package com.example.tmdb_dagger2.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class APIModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final APIModule module;

  private final Provider<GsonConverterFactory> gsonConverterFactoryProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public APIModule_ProvideRetrofitFactory(APIModule module,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.gsonConverterFactoryProvider = gsonConverterFactoryProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, gsonConverterFactoryProvider.get(), okHttpClientProvider.get());
  }

  public static APIModule_ProvideRetrofitFactory create(APIModule module,
      Provider<GsonConverterFactory> gsonConverterFactoryProvider,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new APIModule_ProvideRetrofitFactory(module, gsonConverterFactoryProvider, okHttpClientProvider);
  }

  public static Retrofit provideRetrofit(APIModule instance,
      GsonConverterFactory gsonConverterFactory, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.provideRetrofit(gsonConverterFactory, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
