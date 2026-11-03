package androidx.savedstate;

import android.view.View;
import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ViewKt {
    @hd0
    public static final /* synthetic */ SavedStateRegistryOwner findViewTreeSavedStateRegistryOwner(View view) {
        view.getClass();
        return ViewTreeSavedStateRegistryOwner.get(view);
    }
}
