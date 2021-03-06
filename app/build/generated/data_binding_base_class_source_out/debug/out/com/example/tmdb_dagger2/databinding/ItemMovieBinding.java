// Generated by data binding compiler. Do not edit!
package com.example.tmdb_dagger2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.tmdb_dagger2.R;
import com.example.tmdb_dagger2.model.data.MovieItem;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemMovieBinding extends ViewDataBinding {
  @NonNull
  public final CardView cvPopular;

  @NonNull
  public final ImageView ivPoster;

  @Bindable
  protected MovieItem mResultmodel;

  protected ItemMovieBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cvPopular, ImageView ivPoster) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cvPopular = cvPopular;
    this.ivPoster = ivPoster;
  }

  public abstract void setResultmodel(@Nullable MovieItem resultmodel);

  @Nullable
  public MovieItem getResultmodel() {
    return mResultmodel;
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_movie, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemMovieBinding>inflateInternal(inflater, R.layout.item_movie, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_movie, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemMovieBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemMovieBinding>inflateInternal(inflater, R.layout.item_movie, null, false, component);
  }

  public static ItemMovieBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemMovieBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemMovieBinding)bind(component, view, R.layout.item_movie);
  }
}
