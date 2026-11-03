package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class td extends jw {
    public final qd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(ta1 ta1Var) {
        super(ta1Var);
        ta1Var.getClass();
        tf2 descriptor = ta1Var.getDescriptor();
        descriptor.getClass();
        this.b = new qd(descriptor, 1);
    }

    @Override // defpackage.p
    public final Object a() {
        return new ArrayList();
    }

    @Override // defpackage.p
    public final int b(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.p
    public final void c(int i, Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.ensureCapacity(i);
    }

    @Override // defpackage.p
    public final Iterator d(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // defpackage.p
    public final int e(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.p
    public final Object i(Object obj) {
        throw null;
    }

    @Override // defpackage.p
    public final Object j(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // defpackage.jw
    public final void k(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
