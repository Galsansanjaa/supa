package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class im1 extends km1 implements ra1 {
    @Override // defpackage.fs
    public ba1 computeReflected() {
        a52.a.getClass();
        return this;
    }

    @Override // defpackage.ra1
    public Object getDelegate(Object obj) {
        return ((im1) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ na1 getGetter() {
        mo8505getGetter();
        return null;
    }

    @Override // defpackage.ra1
    /* renamed from: getGetter, reason: collision with other method in class */
    public qa1 mo8505getGetter() {
        ((im1) getReflected()).mo8505getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ ja1 getSetter() {
        m8506getSetter();
        return null;
    }

    /* renamed from: getSetter, reason: collision with other method in class */
    public la1 m8506getSetter() {
        ((im1) getReflected()).m8506getSetter();
        return null;
    }

    @Override // defpackage.ps0
    public Object invoke(Object obj) {
        return get(obj);
    }
}
