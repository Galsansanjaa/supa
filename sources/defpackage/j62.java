package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class j62 {
    public final HashMap a;

    public j62(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap();
                return;
            default:
                this.a = new HashMap(3);
                return;
        }
    }

    public void a(p02 p02Var, Object obj) {
        HashMap hashMap = this.a;
        if (obj == null) {
            hashMap.remove(p02Var);
        } else {
            hashMap.put(p02Var, obj);
        }
    }
}
