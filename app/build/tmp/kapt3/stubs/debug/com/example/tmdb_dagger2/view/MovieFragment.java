package com.example.tmdb_dagger2.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import com.example.tmdb_dagger2.R;
import com.example.tmdb_dagger2.databinding.FragmentMovieBinding;
import com.example.tmdb_dagger2.model.MovieInfo;
import com.example.tmdb_dagger2.viewmodel.MovieViewModel;
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory;
import kotlinx.android.synthetic.main.fragment_movie.view.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0002\u00a8\u0006\u0012"}, d2 = {"Lcom/example/tmdb_dagger2/view/MovieFragment;", "Landroidx/fragment/app/Fragment;", "()V", "fetchRetroInfo", "", "initAdapter", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setAdapter", "Companion", "app_debug"})
public final class MovieFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public static com.example.tmdb_dagger2.viewmodel.MovieViewModel movieViewModel;
    @org.jetbrains.annotations.NotNull()
    public static android.view.View fragmentView;
    @org.jetbrains.annotations.NotNull()
    public static com.example.tmdb_dagger2.view.MovieListAdapter listAdapter;
    public static final com.example.tmdb_dagger2.view.MovieFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void initViewModel() {
    }
    
    public final void fetchRetroInfo() {
    }
    
    private final void setAdapter() {
    }
    
    private final void initAdapter() {
    }
    
    public MovieFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lcom/example/tmdb_dagger2/view/MovieFragment$Companion;", "", "()V", "fragmentView", "Landroid/view/View;", "getFragmentView", "()Landroid/view/View;", "setFragmentView", "(Landroid/view/View;)V", "listAdapter", "Lcom/example/tmdb_dagger2/view/MovieListAdapter;", "getListAdapter", "()Lcom/example/tmdb_dagger2/view/MovieListAdapter;", "setListAdapter", "(Lcom/example/tmdb_dagger2/view/MovieListAdapter;)V", "movieViewModel", "Lcom/example/tmdb_dagger2/viewmodel/MovieViewModel;", "getMovieViewModel", "()Lcom/example/tmdb_dagger2/viewmodel/MovieViewModel;", "setMovieViewModel", "(Lcom/example/tmdb_dagger2/viewmodel/MovieViewModel;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.tmdb_dagger2.viewmodel.MovieViewModel getMovieViewModel() {
            return null;
        }
        
        public final void setMovieViewModel(@org.jetbrains.annotations.NotNull()
        com.example.tmdb_dagger2.viewmodel.MovieViewModel p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getFragmentView() {
            return null;
        }
        
        public final void setFragmentView(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.tmdb_dagger2.view.MovieListAdapter getListAdapter() {
            return null;
        }
        
        public final void setListAdapter(@org.jetbrains.annotations.NotNull()
        com.example.tmdb_dagger2.view.MovieListAdapter p0) {
        }
        
        private Companion() {
            super();
        }
    }
}