package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class tm3 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ km c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ km f;

    public tm3(km kmVar, int i, Bundle bundle) {
        this.f = kmVar;
        Boolean bool = Boolean.TRUE;
        this.c = kmVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(uz uzVar);

    public final void c() {
        d();
        km kmVar = this.c;
        synchronized (kmVar.l) {
            kmVar.l.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
