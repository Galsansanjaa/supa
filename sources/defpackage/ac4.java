package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ac4 extends pc4 {
    public final Context a;
    public String d;
    public final Object c = new Object();
    public final gc4 b = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [gc4, java.lang.Object] */
    public ac4(j40 j40Var) {
        this.a = j40Var.b;
    }

    @Override // defpackage.oc4
    public final ic4 a(Uri uri) {
        if (g(uri)) {
            throw new IOException("Android backend cannot perform remote operations without a remote backend");
        }
        File J = t61.J(f(uri));
        return new ic4(new FileInputStream(J), J);
    }

    @Override // defpackage.oc4
    public final String b() {
        return "android";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x0046. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    @Override // defpackage.pc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri f(android.net.Uri r10) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ac4.f(android.net.Uri):android.net.Uri");
    }

    public final boolean g(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
