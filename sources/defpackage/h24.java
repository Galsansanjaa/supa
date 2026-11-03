package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class h24 extends w24 {
    public final boolean a;

    public h24(boolean z) {
        this.a = z;
    }

    @Override // defpackage.w24
    public final int a() {
        return w24.d((byte) -32);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        w24 w24Var = (w24) obj;
        int a = w24Var.a();
        int d = w24.d((byte) -32);
        if (d != a) {
            return d - w24Var.a();
        }
        return (true != this.a ? 20 : 21) - (true != ((h24) w24Var).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h24.class == obj.getClass() && this.a == ((h24) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(w24.d((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }
}
