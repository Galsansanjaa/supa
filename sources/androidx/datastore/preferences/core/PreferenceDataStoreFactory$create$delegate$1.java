package androidx.datastore.preferences.core;

import defpackage.bb1;
import defpackage.os0;
import defpackage.um2;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory$create$delegate$1 extends bb1 implements os0 {
    final /* synthetic */ os0 $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$create$delegate$1(os0 os0Var) {
        super(0);
        this.$produceFile = os0Var;
    }

    @Override // defpackage.os0
    public final File invoke() {
        File file = (File) this.$produceFile.invoke();
        file.getClass();
        String name = file.getName();
        name.getClass();
        int x0 = um2.x0(name, '.');
        if ((x0 == -1 ? "" : name.substring(x0 + 1, name.length())).equals("preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            absoluteFile.getClass();
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
