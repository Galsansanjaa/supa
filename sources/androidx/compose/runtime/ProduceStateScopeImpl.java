package androidx.compose.runtime;

import defpackage.j20;
import defpackage.ps0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ProduceStateScopeImpl<T> implements ProduceStateScope<T>, MutableState<T> {
    private final /* synthetic */ MutableState<T> $$delegate_0;
    private final j20 coroutineContext;

    public ProduceStateScopeImpl(MutableState<T> mutableState, j20 j20Var) {
        this.$$delegate_0 = mutableState;
        this.coroutineContext = j20Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // androidx.compose.runtime.ProduceStateScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitDispose(defpackage.os0 r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.result
            int r6 = r0.label
            r1 = 1
            if (r6 == 0) goto L32
            if (r6 == r1) goto L28
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L28:
            java.lang.Object r5 = r0.L$0
            os0 r5 = (defpackage.os0) r5
            defpackage.ta3.H(r4)     // Catch: java.lang.Throwable -> L30
            goto L4e
        L30:
            r4 = move-exception
            goto L55
        L32:
            defpackage.ta3.H(r4)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L30
            r0.label = r1     // Catch: java.lang.Throwable -> L30
            qs r4 = new qs     // Catch: java.lang.Throwable -> L30
            a10 r6 = defpackage.m60.u(r0)     // Catch: java.lang.Throwable -> L30
            r4.<init>(r1, r6)     // Catch: java.lang.Throwable -> L30
            r4.u()     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.s()     // Catch: java.lang.Throwable -> L30
            e50 r6 = defpackage.e50.a
            if (r4 != r6) goto L4e
            return r6
        L4e:
            rx r4 = new rx     // Catch: java.lang.Throwable -> L30
            r6 = 4
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L30
            throw r4     // Catch: java.lang.Throwable -> L30
        L55:
            r5.invoke()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose(os0, a10):java.lang.Object");
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // androidx.compose.runtime.MutableState
    public ps0 component2() {
        return this.$$delegate_0.component2();
    }

    @Override // androidx.compose.runtime.ProduceStateScope, defpackage.y40
    public j20 getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t) {
        this.$$delegate_0.setValue(t);
    }
}
