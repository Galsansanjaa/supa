package defpackage;

import androidx.collection.ArrayMap;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class b74 {
    public static final ArrayMap a = new ArrayMap();

    public static synchronized void a() {
        synchronized (b74.class) {
            ArrayMap arrayMap = a;
            Iterator it = arrayMap.values().iterator();
            if (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                throw null;
            }
            arrayMap.clear();
        }
    }
}
