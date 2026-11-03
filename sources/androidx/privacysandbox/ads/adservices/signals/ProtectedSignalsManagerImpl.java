package androidx.privacysandbox.ads.adservices.signals;

import android.adservices.signals.UpdateSignalsRequest;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import defpackage.a10;
import defpackage.e50;
import defpackage.m60;
import defpackage.md;
import defpackage.qs;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@ExperimentalFeatures.Ext12OptIn
/* loaded from: classes3.dex */
public class ProtectedSignalsManagerImpl extends ProtectedSignalsManager {
    private final android.adservices.signals.ProtectedSignalsManager protectedSignalsManager;

    public ProtectedSignalsManagerImpl(android.adservices.signals.ProtectedSignalsManager protectedSignalsManager) {
        protectedSignalsManager.getClass();
        this.protectedSignalsManager = protectedSignalsManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.adservices.signals.UpdateSignalsRequest convertUpdateRequest(UpdateSignalsRequest updateSignalsRequest) {
        android.adservices.signals.UpdateSignalsRequest build = new UpdateSignalsRequest.Builder(updateSignalsRequest.getUpdateUri()).build();
        build.getClass();
        return build;
    }

    public static Object updateSignals$suspendImpl(ProtectedSignalsManagerImpl protectedSignalsManagerImpl, UpdateSignalsRequest updateSignalsRequest, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        protectedSignalsManagerImpl.protectedSignalsManager.updateSignals(protectedSignalsManagerImpl.convertUpdateRequest(updateSignalsRequest), new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        Object s = qsVar.s();
        return s == e50.a ? s : vy2.a;
    }

    @Override // androidx.privacysandbox.ads.adservices.signals.ProtectedSignalsManager
    public Object updateSignals(UpdateSignalsRequest updateSignalsRequest, a10 a10Var) {
        return updateSignals$suspendImpl(this, updateSignalsRequest, a10Var);
    }
}
