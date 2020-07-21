package com.example.tmdb_dagger2.repository;

import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.example.tmdb_dagger2.MyRetroApplication;
import com.example.tmdb_dagger2.di.APIComponent;
import com.example.tmdb_dagger2.model.DetailInfo;
import com.example.tmdb_dagger2.model.MovieInfo;
import com.example.tmdb_dagger2.model.SearchInfo;
import com.example.tmdb_dagger2.model.SimilarInfo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050&2\u0006\u0010\'\u001a\u00020(J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0&J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0&J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120&2\u0006\u0010,\u001a\u00020-J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160&2\u0006\u0010\'\u001a\u00020(J\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0&J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u000b0&R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\tR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00062"}, d2 = {"Lcom/example/tmdb_dagger2/repository/RetrofitRepository;", "", "()V", "postDetailMutableList", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/tmdb_dagger2/model/DetailInfo;", "getPostDetailMutableList", "()Landroidx/lifecycle/MutableLiveData;", "setPostDetailMutableList", "(Landroidx/lifecycle/MutableLiveData;)V", "postInfoMutableList", "Lcom/example/tmdb_dagger2/model/MovieInfo;", "getPostInfoMutableList", "setPostInfoMutableList", "postPopularMutableList", "getPostPopularMutableList", "setPostPopularMutableList", "postSearchMutableList", "Lcom/example/tmdb_dagger2/model/SearchInfo;", "getPostSearchMutableList", "setPostSearchMutableList", "postSimilarMutableList", "Lcom/example/tmdb_dagger2/model/SimilarInfo;", "getPostSimilarMutableList", "setPostSimilarMutableList", "postTopRatedMutableList", "getPostTopRatedMutableList", "setPostTopRatedMutableList", "postUpComingMutableList", "getPostUpComingMutableList", "setPostUpComingMutableList", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "setRetrofit", "(Lretrofit2/Retrofit;)V", "fetchDetailInfoList", "Landroidx/lifecycle/LiveData;", "id", "", "fetchNowPlayInfoList", "fetchPopularInfoList", "fetchSearchInfoList", "query", "", "fetchSimilarInfoList", "fetchTopRatedInfoList", "fetchUpComingInfoList", "Companion", "app_debug"})
public final class RetrofitRepository {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> postInfoMutableList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> postUpComingMutableList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> postPopularMutableList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> postTopRatedMutableList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.DetailInfo> postDetailMutableList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.SimilarInfo> postSimilarMutableList;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.SearchInfo> postSearchMutableList;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public retrofit2.Retrofit retrofit;
    private static final java.lang.String apikey = "dd3529cb48a78d9d2e775be63596398a";
    public static final com.example.tmdb_dagger2.repository.RetrofitRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> getPostInfoMutableList() {
        return null;
    }
    
    public final void setPostInfoMutableList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> getPostUpComingMutableList() {
        return null;
    }
    
    public final void setPostUpComingMutableList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> getPostPopularMutableList() {
        return null;
    }
    
    public final void setPostPopularMutableList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> getPostTopRatedMutableList() {
        return null;
    }
    
    public final void setPostTopRatedMutableList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.MovieInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.DetailInfo> getPostDetailMutableList() {
        return null;
    }
    
    public final void setPostDetailMutableList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.DetailInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.SimilarInfo> getPostSimilarMutableList() {
        return null;
    }
    
    public final void setPostSimilarMutableList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.SimilarInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.SearchInfo> getPostSearchMutableList() {
        return null;
    }
    
    public final void setPostSearchMutableList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.tmdb_dagger2.model.SearchInfo> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofit() {
        return null;
    }
    
    public final void setRetrofit(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.MovieInfo> fetchNowPlayInfoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.MovieInfo> fetchUpComingInfoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.MovieInfo> fetchPopularInfoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.MovieInfo> fetchTopRatedInfoList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.DetailInfo> fetchDetailInfoList(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.SimilarInfo> fetchSimilarInfoList(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tmdb_dagger2.model.SearchInfo> fetchSearchInfoList(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    public RetrofitRepository() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/tmdb_dagger2/repository/RetrofitRepository$Companion;", "", "()V", "apikey", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}