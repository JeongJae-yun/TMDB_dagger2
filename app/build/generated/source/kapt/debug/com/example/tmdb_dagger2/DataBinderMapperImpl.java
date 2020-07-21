package com.example.tmdb_dagger2;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.tmdb_dagger2.databinding.ActivityDetailBindingImpl;
import com.example.tmdb_dagger2.databinding.ActivitySearchBindingImpl;
import com.example.tmdb_dagger2.databinding.FragmentMovieBindingImpl;
import com.example.tmdb_dagger2.databinding.ItemMovieBindingImpl;
import com.example.tmdb_dagger2.databinding.ItemMovieSearchBindingImpl;
import com.example.tmdb_dagger2.databinding.ItemMovieSimilarBindingImpl;
import com.example.tmdb_dagger2.databinding.ItemPopularMovieBindingImpl;
import com.example.tmdb_dagger2.databinding.ItemTopratedMovieBindingImpl;
import com.example.tmdb_dagger2.databinding.ItemUpcomingMovieBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAIL = 1;

  private static final int LAYOUT_ACTIVITYSEARCH = 2;

  private static final int LAYOUT_FRAGMENTMOVIE = 3;

  private static final int LAYOUT_ITEMMOVIE = 4;

  private static final int LAYOUT_ITEMMOVIESEARCH = 5;

  private static final int LAYOUT_ITEMMOVIESIMILAR = 6;

  private static final int LAYOUT_ITEMPOPULARMOVIE = 7;

  private static final int LAYOUT_ITEMTOPRATEDMOVIE = 8;

  private static final int LAYOUT_ITEMUPCOMINGMOVIE = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.activity_detail, LAYOUT_ACTIVITYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.activity_search, LAYOUT_ACTIVITYSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.fragment_movie, LAYOUT_FRAGMENTMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.item_movie, LAYOUT_ITEMMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.item_movie_search, LAYOUT_ITEMMOVIESEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.item_movie_similar, LAYOUT_ITEMMOVIESIMILAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.item_popular_movie, LAYOUT_ITEMPOPULARMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.item_toprated_movie, LAYOUT_ITEMTOPRATEDMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.tmdb_dagger2.R.layout.item_upcoming_movie, LAYOUT_ITEMUPCOMINGMOVIE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAIL: {
          if ("layout/activity_detail_0".equals(tag)) {
            return new ActivityDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCH: {
          if ("layout/activity_search_0".equals(tag)) {
            return new ActivitySearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMOVIE: {
          if ("layout/fragment_movie_0".equals(tag)) {
            return new FragmentMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIE: {
          if ("layout/item_movie_0".equals(tag)) {
            return new ItemMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIESEARCH: {
          if ("layout/item_movie_search_0".equals(tag)) {
            return new ItemMovieSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIESIMILAR: {
          if ("layout/item_movie_similar_0".equals(tag)) {
            return new ItemMovieSimilarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie_similar is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOPULARMOVIE: {
          if ("layout/item_popular_movie_0".equals(tag)) {
            return new ItemPopularMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_popular_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTOPRATEDMOVIE: {
          if ("layout/item_toprated_movie_0".equals(tag)) {
            return new ItemTopratedMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_toprated_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUPCOMINGMOVIE: {
          if ("layout/item_upcoming_movie_0".equals(tag)) {
            return new ItemUpcomingMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_upcoming_movie is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "detailInfo");
      sKeys.put(2, "resultmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_detail_0", com.example.tmdb_dagger2.R.layout.activity_detail);
      sKeys.put("layout/activity_search_0", com.example.tmdb_dagger2.R.layout.activity_search);
      sKeys.put("layout/fragment_movie_0", com.example.tmdb_dagger2.R.layout.fragment_movie);
      sKeys.put("layout/item_movie_0", com.example.tmdb_dagger2.R.layout.item_movie);
      sKeys.put("layout/item_movie_search_0", com.example.tmdb_dagger2.R.layout.item_movie_search);
      sKeys.put("layout/item_movie_similar_0", com.example.tmdb_dagger2.R.layout.item_movie_similar);
      sKeys.put("layout/item_popular_movie_0", com.example.tmdb_dagger2.R.layout.item_popular_movie);
      sKeys.put("layout/item_toprated_movie_0", com.example.tmdb_dagger2.R.layout.item_toprated_movie);
      sKeys.put("layout/item_upcoming_movie_0", com.example.tmdb_dagger2.R.layout.item_upcoming_movie);
    }
  }
}
