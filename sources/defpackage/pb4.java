package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pb4 {
    public final int a;
    public final uo2 b = new uo2();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public pb4(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String pb4Var = toString();
            String valueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", lt.B(new StringBuilder(pb4Var.length() + 16 + valueOf.length()), "Finishing ", pb4Var, " with ", valueOf));
        }
        this.b.b(bundle);
    }

    public final void c(bv0 bv0Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String pb4Var = toString();
            String obj = bv0Var.toString();
            Log.d("MessengerIpcClient", lt.B(new StringBuilder(pb4Var.length() + 14 + obj.length()), "Failing ", pb4Var, " with ", obj));
        }
        this.b.a(bv0Var);
    }

    public final String toString() {
        int i = this.c;
        int length = String.valueOf(i).length();
        int i2 = this.a;
        int length2 = String.valueOf(i2).length();
        boolean a = a();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a).length() + 1);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
