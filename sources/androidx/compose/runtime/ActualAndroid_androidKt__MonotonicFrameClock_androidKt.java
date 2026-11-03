package androidx.compose.runtime;

import android.os.Looper;
import defpackage.co2;
import defpackage.hd0;
import defpackage.nb1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final /* synthetic */ class ActualAndroid_androidKt__MonotonicFrameClock_androidKt {
    private static final nb1 DefaultMonotonicFrameClock$delegate = new co2(new Object());
    private static final boolean DisallowDefaultMonotonicFrameClock = false;

    /* JADX INFO: Access modifiers changed from: private */
    public static final MonotonicFrameClock DefaultMonotonicFrameClock_delegate$lambda$0$ActualAndroid_androidKt__MonotonicFrameClock_androidKt() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : FallbackFrameClock.INSTANCE;
    }

    public static final MonotonicFrameClock getDefaultMonotonicFrameClock() {
        return (MonotonicFrameClock) DefaultMonotonicFrameClock$delegate.getValue();
    }

    @hd0
    public static /* synthetic */ void getDefaultMonotonicFrameClock$annotations() {
    }
}
