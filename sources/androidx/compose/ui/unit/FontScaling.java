package androidx.compose.ui.unit;

import defpackage.yo0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface FontScaling {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8158toDpGaN1DYA(FontScaling fontScaling, long j) {
            return yo0.b(fontScaling, j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8159toSp0xMU5do(FontScaling fontScaling, float f) {
            return yo0.c(fontScaling, f);
        }
    }

    float getFontScale();

    /* renamed from: toDp-GaN1DYA */
    float mo468toDpGaN1DYA(long j);

    /* renamed from: toSp-0xMU5do */
    long mo475toSp0xMU5do(float f);
}
