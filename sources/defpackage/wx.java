package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wx {
    public int a;
    public int b;
    public Serializable c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public wx(Class cls, Class... clsArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(z22.a(cls));
        for (Class cls2 : clsArr) {
            ta3.m(cls2, "Null interface");
            ((HashSet) this.d).add(z22.a(cls2));
        }
    }

    public wx(Locale locale, mc3 mc3Var, mh3 mh3Var, rb3 rb3Var, int i, int i2, xg3 xg3Var) {
        mc3Var.getClass();
        mh3Var.getClass();
        rb3Var.getClass();
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        this.c = locale;
        this.d = mc3Var;
        this.e = mh3Var;
        this.f = rb3Var;
        this.a = i;
        this.b = i2;
        this.g = xg3Var;
    }

    public wx(z22 z22Var, z22... z22VarArr) {
        this.c = null;
        HashSet hashSet = new HashSet();
        this.d = hashSet;
        this.e = new HashSet();
        this.a = 0;
        this.b = 0;
        this.f = new HashSet();
        hashSet.add(z22Var);
        for (z22 z22Var2 : z22VarArr) {
            ta3.m(z22Var2, "Null interface");
        }
        Collections.addAll((HashSet) this.d, z22VarArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:16|17))(3:18|19|(3:21|22|(1:24))(5:25|(1:27)(1:29)|28|13|14))|12|13|14))|31|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        r5 = ((defpackage.rb3) r4.f).j(42);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.c10 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.tj3
            if (r0 == 0) goto L13
            r0 = r5
            tj3 r0 = (defpackage.tj3) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            tj3 r0 = new tj3
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.n
            r2 = 1
            r3 = 42
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            wx r4 = r0.a
            defpackage.ta3.H(r5)     // Catch: defpackage.zb3 -> L6c
            goto L52
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ta3.H(r5)
            java.lang.Object r5 = r4.d     // Catch: defpackage.zb3 -> L6c
            mc3 r5 = (defpackage.mc3) r5     // Catch: defpackage.zb3 -> L6c
            boolean r5 = r5.a()     // Catch: defpackage.zb3 -> L6c
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.e     // Catch: defpackage.zb3 -> L6c
            mh3 r5 = (defpackage.mh3) r5     // Catch: defpackage.zb3 -> L6c
            java.lang.String r1 = r4.b()     // Catch: defpackage.zb3 -> L6c
            r0.a = r4     // Catch: defpackage.zb3 -> L6c
            r0.n = r2     // Catch: defpackage.zb3 -> L6c
            java.lang.Object r5 = r5.a(r1, r0)     // Catch: defpackage.zb3 -> L6c
            e50 r0 = defpackage.e50.a
            if (r5 != r0) goto L52
            return r0
        L52:
            java.lang.String r5 = (java.lang.String) r5     // Catch: defpackage.zb3 -> L6c
            goto L74
        L55:
            com.inmobi.cmp.ChoiceCmp r5 = com.inmobi.cmp.ChoiceCmp.INSTANCE     // Catch: defpackage.zb3 -> L6c
            com.inmobi.cmp.ChoiceCmpCallback r5 = r5.getCallback()     // Catch: defpackage.zb3 -> L6c
            if (r5 != 0) goto L5e
            goto L63
        L5e:
            com.inmobi.cmp.model.ChoiceError r0 = com.inmobi.cmp.model.ChoiceError.NO_CONNECTION     // Catch: defpackage.zb3 -> L6c
            r5.onCmpError(r0)     // Catch: defpackage.zb3 -> L6c
        L63:
            java.lang.Object r5 = r4.f     // Catch: defpackage.zb3 -> L6c
            rb3 r5 = (defpackage.rb3) r5     // Catch: defpackage.zb3 -> L6c
            java.lang.String r5 = r5.j(r3)     // Catch: defpackage.zb3 -> L6c
            goto L74
        L6c:
            java.lang.Object r5 = r4.f
            rb3 r5 = (defpackage.rb3) r5
            java.lang.String r5 = r5.j(r3)
        L74:
            java.lang.Object r0 = r4.f
            rb3 r0 = (defpackage.rb3) r0
            r0.f(r3, r5)
            java.lang.Object r4 = r4.g
            xg3 r4 = (defpackage.xg3) r4
            java.lang.Object r4 = r4.c(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx.a(c10):java.lang.Object");
    }

    public String b() {
        String str;
        int i = this.b;
        if (this.a == 2) {
            if (i == 0) {
                throw null;
            }
            if (nb0.d(i).length() > 0) {
                ta3.n = 2;
                str = String.format("us-mspa/v1/purposes-state-%s-", Arrays.copyOf(new Object[]{nb0.d(i)}, 1));
                StringBuilder v = sg3.v("https://cmp.inmobi.com/", str);
                String lowerCase = "en".toLowerCase((Locale) this.c);
                lowerCase.getClass();
                v.append(lowerCase);
                v.append(".json");
                return v.toString();
            }
        }
        ta3.n = 1;
        str = "us-mspa/v1/purposes-national-";
        StringBuilder v2 = sg3.v("https://cmp.inmobi.com/", str);
        String lowerCase2 = "en".toLowerCase((Locale) this.c);
        lowerCase2.getClass();
        v2.append(lowerCase2);
        v2.append(".json");
        return v2.toString();
    }

    public void c(fd0 fd0Var) {
        if (((HashSet) this.d).contains(fd0Var.a)) {
            v5.m("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            ((HashSet) this.e).add(fd0Var);
        }
    }

    public xx d() {
        if (((gy) this.g) != null) {
            return new xx((String) this.c, new HashSet((HashSet) this.d), new HashSet((HashSet) this.e), this.a, this.b, (gy) this.g, (HashSet) this.f);
        }
        hu2.h("Missing required property: factory.");
        return null;
    }

    public void e(int i) {
        if (this.a == 0) {
            this.a = i;
        } else {
            hu2.h("Instantiation type has already been set.");
        }
    }
}
