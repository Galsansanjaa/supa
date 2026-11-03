package androidx.window.core.layout;

import defpackage.hd0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@hd0
/* loaded from: classes4.dex */
public final class WindowHeightSizeClass {
    private final int rawValue;
    public static final Companion Companion = new Companion(null);
    public static final WindowHeightSizeClass COMPACT = new WindowHeightSizeClass(0);
    public static final WindowHeightSizeClass MEDIUM = new WindowHeightSizeClass(1);
    public static final WindowHeightSizeClass EXPANDED = new WindowHeightSizeClass(2);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        @hd0
        public static /* synthetic */ void getCOMPACT$annotations() {
        }

        @hd0
        public static /* synthetic */ void getEXPANDED$annotations() {
        }

        @hd0
        public static /* synthetic */ void getMEDIUM$annotations() {
        }

        @hd0
        public final WindowHeightSizeClass compute$window_core(float f) {
            if (f >= 0.0f) {
                return f < 480.0f ? WindowHeightSizeClass.COMPACT : f < 900.0f ? WindowHeightSizeClass.MEDIUM : WindowHeightSizeClass.EXPANDED;
            }
            throw new IllegalArgumentException(("Height must be positive, received " + f).toString());
        }
    }

    private WindowHeightSizeClass(int i) {
        this.rawValue = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && WindowHeightSizeClass.class == obj.getClass() && this.rawValue == ((WindowHeightSizeClass) obj).rawValue;
    }

    public int hashCode() {
        return this.rawValue;
    }

    public String toString() {
        return "WindowHeightSizeClass: ".concat(equals(COMPACT) ? "COMPACT" : equals(MEDIUM) ? "MEDIUM" : equals(EXPANDED) ? "EXPANDED" : "UNKNOWN");
    }
}
