package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class td1 {
    public StringBuilder d;
    public String e;
    public String f;
    public char g;
    public StringBuilder h;
    public int a = 1;
    public final StringBuilder b = new StringBuilder();
    public final ArrayList c = new ArrayList();
    public boolean i = false;

    /* JADX WARN: Type inference failed for: r3v0, types: [sd1, java.lang.Object, nq1] */
    public final void a() {
        if (this.i) {
            String a = kj0.a(this.f);
            StringBuilder sb = this.h;
            String a2 = sb != null ? kj0.a(sb.toString()) : null;
            String str = this.e;
            ?? nq1Var = new nq1();
            nq1Var.f = str;
            nq1Var.g = a;
            nq1Var.h = a2;
            this.c.add(nq1Var);
            this.d = null;
            this.i = false;
            this.e = null;
            this.f = null;
            this.h = null;
        }
    }
}
