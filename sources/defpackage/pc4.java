package defpackage;

import android.net.Uri;
import java.io.OutputStream;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class pc4 implements oc4 {
    @Override // defpackage.oc4
    public final OutputStream c(Uri uri) {
        return ((ac4) this).b.c(f(uri));
    }

    @Override // defpackage.oc4
    public final void d(Uri uri) {
        ((ac4) this).b.d(f(uri));
    }

    @Override // defpackage.oc4
    public final void e(Uri uri, Uri uri2) {
        ac4 ac4Var = (ac4) this;
        ac4Var.b.e(f(uri), f(uri2));
    }

    public abstract Uri f(Uri uri);
}
