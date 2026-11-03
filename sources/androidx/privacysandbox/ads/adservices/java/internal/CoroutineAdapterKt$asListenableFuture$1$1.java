package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import defpackage.bb1;
import defpackage.mc0;
import defpackage.ps0;
import defpackage.vy2;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends bb1 implements ps0 {
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    final /* synthetic */ mc0 $this_asListenableFuture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer<T> completer, mc0 mc0Var) {
        super(1);
        this.$completer = completer;
        this.$this_asListenableFuture = mc0Var;
    }

    @Override // defpackage.ps0
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return vy2.a;
    }

    public final void invoke(Throwable th) {
        if (th == null) {
            this.$completer.set(this.$this_asListenableFuture.a());
            return;
        }
        boolean z = th instanceof CancellationException;
        CallbackToFutureAdapter.Completer<T> completer = this.$completer;
        if (z) {
            completer.setCancelled();
        } else {
            completer.setException(th);
        }
    }
}
