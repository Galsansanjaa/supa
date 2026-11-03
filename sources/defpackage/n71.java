package defpackage;

import androidx.datastore.preferences.core.Preferences;
import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class n71 {
    public static final Object a(Preferences preferences, Preferences.Key key, Serializable serializable) {
        preferences.getClass();
        key.getClass();
        Object obj = preferences.get(key);
        return obj == null ? serializable : obj;
    }
}
