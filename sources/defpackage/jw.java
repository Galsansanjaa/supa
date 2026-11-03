package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class jw extends p {
    public final ta1 a;

    public jw(ta1 ta1Var) {
        this.a = ta1Var;
    }

    @Override // defpackage.p
    public final void g(jz jzVar, Object obj, int i, int i2) {
        if (i2 < 0) {
            v5.m("Size must be known in advance when using READ_ALL");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            h(jzVar, i + i3, obj);
        }
    }

    @Override // defpackage.p
    public void h(jz jzVar, int i, Object obj) {
        k(i, obj, jzVar.decodeSerializableElement(getDescriptor(), i, this.a, null));
    }

    public abstract void k(int i, Object obj, Object obj2);

    @Override // defpackage.bg2
    public void serialize(yi0 yi0Var, Object obj) {
        int e = e(obj);
        tf2 descriptor = getDescriptor();
        kz beginCollection = yi0Var.beginCollection(descriptor, e);
        Iterator d = d(obj);
        for (int i = 0; i < e; i++) {
            beginCollection.encodeSerializableElement(getDescriptor(), i, this.a, d.next());
        }
        beginCollection.endStructure(descriptor);
    }
}
