package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xx0 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public Object h;
    public Object i;

    public xx0(Uri uri, int i, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5) {
        this.a = 2;
        this.h = uri;
        this.b = i;
        if (arrayList == null) {
            this.i = null;
        } else {
            this.i = DesugarCollections.unmodifiableList(arrayList);
        }
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = i5;
    }

    public xx0(tq tqVar) {
        this.a = 0;
        this.b = Integer.MAX_VALUE;
        this.i = new zv0[8];
        this.d = 7;
        this.f = 0;
        this.g = 0;
        this.c = 4096;
        this.h = tqVar;
    }

    public void a(int i) {
        int i2;
        if (i > 0) {
            int length = ((zv0[]) this.i).length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.d;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = ((zv0[]) this.i)[length].c;
                i -= i4;
                this.g -= i4;
                this.f--;
                i3++;
                length--;
            }
            zv0[] zv0VarArr = (zv0[]) this.i;
            int i5 = i2 + 1;
            System.arraycopy(zv0VarArr, i5, zv0VarArr, i5 + i3, this.f);
            zv0[] zv0VarArr2 = (zv0[]) this.i;
            int i6 = this.d + 1;
            Arrays.fill(zv0VarArr2, i6, i6 + i3, (Object) null);
            this.d += i3;
        }
    }

    public boolean b() {
        return (this.c == 0 && this.d == 0) ? false : true;
    }

    public void c(zv0 zv0Var) {
        int i = zv0Var.c;
        int i2 = this.c;
        if (i > i2) {
            Arrays.fill((zv0[]) this.i, (Object) null);
            this.d = ((zv0[]) this.i).length - 1;
            this.f = 0;
            this.g = 0;
            return;
        }
        a((this.g + i) - i2);
        int i3 = this.f + 1;
        zv0[] zv0VarArr = (zv0[]) this.i;
        if (i3 > zv0VarArr.length) {
            zv0[] zv0VarArr2 = new zv0[zv0VarArr.length * 2];
            System.arraycopy(zv0VarArr, 0, zv0VarArr2, zv0VarArr.length, zv0VarArr.length);
            this.d = ((zv0[]) this.i).length - 1;
            this.i = zv0VarArr2;
            zv0VarArr = zv0VarArr2;
        }
        int i4 = this.d;
        this.d = i4 - 1;
        zv0VarArr[i4] = zv0Var;
        this.f++;
        this.g += i;
    }

    public boolean d() {
        return b();
    }

    public void e(int i, int i2) {
        if (i < 0) {
            v5.m("Width must be positive number or 0.");
            return;
        }
        if (i2 < 0) {
            v5.m("Height must be positive number or 0.");
        } else if (i2 == 0 && i == 0) {
            v5.m("At least one dimension has to be positive number.");
        } else {
            this.c = i;
            this.d = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, tq] */
    public void f(nr nrVar) {
        tq tqVar = (tq) this.h;
        lz0.d.getClass();
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < nrVar.f(); i++) {
            j2 += lz0.c[nrVar.k(i) & 255];
        }
        if (((int) ((j2 + 7) >> 3)) >= nrVar.f()) {
            g(nrVar.f(), 127, 0);
            tqVar.y(nrVar);
            return;
        }
        ?? obj = new Object();
        lz0.d.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < nrVar.f(); i3++) {
            int k = nrVar.k(i3) & 255;
            int i4 = lz0.b[k];
            byte b = lz0.c[k];
            j = (j << b) | i4;
            i2 += b;
            while (i2 >= 8) {
                i2 -= 8;
                obj.A((int) (j >> i2));
            }
        }
        if (i2 > 0) {
            obj.A((int) ((j << (8 - i2)) | (255 >>> i2)));
        }
        nr k2 = obj.k(obj.b);
        g(k2.f(), 127, 128);
        tqVar.y(k2);
    }

    public void g(int i, int i2, int i3) {
        tq tqVar = (tq) this.h;
        if (i < i2) {
            tqVar.A(i | i3);
            return;
        }
        tqVar.A(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            tqVar.A(128 | (i4 & 127));
            i4 >>>= 7;
        }
        tqVar.A(i4);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                int i = this.c;
                List<bu2> list = (List) this.i;
                StringBuilder sb = new StringBuilder("Request{");
                int i2 = this.b;
                if (i2 > 0) {
                    sb.append(i2);
                } else {
                    sb.append((Uri) this.h);
                }
                if (list != null && !list.isEmpty()) {
                    for (bu2 bu2Var : list) {
                        sb.append(' ');
                        sb.append(bu2Var.key());
                    }
                }
                if (i > 0) {
                    sb.append(" resize(");
                    sb.append(i);
                    sb.append(',');
                    sb.append(this.d);
                    sb.append(')');
                }
                if (this.e) {
                    sb.append(" centerCrop");
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
