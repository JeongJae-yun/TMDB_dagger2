package com.example.tmdb_dagger2.di;

import com.example.tmdb_dagger2.AppModule;
import com.example.tmdb_dagger2.repository.RetrofitRepository;
import com.example.tmdb_dagger2.view.MovieFragment;
import com.example.tmdb_dagger2.viewmodel.MovieViewModel;
import com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory;
import dagger.Component;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/example/tmdb_dagger2/di/APIComponent;", "", "inject", "", "retrofitRepository", "Lcom/example/tmdb_dagger2/repository/RetrofitRepository;", "movieFragment", "Lcom/example/tmdb_dagger2/view/MovieFragment;", "movieViewModel", "Lcom/example/tmdb_dagger2/viewmodel/MovieViewModel;", "movieViewModelFactory", "Lcom/example/tmdb_dagger2/viewmodel/MovieViewModelFactory;", "app_debug"})
@dagger.Component(modules = {com.example.tmdb_dagger2.AppModule.class, com.example.tmdb_dagger2.di.APIModule.class})
@javax.inject.Singleton()
public abstract interface APIComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.repository.RetrofitRepository retrofitRepository);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.viewmodel.MovieViewModel movieViewModel);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.view.MovieFragment movieFragment);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.viewmodel.MovieViewModelFactory movieViewModelFactory);
}