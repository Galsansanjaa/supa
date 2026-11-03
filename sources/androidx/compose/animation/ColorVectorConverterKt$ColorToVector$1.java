package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import defpackage.bb1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ColorVectorConverterKt$ColorToVector$1 extends bb1 implements ps0 {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends bb1 implements ps0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.ps0
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return m85invoke8_81llA(((Color) obj).m5342unboximpl());
        }

        /* renamed from: invoke-8_81llA, reason: not valid java name */
        public final AnimationVector4D m85invoke8_81llA(long j) {
            long m5329convertvNxB06k = Color.m5329convertvNxB06k(j, ColorSpaces.INSTANCE.getOklab());
            return new AnimationVector4D(Color.m5334getAlphaimpl(m5329convertvNxB06k), Color.m5338getRedimpl(m5329convertvNxB06k), Color.m5337getGreenimpl(m5329convertvNxB06k), Color.m5335getBlueimpl(m5329convertvNxB06k));
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends bb1 implements ps0 {
        final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // defpackage.ps0
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Color.m5322boximpl(m86invokevNxB06k((AnimationVector4D) obj));
        }

        /* renamed from: invoke-vNxB06k, reason: not valid java name */
        public final long m86invokevNxB06k(AnimationVector4D animationVector4D) {
            float v2 = animationVector4D.getV2();
            if (v2 < 0.0f) {
                v2 = 0.0f;
            }
            if (v2 > 1.0f) {
                v2 = 1.0f;
            }
            float v3 = animationVector4D.getV3();
            if (v3 < -0.5f) {
                v3 = -0.5f;
            }
            if (v3 > 0.5f) {
                v3 = 0.5f;
            }
            float v4 = animationVector4D.getV4();
            float f = v4 >= -0.5f ? v4 : -0.5f;
            float f2 = f <= 0.5f ? f : 0.5f;
            float v1 = animationVector4D.getV1();
            float f3 = v1 >= 0.0f ? v1 : 0.0f;
            return Color.m5329convertvNxB06k(ColorKt.Color(v2, v3, f2, f3 <= 1.0f ? f3 : 1.0f, ColorSpaces.INSTANCE.getOklab()), this.$colorSpace);
        }
    }

    public ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // defpackage.ps0
    public final TwoWayConverter<Color, AnimationVector4D> invoke(ColorSpace colorSpace) {
        return VectorConvertersKt.TwoWayConverter(AnonymousClass1.INSTANCE, new AnonymousClass2(colorSpace));
    }
}
