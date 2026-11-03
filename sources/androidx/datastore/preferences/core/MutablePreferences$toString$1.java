package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import defpackage.bb1;
import defpackage.ps0;
import defpackage.wd;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class MutablePreferences$toString$1 extends bb1 implements ps0 {
    public static final MutablePreferences$toString$1 INSTANCE = new MutablePreferences$toString$1();

    public MutablePreferences$toString$1() {
        super(1);
    }

    @Override // defpackage.ps0
    public final CharSequence invoke(Map.Entry<Preferences.Key<?>, Object> entry) {
        entry.getClass();
        Object value = entry.getValue();
        return "  " + entry.getKey().getName() + " = " + (value instanceof byte[] ? wd.G0((byte[]) value, ", ", null, 56) : String.valueOf(entry.getValue()));
    }
}
