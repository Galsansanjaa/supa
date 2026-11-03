package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gc4 implements oc4 {
    @Override // defpackage.oc4
    public final ic4 a(Uri uri) {
        File J = t61.J(uri);
        return new ic4(new FileInputStream(J), J);
    }

    @Override // defpackage.oc4
    public final String b() {
        return "file";
    }

    @Override // defpackage.oc4
    public final OutputStream c(Uri uri) {
        File J = t61.J(uri);
        xu3.h(J);
        return new jc4(new FileOutputStream(J), J);
    }

    @Override // defpackage.oc4
    public final void d(Uri uri) {
        File J = t61.J(uri);
        if (J.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (J.delete()) {
            return;
        }
        if (!J.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.oc4
    public final void e(Uri uri, Uri uri2) {
        File J = t61.J(uri);
        File J2 = t61.J(uri2);
        xu3.h(J2);
        if (!J.renameTo(J2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
