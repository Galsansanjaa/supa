package androidx.compose.ui.modifier;

import defpackage.os0;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;
    private final os0 defaultFactory;

    private ModifierLocal(os0 os0Var) {
        this.defaultFactory = os0Var;
    }

    public /* synthetic */ ModifierLocal(os0 os0Var, sb0 sb0Var) {
        this(os0Var);
    }

    public final os0 getDefaultFactory$ui() {
        return this.defaultFactory;
    }
}
