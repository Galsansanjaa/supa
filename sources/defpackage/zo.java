package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zo {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public zo(int i) {
        this.a = i;
        switch (i) {
            case 2:
                return;
            case 5:
                this.c = new int[10];
                return;
            default:
                this.b = 0;
                this.c = new StringBuilder();
                return;
        }
    }

    public zo(int i, String str) {
        this.a = 1;
        this.b = i;
        this.c = str;
    }

    public zo(ArrayList arrayList) {
        this.a = 4;
        this.b = 0;
        this.c = arrayList;
    }

    public zo(p50 p50Var, eg0 eg0Var) {
        this.a = 3;
        this.c = eg0Var;
    }

    public zo(uz uzVar, int i) {
        this.a = 6;
        dn3.o(uzVar);
        this.c = uzVar;
        this.b = i;
    }

    public void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public int b() {
        if ((this.b & 128) != 0) {
            return ((int[]) this.c)[7];
        }
        return 65535;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [rb0, a10, java.lang.Object] */
    public r81 c() {
        r81 h91Var;
        Object obj;
        eg0 eg0Var = (eg0) this.c;
        byte r = eg0Var.r();
        if (r == 1) {
            return f(true);
        }
        if (r == 0) {
            return f(false);
        }
        if (r != 6) {
            if (r == 8) {
                return d();
            }
            eg0.o(eg0Var, "Cannot read Json element because of unexpected ".concat(xu3.C(r)), 0, null, 6);
            throw null;
        }
        int i = this.b + 1;
        this.b = i;
        if (i == 200) {
            u91 u91Var = new u91(this, null);
            ?? obj2 = new Object();
            obj2.a = u91Var;
            obj2.b = obj2;
            e50 e50Var = ux2.a;
            obj2.m = e50Var;
            while (true) {
                obj = obj2.m;
                a10 a10Var = obj2.b;
                if (a10Var == null) {
                    break;
                }
                if (jh2.k(e50Var, obj)) {
                    try {
                        u91 u91Var2 = obj2.a;
                        ux2.m(3, u91Var2);
                        u91 u91Var3 = new u91(u91Var2.m, a10Var);
                        u91Var3.b = obj2;
                        Object invokeSuspend = u91Var3.invokeSuspend(vy2.a);
                        if (invokeSuspend != e50.a) {
                            a10Var.resumeWith(invokeSuspend);
                        }
                    } catch (Throwable th) {
                        a10Var.resumeWith(new d82(th));
                    }
                } else {
                    obj2.m = e50Var;
                    a10Var.resumeWith(obj);
                }
            }
            ta3.H(obj);
            h91Var = (r81) obj;
        } else {
            byte i2 = eg0Var.i((byte) 6);
            if (eg0Var.r() == 4) {
                eg0.o(eg0Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!eg0Var.e()) {
                    break;
                }
                String l = eg0Var.l();
                eg0Var.i((byte) 5);
                linkedHashMap.put(l, c());
                i2 = eg0Var.h();
                if (i2 != 4) {
                    if (i2 != 7) {
                        eg0.o(eg0Var, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (i2 == 6) {
                eg0Var.i((byte) 7);
            } else if (i2 == 4) {
                jh2.G(eg0Var, "object");
                throw null;
            }
            h91Var = new h91(linkedHashMap);
        }
        this.b--;
        return h91Var;
    }

    public e81 d() {
        eg0 eg0Var = (eg0) this.c;
        byte h = eg0Var.h();
        if (eg0Var.r() == 4) {
            eg0.o(eg0Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (eg0Var.e()) {
            arrayList.add(c());
            h = eg0Var.h();
            if (h != 4) {
                boolean z = h == 9;
                int i = eg0Var.b;
                if (!z) {
                    eg0.o(eg0Var, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (h == 8) {
            eg0Var.i((byte) 9);
        } else if (h == 4) {
            jh2.G(eg0Var, "array");
            throw null;
        }
        return new e81(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(defpackage.rb0 r10, defpackage.cm r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            eg0 r0 = (defpackage.eg0) r0
            boolean r1 = r11 instanceof defpackage.v91
            if (r1 == 0) goto L17
            r1 = r11
            v91 r1 = (defpackage.v91) r1
            int r2 = r1.q
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.q = r2
            goto L1c
        L17:
            v91 r1 = new v91
            r1.<init>(r9, r11)
        L1c:
            java.lang.Object r11 = r1.o
            int r2 = r1.q
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 7
            r7 = 4
            r8 = 1
            if (r2 == 0) goto L5c
            if (r2 != r8) goto L56
            java.lang.String r9 = r1.n
            java.util.LinkedHashMap r10 = r1.m
            zo r0 = r1.b
            rb0 r2 = r1.a
            defpackage.ta3.H(r11)
            r81 r11 = (defpackage.r81) r11
            r10.put(r9, r11)
            java.lang.Object r9 = r0.c
            eg0 r9 = (defpackage.eg0) r9
            byte r9 = r9.h()
            if (r9 == r7) goto L51
            if (r9 != r6) goto L47
            goto L95
        L47:
            java.lang.Object r9 = r0.c
            eg0 r9 = (defpackage.eg0) r9
            java.lang.String r10 = "Expected end of the object or comma"
            defpackage.eg0.o(r9, r10, r3, r4, r5)
            throw r4
        L51:
            r11 = r9
            r9 = r0
            r0 = r10
            r10 = r2
            goto L6e
        L56:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r9)
            return r4
        L5c:
            defpackage.ta3.H(r11)
            byte r11 = r0.i(r5)
            byte r2 = r0.r()
            if (r2 == r7) goto Lad
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
        L6e:
            java.lang.Object r2 = r9.c
            eg0 r2 = (defpackage.eg0) r2
            boolean r3 = r2.e()
            if (r3 == 0) goto L92
            java.lang.String r11 = r2.l()
            r3 = 5
            r2.i(r3)
            r1.a = r10
            r1.b = r9
            r1.m = r0
            r1.n = r11
            r1.q = r8
            r10.getClass()
            r10.b = r1
            e50 r9 = defpackage.e50.a
            return r9
        L92:
            r10 = r0
            r0 = r9
            r9 = r11
        L95:
            java.lang.Object r11 = r0.c
            eg0 r11 = (defpackage.eg0) r11
            if (r9 != r5) goto L9f
            r11.i(r6)
            goto La1
        L9f:
            if (r9 == r7) goto La7
        La1:
            h91 r9 = new h91
            r9.<init>(r10)
            return r9
        La7:
            java.lang.String r9 = "object"
            defpackage.jh2.G(r11, r9)
            throw r4
        Lad:
            java.lang.String r9 = "Unexpected leading comma"
            defpackage.eg0.o(r0, r9, r3, r4, r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo.e(rb0, cm):java.lang.Object");
    }

    public m91 f(boolean z) {
        eg0 eg0Var = (eg0) this.c;
        String m = !z ? eg0Var.m() : eg0Var.l();
        return (z || !jh2.k(m, "null")) ? new a91(m, z) : d91.INSTANCE;
    }

    public void g() {
        lu luVar = lu.c;
        char[] cArr = (char[]) this.c;
        luVar.getClass();
        cArr.getClass();
        synchronized (luVar) {
            int i = luVar.b;
            if (cArr.length + i < vd.a) {
                luVar.b = i + cArr.length;
                luVar.a.addLast(cArr);
            }
        }
    }

    public void h(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.c;
            if (i >= iArr.length) {
                return;
            }
            this.b = (1 << i) | this.b;
            iArr[i] = i2;
        }
    }

    public void i(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return new String((char[]) this.c, 0, this.b);
            default:
                return super.toString();
        }
    }
}
