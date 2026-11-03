package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import j$.util.DateRetargetClass;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mw0 {
    public static final Preferences.Key b = PreferencesKeys.longKey("fire-global");
    public static final Preferences.Key c = PreferencesKeys.longKey("fire-count");
    public static final Preferences.Key d = PreferencesKeys.stringKey("last-used-date");
    public final m71 a;

    public mw0(Context context, String str) {
        this.a = new m71(context, "FirebaseHeartBeat".concat(str));
    }

    public static String c(long j) {
        return Build.VERSION.SDK_INT >= 26 ? DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) : new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public static Preferences.Key d(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry<Preferences.Key<?>, Object> entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return PreferencesKeys.stringSetKey(entry.getKey().getName());
                    }
                }
            }
        }
        return null;
    }

    public static void f(MutablePreferences mutablePreferences, String str) {
        Preferences.Key d2 = d(mutablePreferences, str);
        if (d2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) n71.a(mutablePreferences, d2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            mutablePreferences.remove(d2);
        } else {
            mutablePreferences.set(d2, hashSet);
        }
    }

    public final synchronized void a() {
        this.a.a(new cr0(this));
    }

    public final synchronized ArrayList b() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            String c2 = c(System.currentTimeMillis());
            for (Map.Entry entry : ((Map) kx.J(mi0.a, new i71(this.a, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(c2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new ej(((Preferences.Key) entry.getKey()).getName(), new ArrayList(hashSet)));
                    }
                }
            }
            j(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized void e() {
        this.a.a(new gf(this, c(System.currentTimeMillis())));
    }

    public final synchronized boolean g(long j) {
        return h(b, j);
    }

    public final synchronized boolean h(Preferences.Key key, long j) {
        if (c(((Long) this.a.b(key, -1L)).longValue()).equals(c(j))) {
            return false;
        }
        return true;
    }

    public final synchronized void i(long j, String str) {
        try {
            try {
                String c2 = c(j);
                Preferences.Key<Set<String>> stringSetKey = PreferencesKeys.stringSetKey(str);
                this.a.a(new w4(this, c2, str, stringSetKey, 6));
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized void j(long j) {
        this.a.a(new l5(j, 4));
    }
}
