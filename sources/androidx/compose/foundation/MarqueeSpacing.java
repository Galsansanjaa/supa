package androidx.compose.foundation;

import androidx.compose.ui.unit.Density;
import defpackage.ej1;
import defpackage.sm;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface MarqueeSpacing {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int fractionOfContainer$lambda$0(float f, Density density, int i, int i2) {
            return ej1.K(f * i2);
        }

        public final MarqueeSpacing fractionOfContainer(float f) {
            return new sm(f, 1);
        }
    }

    int calculateSpacing(Density density, int i, int i2);
}
