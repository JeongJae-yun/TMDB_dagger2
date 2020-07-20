package com.example.tmdb_dagger2.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.example.tmdb_dagger2.R;
import com.example.tmdb_dagger2.BR;
import com.example.tmdb_dagger2.databinding.ItemMovieBinding;
import com.example.tmdb_dagger2.model.data.NowPlayItem;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016JR\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/example/tmdb_dagger2/view/MovieListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/tmdb_dagger2/view/MovieListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "nowplayItemList", "Ljava/util/ArrayList;", "Lcom/example/tmdb_dagger2/model/data/NowPlayItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAdapterList", "id", "adult", "", "backdropPath", "", "originalLanguage", "originalTitle", "overview", "posterPath", "releaseDate", "title", "ViewHolder", "app_debug"})
public final class MovieListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.tmdb_dagger2.view.MovieListAdapter.ViewHolder> {
    private java.util.ArrayList<com.example.tmdb_dagger2.model.data.NowPlayItem> nowplayItemList;
    private android.content.Context context;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.tmdb_dagger2.view.MovieListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.view.MovieListAdapter.ViewHolder holder, int position) {
    }
    
    public final void setAdapterList(int id, boolean adult, @org.jetbrains.annotations.Nullable()
    java.lang.String backdropPath, @org.jetbrains.annotations.NotNull()
    java.lang.String originalLanguage, @org.jetbrains.annotations.NotNull()
    java.lang.String originalTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath, @org.jetbrains.annotations.NotNull()
    java.lang.String releaseDate, @org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public MovieListAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/tmdb_dagger2/view/MovieListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/tmdb_dagger2/databinding/ItemMovieBinding;", "(Lcom/example/tmdb_dagger2/view/MovieListAdapter;Lcom/example/tmdb_dagger2/databinding/ItemMovieBinding;)V", "bind", "", "data", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.tmdb_dagger2.databinding.ItemMovieBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        java.lang.Object data) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.tmdb_dagger2.databinding.ItemMovieBinding binding) {
            super(null);
        }
    }
}