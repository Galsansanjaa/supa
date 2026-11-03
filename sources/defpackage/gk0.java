package defpackage;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class gk0 {
    public final long a;
    public final long b;

    public gk0(long j, long j2) {
        if (j2 == 0) {
            this.a = 0L;
            this.b = 1L;
        } else {
            this.a = j;
            this.b = j2;
        }
    }

    public final String toString() {
        return this.a + DomExceptionUtils.SEPARATOR + this.b;
    }
}
