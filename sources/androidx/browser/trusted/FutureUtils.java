package androidx.browser.trusted;

import androidx.concurrent.futures.ResolvableFuture;
import defpackage.se1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
class FutureUtils {
    private FutureUtils() {
    }

    public static <T> se1 immediateFailedFuture(Throwable th) {
        ResolvableFuture create = ResolvableFuture.create();
        create.setException(th);
        return create;
    }
}
