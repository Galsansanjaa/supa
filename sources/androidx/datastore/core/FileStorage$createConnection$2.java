package androidx.datastore.core;

import androidx.datastore.core.FileStorage;
import defpackage.bb1;
import defpackage.os0;
import defpackage.vy2;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FileStorage$createConnection$2 extends bb1 implements os0 {
    final /* synthetic */ File $file;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorage$createConnection$2(File file) {
        super(0);
        this.$file = file;
    }

    @Override // defpackage.os0
    public /* bridge */ /* synthetic */ Object invoke() {
        m8316invoke();
        return vy2.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m8316invoke() {
        FileStorage.Companion companion = FileStorage.Companion;
        Object activeFilesLock$datastore_core_release = companion.getActiveFilesLock$datastore_core_release();
        File file = this.$file;
        synchronized (activeFilesLock$datastore_core_release) {
            companion.getActiveFiles$datastore_core_release().remove(file.getAbsolutePath());
        }
    }
}
