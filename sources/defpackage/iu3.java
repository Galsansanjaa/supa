package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class iu3 implements Iterable, du3 {
    public final String a;

    public iu3(String str) {
        if (str != null) {
            this.a = str;
        } else {
            v5.m("StringValue cannot be null.");
            throw null;
        }
    }

    @Override // defpackage.du3
    public final String b() {
        return this.a;
    }

    @Override // defpackage.du3
    public final Iterator c() {
        return new gu3(this, 0);
    }

    @Override // defpackage.du3
    public final Boolean e() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iu3) {
            return this.a.equals(((iu3) obj).a);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02e2, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00b8. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.du3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.du3 f(java.lang.String r29, defpackage.hg2 r30, java.util.ArrayList r31) {
        /*
            Method dump skipped, instructions count: 1606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu3.f(java.lang.String, hg2, java.util.ArrayList):du3");
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gu3(this, 1);
    }

    @Override // defpackage.du3
    public final Double j() {
        String str = this.a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // defpackage.du3
    public final du3 m() {
        return new iu3(this.a);
    }

    public final String toString() {
        String str = this.a;
        return sg3.t(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }
}
