package defpackage;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class id4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public final Object e;
    public final Object f;
    public Object g;

    public id4(bn3 bn3Var, Object[] objArr, StringBuilder sb) {
        this.a = 1;
        this.b = 0;
        this.c = -1;
        xu3.T(bn3Var, "context");
        this.e = bn3Var;
        this.d = 0;
        this.f = objArr;
        this.g = sb;
    }

    public id4(int[] iArr) {
        this.a = 0;
        this.e = iArr;
        hd4 hd4Var = new hd4(-1, -1);
        this.f = hd4Var;
        this.g = hd4Var;
    }

    public static void f(StringBuilder sb, Object obj, String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(ue4.a(obj));
        sb.append("]");
    }

    public void a() {
        if (this.c == 0) {
            return;
        }
        HashMap hashMap = ((hd4) this.g).d;
        int[] iArr = (int[]) this.e;
        hd4 hd4Var = (hd4) hashMap.get(Integer.valueOf(iArr[this.b]));
        while (true) {
            int i = (hd4Var.b - hd4Var.a) + 1;
            int i2 = this.c;
            if (i > i2) {
                return;
            }
            int i3 = this.b + i;
            this.b = i3;
            this.g = hd4Var;
            int i4 = i2 - i;
            this.c = i4;
            if (i4 > 0) {
                hd4Var = (hd4) hd4Var.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public void b() {
        hd4 hd4Var = ((hd4) this.g).c;
        if (hd4Var != null) {
            this.g = hd4Var;
        } else {
            this.g = (hd4) this.f;
            int i = this.c;
            if (i > 0) {
                this.c = i - 1;
            }
            if (this.d > 0) {
                this.b++;
            }
        }
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if ((r8 instanceof java.math.BigDecimal) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003f, code lost:
    
        if ((r8 instanceof java.math.BigInteger) == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object r8, defpackage.pe4 r9, defpackage.se4 r10) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id4.c(java.lang.Object, pe4, se4):void");
    }

    public void d(hd4 hd4Var, StringBuilder sb) {
        for (hd4 hd4Var2 : hd4Var.d.values()) {
            sb.append("  ");
            sb.append(hd4Var);
            sb.append(" -> ");
            sb.append(hd4Var2);
            sb.append(" [label=\"");
            int[] iArr = (int[]) this.e;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, hd4Var2.a, Math.min(iArr.length, hd4Var2.b + 1))));
            sb.append("\"]\n");
            d(hd4Var2, sb);
        }
    }

    public boolean e(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int[] iArr = (int[]) this.e;
        int length = iArr.length;
        int min = Math.min(length, i2);
        if (min - i != Math.min(length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= min; i5++) {
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("digraph {\n");
                d((hd4) this.f, sb);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
