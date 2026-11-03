package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class po0 {
    public static final po0 a = new Object();
    public static final Map b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    public static no0 a(dh2 dh2Var) {
        Map map = b;
        map.getClass();
        Object obj = map.get(dh2Var);
        if (obj != null) {
            return (no0) obj;
        }
        f31.e(dh2Var, "Cannot get dependency ", ". Dependencies should be added at class load time.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x009e -> B:10:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.c10 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.oo0
            if (r0 == 0) goto L13
            r0 = r9
            oo0 r0 = (defpackage.oo0) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            oo0 r0 = new oo0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r8 = r0.p
            int r9 = r0.r
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L3a
            if (r9 != r2) goto L34
            java.lang.Object r9 = r0.o
            java.util.Map r3 = r0.n
            java.util.Map r3 = (java.util.Map) r3
            dh2 r4 = r0.m
            java.util.Iterator r5 = r0.b
            java.util.Map r6 = r0.a
            java.util.Map r6 = (java.util.Map) r6
            defpackage.ta3.H(r8)
            goto L9f
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r8)
            return r1
        L3a:
            defpackage.ta3.H(r8)
            java.util.Map r8 = defpackage.po0.b
            r8.getClass()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r3 = r8.size()
            int r3 = defpackage.fi1.P(r3)
            r9.<init>(r3)
            java.util.Set r8 = r8.entrySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r3 = r9
        L5b:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto Lb7
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r4 = r8.getKey()
            dh2 r4 = (defpackage.dh2) r4
            java.lang.Object r8 = r8.getValue()
            no0 r8 = (defpackage.no0) r8
            kf0 r6 = new kf0
            r7 = 5
            r6.<init>(r8, r7)
            r8 = r3
            java.util.Map r8 = (java.util.Map) r8
            r0.a = r8
            r0.b = r5
            r0.m = r4
            r0.n = r8
            r0.o = r9
            r0.r = r2
            f4 r8 = new f4
            r7 = 25
            r8.<init>(r6, r1, r7)
            mi0 r6 = defpackage.mi0.a
            java.lang.Object r8 = defpackage.od4.D(r6, r8, r0)
            e50 r6 = defpackage.e50.a
            if (r8 != r6) goto L9e
            return r6
        L9e:
            r6 = r3
        L9f:
            r4.getClass()
            no0 r8 = a(r4)
            q50 r8 = r8.b
            if (r8 == 0) goto Laf
            r3.put(r9, r8)
            r3 = r6
            goto L5b
        Laf:
            java.lang.String r8 = "Subscriber "
            java.lang.String r9 = " has not been registered."
            defpackage.f31.e(r4, r8, r9)
            return r1
        Lb7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.po0.b(c10):java.lang.Object");
    }
}
