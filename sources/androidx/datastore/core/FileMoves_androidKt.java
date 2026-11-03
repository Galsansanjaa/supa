package androidx.datastore.core;

import android.os.Build;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class FileMoves_androidKt {
    public static final boolean atomicMoveTo(File file, File file2) {
        file.getClass();
        file2.getClass();
        return Build.VERSION.SDK_INT >= 26 ? Api26Impl.INSTANCE.move(file, file2) : file.renameTo(file2);
    }
}
