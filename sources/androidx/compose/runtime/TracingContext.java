package androidx.compose.runtime;

import androidx.compose.runtime.internal.Trace;
import defpackage.h20;
import defpackage.i20;
import defpackage.j20;
import defpackage.lq2;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.vy2;
import defpackage.xu3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class TracingContext implements h20, lq2 {
    public static final int $stable = 0;
    public static final Key Key = new Key(null);
    private final String name;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Key implements i20 {
        private Key() {
        }

        public /* synthetic */ Key(sb0 sb0Var) {
            this();
        }
    }

    public TracingContext(String str) {
        this.name = str;
    }

    @Override // defpackage.j20
    public /* bridge */ <R> R fold(R r, ts0 ts0Var) {
        return (R) xu3.l(this, r, ts0Var);
    }

    @Override // defpackage.j20
    public /* bridge */ <E extends h20> E get(i20 i20Var) {
        return (E) xu3.m(this, i20Var);
    }

    @Override // defpackage.h20
    public i20 getKey() {
        return Key;
    }

    @Override // defpackage.j20
    public /* bridge */ j20 minusKey(i20 i20Var) {
        return xu3.r(this, i20Var);
    }

    @Override // defpackage.j20
    public /* bridge */ j20 plus(j20 j20Var) {
        return xu3.t(this, j20Var);
    }

    @Override // defpackage.lq2
    public void restoreThreadContext(j20 j20Var, vy2 vy2Var) {
        Trace.INSTANCE.endSection(vy2.a);
    }

    @Override // defpackage.lq2
    public /* bridge */ /* synthetic */ Object updateThreadContext(j20 j20Var) {
        m4499updateThreadContext(j20Var);
        return vy2.a;
    }

    /* renamed from: updateThreadContext, reason: collision with other method in class */
    public void m4499updateThreadContext(j20 j20Var) {
        Trace.INSTANCE.beginSection(this.name);
    }
}
