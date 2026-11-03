package androidx.compose.ui.graphics;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class ColorFilter {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final android.graphics.ColorFilter nativeColorFilter;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: tint-xETnrds$default, reason: not valid java name */
        public static /* synthetic */ ColorFilter m5373tintxETnrds$default(Companion companion, long j, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = BlendMode.Companion.m5276getSrcIn0nO6VwU();
            }
            return companion.m5376tintxETnrds(j, i);
        }

        /* renamed from: colorMatrix-jHG-Opc, reason: not valid java name */
        public final ColorFilter m5374colorMatrixjHGOpc(float[] fArr) {
            return new ColorMatrixColorFilter(fArr, (sb0) null);
        }

        /* renamed from: lighting--OWjLjI, reason: not valid java name */
        public final ColorFilter m5375lightingOWjLjI(long j, long j2) {
            return new LightingColorFilter(j, j2, (sb0) null);
        }

        /* renamed from: tint-xETnrds, reason: not valid java name */
        public final ColorFilter m5376tintxETnrds(long j, int i) {
            return new BlendModeColorFilter(j, i, (sb0) null);
        }
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter) {
        this.nativeColorFilter = colorFilter;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics() {
        return this.nativeColorFilter;
    }
}
