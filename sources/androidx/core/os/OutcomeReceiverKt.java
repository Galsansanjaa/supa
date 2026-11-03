package androidx.core.os;

import android.os.OutcomeReceiver;
import defpackage.a10;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class OutcomeReceiverKt {
    public static final <R, E extends Throwable> OutcomeReceiver asOutcomeReceiver(a10 a10Var) {
        return new ContinuationOutcomeReceiver(a10Var);
    }
}
