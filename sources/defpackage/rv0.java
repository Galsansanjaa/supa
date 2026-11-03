package defpackage;

import androidx.datastore.core.MulticastFileObserver;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rv0 implements re0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object m;

    public /* synthetic */ rv0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.m = obj2;
    }

    @Override // defpackage.re0
    public final void dispose() {
        int i = this.a;
        Object obj = this.m;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((sv0) obj2).a.removeCallbacks((Runnable) obj);
                return;
            default:
                MulticastFileObserver.Companion.a((String) obj2, (ps0) obj);
                return;
        }
    }
}
