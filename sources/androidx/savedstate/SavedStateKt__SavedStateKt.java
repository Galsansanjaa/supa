package androidx.savedstate;

import android.os.Bundle;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final /* synthetic */ class SavedStateKt__SavedStateKt {
    public static final <T> T read(Bundle bundle, ps0 ps0Var) {
        bundle.getClass();
        ps0Var.getClass();
        return (T) ps0Var.invoke(SavedStateReader.m8372boximpl(SavedStateReader.m8373constructorimpl(bundle)));
    }

    public static final <T> T write(Bundle bundle, ps0 ps0Var) {
        bundle.getClass();
        ps0Var.getClass();
        return (T) ps0Var.invoke(SavedStateWriter.m8457boximpl(SavedStateWriter.m8459constructorimpl(bundle)));
    }
}
