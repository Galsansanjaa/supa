package androidx.window.core.layout;

import defpackage.hd0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@hd0
/* loaded from: classes4.dex */
public final class WindowWidthSizeClass {
    private final int rawValue;
    public static final Companion Companion = new Companion(null);
    public static final WindowWidthSizeClass COMPACT = new WindowWidthSizeClass(0);
    public static final WindowWidthSizeClass MEDIUM = new WindowWidthSizeClass(1);
    public static final WindowWidthSizeClass EXPANDED = new WindowWidthSizeClass(2);

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
        public final WindowWidthSizeClass compute$window_core(float f) {
            if (f >= 0.0f) {
                return f < 600.0f ? WindowWidthSizeClass.COMPACT : f < 840.0f ? WindowWidthSizeClass.MEDIUM : WindowWidthSizeClass.EXPANDED;
            }
            throw new IllegalArgumentException(("Width must be positive, received " + f).toString());
        }
    }

    private WindowWidthSizeClass(int i) {
        this.rawValue = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && WindowWidthSizeClass.class == obj.getClass() && this.rawValue == ((WindowWidthSizeClass) obj).rawValue;
    }

    public int hashCode() {
        return this.rawValue;
    }

    public String toString() {
        return "WindowWidthSizeClass: ".concat(equals(COMPACT) ? "COMPACT" : equals(MEDIUM) ? "MEDIUM" : equals(EXPANDED) ? "EXPANDED" : "UNKNOWN");
    }
}
