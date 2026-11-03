package androidx.compose.ui.graphics.colorspace;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class Adaptation {
    private static final Adaptation Bradford;
    private static final Adaptation Ciecat02;
    private static final Adaptation VonKries;
    private final float[] transform;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final Adaptation getBradford() {
            return Adaptation.Bradford;
        }

        public final Adaptation getCiecat02() {
            return Adaptation.Ciecat02;
        }

        public final Adaptation getVonKries() {
            return Adaptation.VonKries;
        }
    }

    static {
        final float[] fArr = {0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f};
        Bradford = new Adaptation(fArr) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$Bradford$1
            {
                sb0 sb0Var = null;
            }

            public String toString() {
                return "Bradford";
            }
        };
        final float[] fArr2 = {0.40024f, -0.2263f, 0.0f, 0.7076f, 1.16532f, 0.0f, -0.08081f, 0.0457f, 0.91822f};
        VonKries = new Adaptation(fArr2) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$VonKries$1
            {
                sb0 sb0Var = null;
            }

            public String toString() {
                return "VonKries";
            }
        };
        final float[] fArr3 = {0.7328f, -0.7036f, 0.003f, 0.4296f, 1.6975f, 0.0136f, -0.1624f, 0.0061f, 0.9834f};
        Ciecat02 = new Adaptation(fArr3) { // from class: androidx.compose.ui.graphics.colorspace.Adaptation$Companion$Ciecat02$1
            {
                sb0 sb0Var = null;
            }

            public String toString() {
                return "Ciecat02";
            }
        };
    }

    private Adaptation(float[] fArr) {
        this.transform = fArr;
    }

    public /* synthetic */ Adaptation(float[] fArr, sb0 sb0Var) {
        this(fArr);
    }

    public final float[] getTransform$ui_graphics() {
        return this.transform;
    }
}
