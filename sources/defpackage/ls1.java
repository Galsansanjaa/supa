package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class ls1 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final fe a(File file) {
        file.getClass();
        return new fe(new FileInputStream(file), or2.d);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, or2] */
    public static final fe b(InputStream inputStream) {
        inputStream.getClass();
        return new fe(inputStream, (or2) new Object());
    }
}
