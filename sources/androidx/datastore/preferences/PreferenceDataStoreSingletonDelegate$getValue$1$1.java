package androidx.datastore.preferences;

import android.content.Context;
import defpackage.bb1;
import defpackage.os0;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends bb1 implements os0 {
    final /* synthetic */ Context $applicationContext;
    final /* synthetic */ PreferenceDataStoreSingletonDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.$applicationContext = context;
        this.this$0 = preferenceDataStoreSingletonDelegate;
    }

    @Override // defpackage.os0
    public final File invoke() {
        String str;
        Context context = this.$applicationContext;
        context.getClass();
        str = this.this$0.name;
        return PreferenceDataStoreFile.preferencesDataStoreFile(context, str);
    }
}
