package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jc4 extends lc4 implements hc4 {
    public final FileOutputStream a;
    public final File b;

    public jc4(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.hc4
    public final File a() {
        return this.b;
    }
}
