package androidx.room.concurrent;

import defpackage.ps0;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class AtomicsKt {
    public static final Void loop(AtomicInteger atomicInteger, ps0 ps0Var) {
        atomicInteger.getClass();
        ps0Var.getClass();
        while (true) {
            ps0Var.invoke(Integer.valueOf(atomicInteger.get()));
        }
    }
}
