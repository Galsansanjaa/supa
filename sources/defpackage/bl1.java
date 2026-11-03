package defpackage;

import androidx.compose.ui.CombinedModifier;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class bl1 {
    static {
        Modifier.Companion companion = Modifier.Companion;
    }

    public static Modifier a(Modifier modifier, Modifier modifier2) {
        return modifier2 == Modifier.Companion ? modifier : new CombinedModifier(modifier, modifier2);
    }
}
