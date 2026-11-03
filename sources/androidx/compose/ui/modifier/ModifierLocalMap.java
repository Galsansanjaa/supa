package androidx.compose.ui.modifier;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    private ModifierLocalMap() {
    }

    public /* synthetic */ ModifierLocalMap(sb0 sb0Var) {
        this();
    }

    public abstract boolean contains$ui(ModifierLocal<?> modifierLocal);

    public abstract <T> T get$ui(ModifierLocal<T> modifierLocal);

    /* renamed from: set$ui */
    public abstract <T> void mo6844set$ui(ModifierLocal<T> modifierLocal, T t);
}
