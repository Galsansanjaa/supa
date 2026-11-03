package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class m72 {
    public final int a;
    public final Bitmap b;
    public final uk2 c;
    public final int d;

    public m72(Bitmap bitmap, uk2 uk2Var, int i, int i2) {
        if ((bitmap != null) == (uk2Var != null)) {
            throw new AssertionError();
        }
        this.b = bitmap;
        this.c = uk2Var;
        if (i == 0) {
            hu2.q("loadedFrom == null");
        }
        this.a = i;
        this.d = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m72(uk2 uk2Var, int i) {
        this(null, uk2Var, i, 0);
        StringBuilder sb = i63.a;
        if (uk2Var != null) {
        } else {
            hu2.q("source == null");
            throw null;
        }
    }
}
