package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xa1 {
    public final HashMap a = new HashMap();
    public final int b;

    public xa1(int i) {
        this.b = i;
    }

    public static String b(int i, String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > i) {
                return str.substring(0, i);
            }
        }
        return str;
    }

    public final synchronized Map a() {
        return DesugarCollections.unmodifiableMap(new HashMap(this.a));
    }

    public final synchronized boolean c(String str, String str2) {
        String b = b(this.b, str);
        if (this.a.size() >= 64 && !this.a.containsKey(b)) {
            Log.w("FirebaseCrashlytics", "Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: 64", null);
            return false;
        }
        String b2 = b(this.b, str2);
        String str3 = (String) this.a.get(b);
        if (str3 == null ? b2 == null : str3.equals(b2)) {
            return false;
        }
        this.a.put(b, b2);
        return true;
    }

    public final synchronized void d(Map map) {
        try {
            int i = 0;
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str == null) {
                    throw new IllegalArgumentException("Custom attribute key must not be null.");
                }
                String b = b(this.b, str);
                if (this.a.size() >= 64 && !this.a.containsKey(b)) {
                    i++;
                }
                String str2 = (String) entry.getValue();
                this.a.put(b, str2 == null ? "" : b(this.b, str2));
            }
            if (i > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i + " entries when adding custom keys. Maximum allowable: 64", null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
