package androidx.compose.runtime.composer.linkbuffer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class GroupHandleKt {
    public static final long NULL_GROUP_HANDLE = -1;

    public static final int getContext(long j) {
        return (int) (j >>> 32);
    }

    public static final int getGroup(long j) {
        return (int) j;
    }

    public static final long makeGroupHandle(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long makeGroupHandle(int i, int i2, int i3) {
        long j;
        long j2 = 4294967295L;
        if (i3 >= 0) {
            j = i2 << 32;
            j2 = 4294967295L & i3;
        } else {
            j = i << 32;
        }
        return j | j2;
    }
}
