package androidx.compose.ui.semantics;

import defpackage.df2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SemanticsConfigurationKt {
    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, new df2(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getOrNull$lambda$0() {
        return null;
    }
}
