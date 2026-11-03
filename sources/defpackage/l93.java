package defpackage;

import androidx.work.Worker;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l93 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Worker b;

    public /* synthetic */ l93(Worker worker, int i) {
        this.a = i;
        this.b = worker;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        Worker worker = this.b;
        switch (i) {
            case 0:
                return Worker.c(worker);
            default:
                return Worker.b(worker);
        }
    }
}
