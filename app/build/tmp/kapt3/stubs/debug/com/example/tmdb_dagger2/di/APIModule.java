package com.example.tmdb_dagger2.di;

import com.example.tmdb_dagger2.repository.RetrofitRepository;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/tmdb_dagger2/di/APIModule;", "", "baseURL", "", "(Ljava/lang/String;)V", "provideGSON", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideOKHttpClient", "Lokhttp3/OkHttpClient;", "provideRetroRepository", "Lcom/example/tmdb_dagger2/repository/RetrofitRepository;", "provideRetrofit", "Lretrofit2/Retrofit;", "gsonConverterFactory", "okHttpClient", "app_debug"})
@dagger.Module()
public final class APIModule {
    private final java.lang.String baseURL = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOKHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.converter.gson.GsonConverterFactory provideGSON() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory gsonConverterFactory, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.tmdb_dagger2.repository.RetrofitRepository provideRetroRepository() {
        return null;
    }
    
    public APIModule(@org.jetbrains.annotations.NotNull()
    java.lang.String baseURL) {
        super();
    }
}