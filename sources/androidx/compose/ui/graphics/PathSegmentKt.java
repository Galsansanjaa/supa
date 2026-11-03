package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathSegment;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PathSegmentKt {
    private static final PathSegment DoneSegment = new PathSegment(PathSegment.Type.Done, new float[0], 0.0f);
    private static final PathSegment CloseSegment = new PathSegment(PathSegment.Type.Close, new float[0], 0.0f);

    public static final PathSegment getCloseSegment() {
        return CloseSegment;
    }

    public static final PathSegment getDoneSegment() {
        return DoneSegment;
    }
}
