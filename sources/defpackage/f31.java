package defpackage;

import android.os.LocaleList;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.io.IOException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f31 implements ShouldPauseCallback, CallbackToFutureAdapter.Resolver, ShapeAppearanceModel.CornerSizeUnaryOperator {
    public static /* bridge */ /* synthetic */ LocaleList a(Object obj) {
        return (LocaleList) obj;
    }

    public static /* synthetic */ void b() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void e(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void f(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void g(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void h(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void j(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        CornerSize lambda$setShapeAppearanceModel$0;
        lambda$setShapeAppearanceModel$0 = MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
        return lambda$setShapeAppearanceModel$0;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        Object lambda$getForegroundInfoAsync$0;
        lambda$getForegroundInfoAsync$0 = ListenableWorker.lambda$getForegroundInfoAsync$0(completer);
        return lambda$getForegroundInfoAsync$0;
    }

    @Override // androidx.compose.runtime.ShouldPauseCallback
    public boolean shouldPause() {
        boolean applyPausedPrecomposition$lambda$0$0$0;
        applyPausedPrecomposition$lambda$0$0$0 = LayoutNodeSubcompositionsState.applyPausedPrecomposition$lambda$0$0$0();
        return applyPausedPrecomposition$lambda$0$0$0;
    }
}
