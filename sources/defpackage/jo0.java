package defpackage;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class jo0 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ jo0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                File dataStoreFile = DataStoreFile.dataStoreFile(context, "firebaseSessions/sessionConfigsDataStore.data");
                ko0.a(dataStoreFile);
                return dataStoreFile;
            default:
                File dataStoreFile2 = DataStoreFile.dataStoreFile(context, "firebaseSessions/sessionDataStore.data");
                ko0.a(dataStoreFile2);
                return dataStoreFile2;
        }
    }
}
