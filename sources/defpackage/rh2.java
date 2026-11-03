package defpackage;

import androidx.datastore.core.DataStore;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rh2 {
    public final j20 a;
    public final kr2 b;
    public final DataStore c;
    public final AtomicReference d;

    public rh2(j20 j20Var, kr2 kr2Var, DataStore dataStore) {
        j20Var.getClass();
        kr2Var.getClass();
        dataStore.getClass();
        this.a = j20Var;
        this.b = kr2Var;
        this.c = dataStore;
        this.d = new AtomicReference();
        od4.s(ea0.a(j20Var), null, null, new ph2(this, null, 0), 3);
    }

    public final kg2 a() {
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == null) {
            Object J = kx.J(mi0.a, new ph2(this, null, 1));
            while (!atomicReference.compareAndSet(null, J) && atomicReference.get() == null) {
            }
        }
        Object obj = atomicReference.get();
        obj.getClass();
        return (kg2) obj;
    }

    public final boolean b() {
        Long l = a().e;
        Integer num = a().d;
        if (l == null || num == null) {
            return true;
        }
        this.b.getClass();
        return kr2.a().c - l.longValue() >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        android.util.Log.w("FirebaseSessions", "Failed to update config values: " + r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.kg2 r5, defpackage.c10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qh2
            if (r0 == 0) goto L13
            r0 = r6
            qh2 r0 = (defpackage.qh2) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            qh2 r0 = new qh2
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.ta3.H(r6)     // Catch: java.io.IOException -> L43
            goto L57
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            return r2
        L2c:
            defpackage.ta3.H(r6)
            androidx.datastore.core.DataStore r4 = r4.c     // Catch: java.io.IOException -> L43
            z8 r6 = new z8     // Catch: java.io.IOException -> L43
            r1 = 21
            r6.<init>(r5, r2, r1)     // Catch: java.io.IOException -> L43
            r0.m = r3     // Catch: java.io.IOException -> L43
            java.lang.Object r4 = r4.updateData(r6, r0)     // Catch: java.io.IOException -> L43
            e50 r5 = defpackage.e50.a
            if (r4 != r5) goto L57
            return r5
        L43:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to update config values: "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FirebaseSessions"
            android.util.Log.w(r5, r4)
        L57:
            vy2 r4 = defpackage.vy2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh2.c(kg2, c10):java.lang.Object");
    }
}
