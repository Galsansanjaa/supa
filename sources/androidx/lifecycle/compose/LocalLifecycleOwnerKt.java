package androidx.lifecycle.compose;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.lifecycle.LifecycleOwner;
import defpackage.t21;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LocalLifecycleOwnerKt {
    private static final ProvidableCompositionLocal<LifecycleOwner> LocalLifecycleOwner = CompositionLocalKt.staticCompositionLocalOf(new t21(18));

    public static final LifecycleOwner LocalLifecycleOwner$lambda$0() {
        throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
    }

    public static /* synthetic */ LifecycleOwner a() {
        return LocalLifecycleOwner$lambda$0();
    }

    public static final ProvidableCompositionLocal<LifecycleOwner> getLocalLifecycleOwner() {
        return LocalLifecycleOwner;
    }
}
