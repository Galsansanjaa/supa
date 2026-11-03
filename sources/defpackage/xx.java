package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xx {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final gy f;
    public final Set g;

    public xx(String str, Set set, Set set2, int i, int i2, gy gyVar, Set set3) {
        this.a = str;
        this.b = DesugarCollections.unmodifiableSet(set);
        this.c = DesugarCollections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = gyVar;
        this.g = DesugarCollections.unmodifiableSet(set3);
    }

    public static wx a(z22 z22Var) {
        return new wx(z22Var, new z22[0]);
    }

    public static wx b(Class cls) {
        return new wx(cls, new Class[0]);
    }

    public static xx c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(z22.a(cls));
        for (Class cls2 : clsArr) {
            ta3.m(cls2, "Null interface");
            hashSet.add(z22.a(cls2));
        }
        return new xx(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new vx(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
