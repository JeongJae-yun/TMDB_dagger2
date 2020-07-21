package com.example.tmdb_dagger2.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.example.tmdb_dagger2.MyRetroApplication;
import com.example.tmdb_dagger2.di.APIComponent;
import com.example.tmdb_dagger2.di.APIModule;
import com.example.tmdb_dagger2.di.DaggerAPIComponent;
import com.example.tmdb_dagger2.repository.APIURL;
import com.example.tmdb_dagger2.repository.RetrofitRepository;
import com.example.tmdb_dagger2.view.Detail.DetailViewModel;
import com.example.tmdb_dagger2.view.Home.MovieViewModel;
import com.example.tmdb_dagger2.view.Search.SearchViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u000f\u001a\u0002H\u0010\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00100\u0013H\u0016\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/example/tmdb_dagger2/viewmodel/MovieViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "apiComponent", "Lcom/example/tmdb_dagger2/di/APIComponent;", "getApiComponent", "()Lcom/example/tmdb_dagger2/di/APIComponent;", "setApiComponent", "(Lcom/example/tmdb_dagger2/di/APIComponent;)V", "retrofitRepository", "Lcom/example/tmdb_dagger2/repository/RetrofitRepository;", "getRetrofitRepository", "()Lcom/example/tmdb_dagger2/repository/RetrofitRepository;", "setRetrofitRepository", "(Lcom/example/tmdb_dagger2/repository/RetrofitRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "initDaggerComponent", "", "app_debug"})
public final class MovieViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    public com.example.tmdb_dagger2.di.APIComponent apiComponent;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.tmdb_dagger2.repository.RetrofitRepository retrofitRepository;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tmdb_dagger2.di.APIComponent getApiComponent() {
        return null;
    }
    
    public final void setApiComponent(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.di.APIComponent p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tmdb_dagger2.repository.RetrofitRepository getRetrofitRepository() {
        return null;
    }
    
    public final void setRetrofitRepository(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.repository.RetrofitRepository p0) {
    }
    
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    public final void initDaggerComponent() {
    }
    
    public MovieViewModelFactory() {
        super();
    }
}