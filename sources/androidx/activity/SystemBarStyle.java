package androidx.activity;

import defpackage.ps0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SystemBarStyle {
    public static final Companion Companion = new Companion(null);
    private final int darkScrim;
    private final ps0 detectDarkMode;
    private final int lightScrim;
    private final int nightMode;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ SystemBarStyle auto$default(Companion companion, int i, int i2, ps0 ps0Var, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                ps0Var = SystemBarStyle$Companion$auto$1.INSTANCE;
            }
            return companion.auto(i, i2, ps0Var);
        }

        public final SystemBarStyle auto(int i, int i2) {
            return auto$default(this, i, i2, null, 4, null);
        }

        public final SystemBarStyle auto(int i, int i2, ps0 ps0Var) {
            ps0Var.getClass();
            return new SystemBarStyle(i, i2, 0, ps0Var, null);
        }

        public final SystemBarStyle dark(int i) {
            return new SystemBarStyle(i, i, 2, SystemBarStyle$Companion$dark$1.INSTANCE, null);
        }

        public final SystemBarStyle light(int i, int i2) {
            return new SystemBarStyle(i, i2, 1, SystemBarStyle$Companion$light$1.INSTANCE, null);
        }
    }

    private SystemBarStyle(int i, int i2, int i3, ps0 ps0Var) {
        this.lightScrim = i;
        this.darkScrim = i2;
        this.nightMode = i3;
        this.detectDarkMode = ps0Var;
    }

    public /* synthetic */ SystemBarStyle(int i, int i2, int i3, ps0 ps0Var, sb0 sb0Var) {
        this(i, i2, i3, ps0Var);
    }

    public static final SystemBarStyle auto(int i, int i2) {
        return Companion.auto(i, i2);
    }

    public static final SystemBarStyle auto(int i, int i2, ps0 ps0Var) {
        return Companion.auto(i, i2, ps0Var);
    }

    public static final SystemBarStyle dark(int i) {
        return Companion.dark(i);
    }

    public static final SystemBarStyle light(int i, int i2) {
        return Companion.light(i, i2);
    }

    public final int getDarkScrim$activity_release() {
        return this.darkScrim;
    }

    public final ps0 getDetectDarkMode$activity_release() {
        return this.detectDarkMode;
    }

    public final int getNightMode$activity_release() {
        return this.nightMode;
    }

    public final int getScrim$activity_release(boolean z) {
        return z ? this.darkScrim : this.lightScrim;
    }

    public final int getScrimWithEnforcedContrast$activity_release(boolean z) {
        if (this.nightMode == 0) {
            return 0;
        }
        return z ? this.darkScrim : this.lightScrim;
    }
}
