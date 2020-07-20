package com.example.tmdb_dagger2.repository;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.tmdb_dagger2.MyRetroApplication;
import com.example.tmdb_dagger2.di.APIComponent;
import com.example.tmdb_dagger2.model.MovieInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/tmdb_dagger2/repository/RetrofitRepository;", "", "()V", "postInfoMutableList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/tmdb_dagger2/model/MovieInfo;", "getPostInfoMutableList", "()Landroidx/lifecycle/MutableLiveData;", "setPostInfoMutableList", "(Landroidx/lifecycle/MutableLiveData;)V", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "fetchPostInfoList", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class RetrofitRepository {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> postInfoMutableList;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public retrofit2.Retrofit retrofit;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> getPostInfoMutableList() {
        return null;
    }
    
    public final void setPostInfoMutableList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    public final void setRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.MovieInfo> fetchPostInfoList() {
        return null;
    }
    
    public RetrofitRepository() {
        super();
    }
}