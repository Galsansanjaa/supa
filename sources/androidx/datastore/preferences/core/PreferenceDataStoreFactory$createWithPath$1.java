package androidx.datastore.preferences.core;

import defpackage.bb1;
import defpackage.os0;
import defpackage.tv1;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreFactory$createWithPath$1 extends bb1 implements os0 {
    final /* synthetic */ os0 $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreFactory$createWithPath$1(os0 os0Var) {
        super(0);
        this.$produceFile = os0Var;
    }

    @Override // defpackage.os0
    public final File invoke() {
        return ((tv1) this.$produceFile.invoke()).toFile();
    }
}
