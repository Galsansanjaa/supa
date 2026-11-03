package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fr3 extends RuntimeException {
    public fr3() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dq3, java.io.IOException] */
    public final dq3 a() {
        return new IOException(getMessage());
    }
}
