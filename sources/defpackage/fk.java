package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fk {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(fk.class, "notCompletedCount$volatile");
    public final mc0[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public fk(mc0[] mc0VarArr) {
        this.a = mc0VarArr;
        this.notCompletedCount$volatile = mc0VarArr.length;
    }
}
