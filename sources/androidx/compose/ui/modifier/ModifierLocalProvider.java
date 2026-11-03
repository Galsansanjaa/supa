package androidx.compose.ui.modifier;

import androidx.compose.ui.Modifier;
import defpackage.bl1;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> modifierLocalProvider, ps0 ps0Var) {
            return vg1.a(modifierLocalProvider, ps0Var);
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> modifierLocalProvider, ps0 ps0Var) {
            return vg1.c(modifierLocalProvider, ps0Var);
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> modifierLocalProvider, R r, ts0 ts0Var) {
            return (R) ts0Var.invoke(r, modifierLocalProvider);
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> modifierLocalProvider, R r, ts0 ts0Var) {
            return (R) ts0Var.invoke(modifierLocalProvider, r);
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> modifierLocalProvider, Modifier modifier) {
            return bl1.a(modifierLocalProvider, modifier);
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();
}
