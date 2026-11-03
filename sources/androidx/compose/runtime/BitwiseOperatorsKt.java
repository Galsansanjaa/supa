package androidx.compose.runtime;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BitwiseOperatorsKt {
    public static final int rol(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    public static final long rol(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    public static final int ror(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    public static final long ror(long j, int i) {
        return Long.rotateRight(j, i);
    }
}
