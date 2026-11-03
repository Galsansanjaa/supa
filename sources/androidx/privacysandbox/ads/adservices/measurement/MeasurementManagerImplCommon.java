package androidx.privacysandbox.ads.adservices.measurement;

import android.net.Uri;
import android.view.InputEvent;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures;
import defpackage.a10;
import defpackage.e50;
import defpackage.ea0;
import defpackage.m60;
import defpackage.md;
import defpackage.qs;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class MeasurementManagerImplCommon extends MeasurementManager {
    private final android.adservices.measurement.MeasurementManager mMeasurementManager;

    public MeasurementManagerImplCommon(android.adservices.measurement.MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.mMeasurementManager = measurementManager;
    }

    public static Object deleteRegistrations$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, DeletionRequest deletionRequest, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        measurementManagerImplCommon.getMMeasurementManager().deleteRegistrations(deletionRequest.convertToAdServices$ads_adservices_release(), new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        Object s = qsVar.s();
        return s == e50.a ? s : vy2.a;
    }

    public static Object getMeasurementApiStatus$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        measurementManagerImplCommon.getMMeasurementManager().getMeasurementApiStatus(new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        return qsVar.s();
    }

    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, InputEvent inputEvent, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        measurementManagerImplCommon.getMMeasurementManager().registerSource(uri, inputEvent, new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        Object s = qsVar.s();
        return s == e50.a ? s : vy2.a;
    }

    @ExperimentalFeatures.RegisterSourceOptIn
    public static Object registerSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, SourceRegistrationRequest sourceRegistrationRequest, a10 a10Var) {
        Object u = ea0.u(new MeasurementManagerImplCommon$registerSource$4(sourceRegistrationRequest, measurementManagerImplCommon, null), a10Var);
        return u == e50.a ? u : vy2.a;
    }

    public static Object registerTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, Uri uri, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        measurementManagerImplCommon.getMMeasurementManager().registerTrigger(uri, new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        Object s = qsVar.s();
        return s == e50.a ? s : vy2.a;
    }

    public static Object registerWebSource$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebSourceRegistrationRequest webSourceRegistrationRequest, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        measurementManagerImplCommon.getMMeasurementManager().registerWebSource(webSourceRegistrationRequest.convertToAdServices$ads_adservices_release(), new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        Object s = qsVar.s();
        return s == e50.a ? s : vy2.a;
    }

    public static Object registerWebTrigger$suspendImpl(MeasurementManagerImplCommon measurementManagerImplCommon, WebTriggerRegistrationRequest webTriggerRegistrationRequest, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        measurementManagerImplCommon.getMMeasurementManager().registerWebTrigger(webTriggerRegistrationRequest.convertToAdServices$ads_adservices_release(), new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        Object s = qsVar.s();
        return s == e50.a ? s : vy2.a;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object deleteRegistrations(DeletionRequest deletionRequest, a10 a10Var) {
        return deleteRegistrations$suspendImpl(this, deletionRequest, a10Var);
    }

    public final android.adservices.measurement.MeasurementManager getMMeasurementManager() {
        return this.mMeasurementManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object getMeasurementApiStatus(a10 a10Var) {
        return getMeasurementApiStatus$suspendImpl(this, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerSource(Uri uri, InputEvent inputEvent, a10 a10Var) {
        return registerSource$suspendImpl(this, uri, inputEvent, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    @ExperimentalFeatures.RegisterSourceOptIn
    public Object registerSource(SourceRegistrationRequest sourceRegistrationRequest, a10 a10Var) {
        return registerSource$suspendImpl(this, sourceRegistrationRequest, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerTrigger(Uri uri, a10 a10Var) {
        return registerTrigger$suspendImpl(this, uri, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, a10 a10Var) {
        return registerWebSource$suspendImpl(this, webSourceRegistrationRequest, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
    public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, a10 a10Var) {
        return registerWebTrigger$suspendImpl(this, webTriggerRegistrationRequest, a10Var);
    }
}
