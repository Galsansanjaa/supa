package androidx.datastore.preferences.core;

import defpackage.a10;
import defpackage.e50;
import defpackage.hu2;
import defpackage.lb0;
import defpackage.ta3;
import defpackage.tn2;
import defpackage.ts0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class PreferenceDataStore$updateData$2 extends tn2 implements ts0 {
    final /* synthetic */ ts0 $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStore$updateData$2(ts0 ts0Var, a10 a10Var) {
        super(2, a10Var);
        this.$transform = ts0Var;
    }

    @Override // defpackage.cm
    public final a10 create(Object obj, a10 a10Var) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.$transform, a10Var);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // defpackage.ts0
    public final Object invoke(Preferences preferences, a10 a10Var) {
        return ((PreferenceDataStore$updateData$2) create(preferences, a10Var)).invokeSuspend(vy2.a);
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            ta3.H(obj);
            Preferences preferences = (Preferences) this.L$0;
            ts0 ts0Var = this.$transform;
            this.label = 1;
            obj = ts0Var.invoke(preferences, this);
            e50 e50Var = e50.a;
            if (obj == e50Var) {
                return e50Var;
            }
        } else {
            if (i != 1) {
                hu2.h("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ta3.H(obj);
        }
        Preferences preferences2 = (Preferences) obj;
        preferences2.getClass();
        ((MutablePreferences) preferences2).freeze$datastore_preferences_core_release();
        return preferences2;
    }
}
