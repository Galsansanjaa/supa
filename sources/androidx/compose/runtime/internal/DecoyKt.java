package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import defpackage.k93;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DecoyKt {
    @ComposeCompilerApi
    public static final Void illegalDecoyCallException(String str) {
        throw new IllegalStateException(k93.m("Function ", str, " should have been replaced by compiler."));
    }
}
