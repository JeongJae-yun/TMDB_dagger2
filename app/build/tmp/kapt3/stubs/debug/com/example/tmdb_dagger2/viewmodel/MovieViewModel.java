package com.example.tmdb_dagger2.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.tmdb_dagger2.model.MovieInfo;
import com.example.tmdb_dagger2.repository.RetrofitRepository;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tmdb_dagger2/viewmodel/MovieViewModel;", "Landroidx/lifecycle/ViewModel;", "retrofitRepository", "Lcom/example/tmdb_dagger2/repository/RetrofitRepository;", "(Lcom/example/tmdb_dagger2/repository/RetrofitRepository;)V", "postInfoLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/tmdb_dagger2/model/MovieInfo;", "getPostInfoLiveData", "()Landroidx/lifecycle/LiveData;", "setPostInfoLiveData", "(Landroidx/lifecycle/LiveData;)V", "getRetrofitRepository", "()Lcom/example/tmdb_dagger2/repository/RetrofitRepository;", "setRetrofitRepository", "fetchPostInfoFromRepository", "", "app_debug"})
public final class MovieViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.example.tmdb_dagger2.repository.RetrofitRepository retrofitRepository;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.MovieInfo> postInfoLiveData;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tmdb_dagger2.repository.RetrofitRepository getRetrofitRepository() {
        return null;
    }
    
    public final void setRetrofitRepository(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.repository.RetrofitRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.MovieInfo> getPostInfoLiveData() {
        return null;
    }
    
    public final void setPostInfoLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.MovieInfo> p0) {
    }
    
    private final void fetchPostInfoFromRepository() {
    }
    
    public MovieViewModel(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.repository.RetrofitRepository retrofitRepository) {
        super();
    }
}