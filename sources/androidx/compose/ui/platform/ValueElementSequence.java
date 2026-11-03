package androidx.compose.ui.platform;

import defpackage.nf2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ValueElementSequence implements nf2 {
    public static final int $stable = 8;
    private final List<ValueElement> elements = new ArrayList();

    @Override // defpackage.nf2
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(String str, Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
