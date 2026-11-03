package androidx.datastore.core;

import defpackage.sb0;
import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CorruptionException extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(String str, Throwable th) {
        super(str, th);
        str.getClass();
    }

    public /* synthetic */ CorruptionException(String str, Throwable th, int i, sb0 sb0Var) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
