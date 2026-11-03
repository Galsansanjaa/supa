package defpackage;

import java.util.function.IntSupplier;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zo2 implements IntSupplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ vi0 b;

    public /* synthetic */ zo2(vi0 vi0Var, int i) {
        this.a = i;
        this.b = vi0Var;
    }

    @Override // java.util.function.IntSupplier
    public final int getAsInt() {
        int i = this.a;
        vi0 vi0Var = this.b;
        switch (i) {
            case 0:
                return ((Integer) vi0Var.c).intValue();
            default:
                return ((Integer) vi0Var.c).intValue();
        }
    }
}
