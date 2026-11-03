package androidx.compose.ui.unit;

import defpackage.hu2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface FontScalingLinear {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8162toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j) {
            if (TextUnitType.m8267equalsimpl0(TextUnit.m8238getTypeUIouoOA(j), TextUnitType.Companion.m8272getSpUIouoOA())) {
                return Dp.m8049constructorimpl(fontScalingLinear.getFontScale() * TextUnit.m8239getValueimpl(j));
            }
            hu2.h("Only Sp can convert to Px");
            return 0.0f;
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8163toSp0xMU5do(FontScalingLinear fontScalingLinear, float f) {
            return TextUnitKt.getSp(f / fontScalingLinear.getFontScale());
        }
    }

    float getFontScale();

    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    float m8160toDpGaN1DYA(long j);

    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    long m8161toSp0xMU5do(float f);
}
