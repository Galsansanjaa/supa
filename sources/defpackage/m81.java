package defpackage;

import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class m81 implements aj0 {
    public static final k81 f;
    public static final k81 g;
    public final HashMap a;
    public final HashMap b;
    public final j81 c;
    public boolean d;
    public static final j81 e = new j81(0);
    public static final l81 h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [k81] */
    /* JADX WARN: Type inference failed for: r0v2, types: [k81] */
    /* JADX WARN: Type inference failed for: r0v3, types: [l81, java.lang.Object] */
    static {
        final int i = 0;
        f = new q63() { // from class: k81
            @Override // defpackage.zi0
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((r63) obj2).b((String) obj);
                        return;
                    default:
                        ((r63) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i2 = 1;
        g = new q63() { // from class: k81
            @Override // defpackage.zi0
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((r63) obj2).b((String) obj);
                        return;
                    default:
                        ((r63) obj2).c(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public m81() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final aj0 a(Class cls, cs1 cs1Var) {
        this.a.put(cls, cs1Var);
        this.b.remove(cls);
        return this;
    }
}
