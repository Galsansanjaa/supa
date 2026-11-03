package androidx.compose.ui.platform;

import defpackage.nf2;
import defpackage.qi0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface InspectableValue {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static nf2 getInspectableElements(InspectableValue inspectableValue) {
            return qi0.a;
        }

        @Deprecated
        public static String getNameFallback(InspectableValue inspectableValue) {
            return null;
        }

        @Deprecated
        public static Object getValueOverride(InspectableValue inspectableValue) {
            return null;
        }
    }

    nf2 getInspectableElements();

    String getNameFallback();

    Object getValueOverride();
}
