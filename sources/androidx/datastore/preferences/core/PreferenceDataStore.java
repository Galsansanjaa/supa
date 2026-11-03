package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import defpackage.a10;
import defpackage.jp0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    public PreferenceDataStore(DataStore<Preferences> dataStore) {
        dataStore.getClass();
        this.delegate = dataStore;
    }

    @Override // androidx.datastore.core.DataStore
    public jp0 getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(ts0 ts0Var, a10 a10Var) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(ts0Var, null), a10Var);
    }
}
