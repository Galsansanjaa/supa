package androidx.core.util;

import defpackage.a10;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidXConsumerKt {
    public static final <T> Consumer<T> asAndroidXConsumer(a10 a10Var) {
        return new AndroidXContinuationConsumer(a10Var);
    }
}
