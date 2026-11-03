package defpackage;

import com.uptodown.workers.GetUserDataWorker;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class lu0 extends c10 {
    public /* synthetic */ Object a;
    public final /* synthetic */ GetUserDataWorker b;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu0(GetUserDataWorker getUserDataWorker, a10 a10Var) {
        super(a10Var);
        this.b = getUserDataWorker;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.m |= Integer.MIN_VALUE;
        return this.b.doWork(this);
    }
}
