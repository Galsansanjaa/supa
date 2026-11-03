package defpackage;

import androidx.compose.foundation.style.StylePropertiesKt;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class n24 extends w24 {
    public final long a;

    public n24(long j) {
        this.a = j;
    }

    @Override // defpackage.w24
    public final int a() {
        return w24.d(this.a >= 0 ? (byte) 0 : StylePropertiesKt.ZIndexId);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        w24 w24Var = (w24) obj;
        if (a() != w24Var.a()) {
            return a() - w24Var.a();
        }
        long abs = Math.abs(this.a);
        long abs2 = Math.abs(((n24) w24Var).a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && n24.class == obj.getClass() && this.a == ((n24) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }
}
