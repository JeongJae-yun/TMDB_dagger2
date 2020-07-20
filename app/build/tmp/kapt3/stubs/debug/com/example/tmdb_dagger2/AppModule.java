package com.example.tmdb_dagger2;

import dagger.Module;
import dagger.Provides;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0003H\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\t"}, d2 = {"Lcom/example/tmdb_dagger2/AppModule;", "", "myRetroApplication", "Lcom/example/tmdb_dagger2/MyRetroApplication;", "(Lcom/example/tmdb_dagger2/MyRetroApplication;)V", "getMyRetroApplication", "()Lcom/example/tmdb_dagger2/MyRetroApplication;", "setMyRetroApplication", "provideMyRetroApplication", "app_debug"})
@dagger.Module()
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    private com.example.tmdb_dagger2.MyRetroApplication myRetroApplication;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.tmdb_dagger2.MyRetroApplication provideMyRetroApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tmdb_dagger2.MyRetroApplication getMyRetroApplication() {
        return null;
    }
    
    public final void setMyRetroApplication(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.MyRetroApplication p0) {
    }
    
    public AppModule(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.MyRetroApplication myRetroApplication) {
        super();
    }
}