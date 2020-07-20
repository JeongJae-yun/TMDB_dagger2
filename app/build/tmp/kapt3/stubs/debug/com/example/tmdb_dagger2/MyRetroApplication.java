package com.example.tmdb_dagger2;

import android.app.Application;
import android.content.Context;
import com.example.tmdb_dagger2.di.APIComponent;
import com.example.tmdb_dagger2.di.APIModule;
import com.example.tmdb_dagger2.di.DaggerAPIComponent;
import com.example.tmdb_dagger2.repository.APIURL;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/example/tmdb_dagger2/MyRetroApplication;", "Landroid/app/Application;", "()V", "getMyComponent", "Lcom/example/tmdb_dagger2/di/APIComponent;", "initDaggerComponent", "onCreate", "", "Companion", "app_debug"})
public final class MyRetroApplication extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private static android.content.Context ctx;
    @org.jetbrains.annotations.NotNull()
    public static com.example.tmdb_dagger2.di.APIComponent apiComponent;
    public static final com.example.tmdb_dagger2.MyRetroApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tmdb_dagger2.di.APIComponent getMyComponent() {
        return null;
    }
    
    private final com.example.tmdb_dagger2.di.APIComponent initDaggerComponent() {
        return null;
    }
    
    public MyRetroApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/tmdb_dagger2/MyRetroApplication$Companion;", "", "()V", "apiComponent", "Lcom/example/tmdb_dagger2/di/APIComponent;", "getApiComponent", "()Lcom/example/tmdb_dagger2/di/APIComponent;", "setApiComponent", "(Lcom/example/tmdb_dagger2/di/APIComponent;)V", "ctx", "Landroid/content/Context;", "getCtx", "()Landroid/content/Context;", "setCtx", "(Landroid/content/Context;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Context getCtx() {
            return null;
        }
        
        public final void setCtx(@org.jetbrains.annotations.Nullable()
        android.content.Context p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.tmdb_dagger2.di.APIComponent getApiComponent() {
            return null;
        }
        
        public final void setApiComponent(@org.jetbrains.annotations.NotNull()
        com.example.tmdb_dagger2.di.APIComponent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}