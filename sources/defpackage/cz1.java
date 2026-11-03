package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class cz1 extends jw {
    public final bz1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz1(ta1 ta1Var) {
        super(ta1Var);
        ta1Var.getClass();
        this.b = new bz1(ta1Var.getDescriptor());
    }

    @Override // defpackage.p
    public final Object a() {
        return (az1) i(l());
    }

    @Override // defpackage.p
    public final int b(Object obj) {
        az1 az1Var = (az1) obj;
        az1Var.getClass();
        return az1Var.d();
    }

    @Override // defpackage.p
    public final void c(int i, Object obj) {
        az1 az1Var = (az1) obj;
        az1Var.getClass();
        az1Var.b(i);
    }

    @Override // defpackage.p
    public final Iterator d(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // defpackage.p, defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        return f(ob0Var);
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return this.b;
    }

    @Override // defpackage.p
    public final Object j(Object obj) {
        az1 az1Var = (az1) obj;
        az1Var.getClass();
        return az1Var.a();
    }

    @Override // defpackage.jw
    public final void k(int i, Object obj, Object obj2) {
        ((az1) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object l();

    public abstract void m(kz kzVar, Object obj, int i);

    @Override // defpackage.jw, defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        int e = e(obj);
        bz1 bz1Var = this.b;
        kz beginCollection = yi0Var.beginCollection(bz1Var, e);
        m(beginCollection, obj, e);
        beginCollection.endStructure(bz1Var);
    }
}
