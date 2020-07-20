package com.example.tmdb_dagger2.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\u0019\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010\u00a8\u0006!"}, d2 = {"Lcom/example/tmdb_dagger2/model/MovieInfo;", "", "dates", "Lcom/example/tmdb_dagger2/model/Dates;", "page", "", "results", "Ljava/util/ArrayList;", "Lcom/example/tmdb_dagger2/model/Result;", "Lkotlin/collections/ArrayList;", "total_pages", "total_results", "(Lcom/example/tmdb_dagger2/model/Dates;ILjava/util/ArrayList;II)V", "getDates", "()Lcom/example/tmdb_dagger2/model/Dates;", "getPage", "()I", "getResults", "()Ljava/util/ArrayList;", "getTotal_pages", "getTotal_results", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MovieInfo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tmdb_dagger2.model.Dates dates = null;
    private final int page = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.example.tmdb_dagger2.model.Result> results = null;
    private final int total_pages = 0;
    private final int total_results = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tmdb_dagger2.model.Dates getDates() {
        return null;
    }
    
    public final int getPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.tmdb_dagger2.model.Result> getResults() {
        return null;
    }
    
    public final int getTotal_pages() {
        return 0;
    }
    
    public final int getTotal_results() {
        return 0;
    }
    
    public MovieInfo(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.model.Dates dates, int page, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.tmdb_dagger2.model.Result> results, int total_pages, int total_results) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tmdb_dagger2.model.Dates component1() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.tmdb_dagger2.model.Result> component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tmdb_dagger2.model.MovieInfo copy(@org.jetbrains.annotations.NotNull()
    com.example.tmdb_dagger2.model.Dates dates, int page, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.tmdb_dagger2.model.Result> results, int total_pages, int total_results) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}