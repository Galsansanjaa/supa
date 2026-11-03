package androidx.compose.runtime.composer.linkbuffer;

import defpackage.ps0;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class LinkGroupSourceInformationKt {
    private static final <T> int fastIndexOf(ArrayList<T> arrayList, ps0 ps0Var) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) ps0Var.invoke(arrayList.get(i))).booleanValue()) {
                return i;
            }
        }
        return -1;
    }

    private static final <T> T fastLastOrNull(ArrayList<T> arrayList, ps0 ps0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            T t = arrayList.get(size);
            if (((Boolean) ps0Var.invoke(t)).booleanValue()) {
                return t;
            }
        }
        return null;
    }
}
