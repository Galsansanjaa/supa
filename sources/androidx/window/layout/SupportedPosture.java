package androidx.window.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class SupportedPosture {
    public static final Companion Companion = new Companion(null);
    public static final SupportedPosture TABLETOP = new SupportedPosture(0);
    private final int rawValue;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }
    }

    public SupportedPosture(int i) {
        this.rawValue = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && obj.getClass() == SupportedPosture.class && this.rawValue == ((SupportedPosture) obj).rawValue;
    }

    public int hashCode() {
        return this.rawValue;
    }

    public String toString() {
        return equals(TABLETOP) ? "TABLETOP" : "UNKNOWN";
    }
}
