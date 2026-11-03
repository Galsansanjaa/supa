package androidx.graphics.path;

import androidx.graphics.path.PathSegment;
import defpackage.lt;
import defpackage.v5;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PathIteratorImplKt {
    private static final PathSegment.Type[] PathSegmentTypes = PathSegment.Type.values();

    public static final /* synthetic */ PathSegment.Type[] access$getPathSegmentTypes$p() {
        return PathSegmentTypes;
    }

    public static final /* synthetic */ PathSegment.Type access$platformToAndroidXSegmentType(int i) {
        return platformToAndroidXSegmentType(i);
    }

    public static final PathSegment.Type platformToAndroidXSegmentType(int i) {
        switch (i) {
            case 0:
                return PathSegment.Type.Move;
            case 1:
                return PathSegment.Type.Line;
            case 2:
                return PathSegment.Type.Quadratic;
            case 3:
                return PathSegment.Type.Conic;
            case 4:
                return PathSegment.Type.Cubic;
            case 5:
                return PathSegment.Type.Close;
            case 6:
                return PathSegment.Type.Done;
            default:
                v5.m(lt.w(i, "Unknown path segment type "));
                return null;
        }
    }
}
