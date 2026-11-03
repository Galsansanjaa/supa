package defpackage;

import com.google.gson.internal.bind.JsonElementTypeAdapter;
import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class s81 {
    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            x91 x91Var = new x91(new qm2(sb));
            x91Var.r = 1;
            JsonElementTypeAdapter.a.getClass();
            JsonElementTypeAdapter.e(x91Var, this);
            return sb.toString();
        } catch (IOException e) {
            qq.e(e);
            return null;
        }
    }
}
