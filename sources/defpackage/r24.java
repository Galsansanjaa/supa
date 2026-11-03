package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class r24 extends w24 {
    public final String a;

    public r24(String str) {
        this.a = str;
    }

    @Override // defpackage.w24
    public final int a() {
        return w24.d((byte) 96);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        w24 w24Var = (w24) obj;
        int a = w24Var.a();
        int d = w24.d((byte) 96);
        if (d != a) {
            return d - w24Var.a();
        }
        String str = ((r24) w24Var).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r24.class == obj.getClass()) {
            return this.a.equals(((r24) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(w24.d((byte) 96)), this.a});
    }

    public final String toString() {
        return wa2.v(new StringBuilder("\""), this.a, "\"");
    }
}
