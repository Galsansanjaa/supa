package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class cb2 implements a10, f50 {
    public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(cb2.class, Object.class, "result");
    public final a10 a;
    private volatile Object result;

    public cb2(a10 a10Var) {
        e50 e50Var = e50.a;
        this.a = a10Var;
        this.result = e50Var;
    }

    @Override // defpackage.f50
    public final f50 getCallerFrame() {
        a10 a10Var = this.a;
        if (a10Var instanceof f50) {
            return (f50) a10Var;
        }
        return null;
    }

    @Override // defpackage.a10
    public final j20 getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.a10
    public final void resumeWith(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        while (true) {
            Object obj2 = this.result;
            e50 e50Var = e50.b;
            if (obj2 == e50Var) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, e50Var, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != e50Var) {
                        break;
                    }
                }
                return;
            }
            e50 e50Var2 = e50.a;
            if (obj2 != e50Var2) {
                hu2.h("Already resumed");
                return;
            }
            e50 e50Var3 = e50.m;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, e50Var2, e50Var3)) {
                if (atomicReferenceFieldUpdater.get(this) != e50Var2) {
                    break;
                }
            }
            this.a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.a;
    }
}
