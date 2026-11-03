package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zr {
    public static final zr n;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    static {
        yr yrVar = new yr();
        yrVar.d = true;
        yrVar.c = Integer.MAX_VALUE;
        n = new zr(yrVar);
    }

    public zr(yr yrVar) {
        this.a = yrVar.a;
        this.b = yrVar.b;
        this.c = -1;
        this.d = -1;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = yrVar.c;
        this.i = -1;
        this.j = yrVar.d;
        this.k = false;
        this.l = false;
    }

    public zr(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zr a(defpackage.fw0 r23) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr.a(fw0):zr");
    }

    public final String toString() {
        String sb;
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.a) {
            sb2.append("no-cache, ");
        }
        if (this.b) {
            sb2.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            sb2.append("max-age=");
            sb2.append(i);
            sb2.append(", ");
        }
        int i2 = this.d;
        if (i2 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i2);
            sb2.append(", ");
        }
        if (this.e) {
            sb2.append("private, ");
        }
        if (this.f) {
            sb2.append("public, ");
        }
        if (this.g) {
            sb2.append("must-revalidate, ");
        }
        int i3 = this.h;
        if (i3 != -1) {
            sb2.append("max-stale=");
            sb2.append(i3);
            sb2.append(", ");
        }
        int i4 = this.i;
        if (i4 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i4);
            sb2.append(", ");
        }
        if (this.j) {
            sb2.append("only-if-cached, ");
        }
        if (this.k) {
            sb2.append("no-transform, ");
        }
        if (this.l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.m = sb;
        return sb;
    }
}
