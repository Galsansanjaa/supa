package androidx.compose.ui.graphics;

import defpackage.f31;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface PathMeasure {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean getSegment$default(PathMeasure pathMeasure, float f, float f2, Path path, boolean z, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: getSegment");
                return false;
            }
            if ((i & 8) != 0) {
                z = true;
            }
            return pathMeasure.getSegment(f, f2, path, z);
        }
    }

    float getLength();

    /* renamed from: getPosition-tuRUvjQ */
    long mo5233getPositiontuRUvjQ(float f);

    boolean getSegment(float f, float f2, Path path, boolean z);

    /* renamed from: getTangent-tuRUvjQ */
    long mo5234getTangenttuRUvjQ(float f);

    void setPath(Path path, boolean z);
}
