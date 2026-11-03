package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface r71 extends h20 {
    void cancel(CancellationException cancellationException);

    re0 d(boolean z, boolean z2, u71 u71Var);

    CancellationException e();

    boolean isActive();

    boolean isCancelled();

    Object j(c10 c10Var);

    xu l(a81 a81Var);

    re0 m(ps0 ps0Var);

    boolean start();
}
