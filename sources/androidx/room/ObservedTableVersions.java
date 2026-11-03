package androidx.room;

import defpackage.kx;
import defpackage.mm1;
import defpackage.zl2;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ObservedTableVersions {
    private final mm1 versions;

    public ObservedTableVersions(int i) {
        this.versions = kx.a(new int[i]);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.kp0 r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.room.ObservedTableVersions$collect$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.ObservedTableVersions$collect$1 r0 = (androidx.room.ObservedTableVersions$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.ObservedTableVersions$collect$1 r0 = new androidx.room.ObservedTableVersions$collect$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L28
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L28:
            rx r4 = defpackage.vg1.w(r6)
            throw r4
        L2d:
            defpackage.ta3.H(r6)
            mm1 r4 = r4.versions
            r0.label = r2
            zl2 r4 = (defpackage.zl2) r4
            r4.collect(r5, r0)
            e50 r4 = defpackage.e50.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.ObservedTableVersions.collect(kp0, a10):java.lang.Object");
    }

    public final void increment(Set<Integer> set) {
        zl2 zl2Var;
        Object value;
        int[] iArr;
        set.getClass();
        if (set.isEmpty()) {
            return;
        }
        mm1 mm1Var = this.versions;
        do {
            zl2Var = (zl2) mm1Var;
            value = zl2Var.getValue();
            int[] iArr2 = (int[]) value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = set.contains(Integer.valueOf(i)) ? iArr2[i] + 1 : iArr2[i];
            }
        } while (!zl2Var.i(value, iArr));
    }
}
