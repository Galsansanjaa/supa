package androidx.compose.foundation.text.input.internal;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class IntIntervalTreeKt {
    public static final int LeftVisited = 1;
    public static final int RightVisited = 2;
    public static final int TreeColorBlack = 1;
    public static final int TreeColorRed = 0;
    public static final int Unvisited = 0;

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}
