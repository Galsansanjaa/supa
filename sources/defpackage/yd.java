package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yd implements nf2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ yd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nf2
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new o0((Object[]) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new nd1(this);
            case 3:
                return m60.y((ts0) obj);
            case 4:
                return (Iterator) obj;
            default:
                return new md1((CharSequence) obj);
        }
    }
}
