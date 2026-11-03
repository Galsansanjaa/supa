package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ui0 implements fm0 {
    public final HashMap a = new HashMap();

    @Override // defpackage.fm0
    public final boolean a(String str) {
        return this.a.containsKey(str);
    }

    public final void b(String str, v vVar) {
        this.a.put(str, vVar);
    }

    public final void c(fm0 fm0Var) {
        HashMap hashMap = this.a;
        hashMap.clear();
        hashMap.putAll(fm0Var.getAll());
    }

    @Override // defpackage.fm0
    public final ia0 get(String str) {
        return (v) this.a.get(str);
    }

    @Override // defpackage.fm0
    public final HashMap getAll() {
        return new HashMap(this.a);
    }
}
