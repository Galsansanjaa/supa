package androidx.privacysandbox.ads.adservices.adselection;

import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import defpackage.a10;
import defpackage.e50;
import defpackage.f31;
import defpackage.m60;
import defpackage.md;
import defpackage.qs;
import defpackage.sb0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class AdSelectionManagerImplCommon extends AdSelectionManager {
    private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Ext10Impl {
        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object getAdSelectionData(android.adservices.adselection.AdSelectionManager r5, androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest r6, defpackage.a10 r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$getAdSelectionData$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r4 = r0.result
                    int r7 = r0.label
                    r1 = 1
                    if (r7 == 0) goto L35
                    if (r7 != r1) goto L2e
                    java.lang.Object r5 = r0.L$1
                    androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest r5 = (androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest) r5
                    java.lang.Object r5 = r0.L$0
                    defpackage.m1.a(r5)
                    defpackage.ta3.H(r4)
                    goto L64
                L2e:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.hu2.h(r4)
                    r4 = 0
                    return r4
                L35:
                    defpackage.ta3.H(r4)
                    r0.L$0 = r5
                    r0.L$1 = r6
                    r0.label = r1
                    qs r4 = new qs
                    a10 r7 = defpackage.m60.u(r0)
                    r4.<init>(r1, r7)
                    r4.u()
                    android.adservices.adselection.GetAdSelectionDataRequest r6 = r6.convertToAdServices$ads_adservices_release()
                    md r7 = new md
                    r0 = 2
                    r7.<init>(r0)
                    android.os.OutcomeReceiver r0 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r4)
                    r5.getAdSelectionData(r6, r7, r0)
                    java.lang.Object r4 = r4.s()
                    e50 r5 = defpackage.e50.a
                    if (r4 != r5) goto L64
                    return r5
                L64:
                    android.adservices.adselection.GetAdSelectionDataOutcome r4 = (android.adservices.adselection.GetAdSelectionDataOutcome) r4
                    androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome r5 = new androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataOutcome
                    r5.<init>(r4)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.getAdSelectionData(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.GetAdSelectionDataRequest, a10):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object persistAdSelectionResult(android.adservices.adselection.AdSelectionManager r5, androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest r6, defpackage.a10 r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$persistAdSelectionResult$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r4 = r0.result
                    int r7 = r0.label
                    r1 = 1
                    if (r7 == 0) goto L35
                    if (r7 != r1) goto L2e
                    java.lang.Object r5 = r0.L$1
                    androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest r5 = (androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest) r5
                    java.lang.Object r5 = r0.L$0
                    defpackage.m1.a(r5)
                    defpackage.ta3.H(r4)
                    goto L64
                L2e:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.hu2.h(r4)
                    r4 = 0
                    return r4
                L35:
                    defpackage.ta3.H(r4)
                    r0.L$0 = r5
                    r0.L$1 = r6
                    r0.label = r1
                    qs r4 = new qs
                    a10 r7 = defpackage.m60.u(r0)
                    r4.<init>(r1, r7)
                    r4.u()
                    android.adservices.adselection.PersistAdSelectionResultRequest r6 = r6.convertToAdServices$ads_adservices_release()
                    md r7 = new md
                    r0 = 2
                    r7.<init>(r0)
                    android.os.OutcomeReceiver r0 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r4)
                    r5.persistAdSelectionResult(r6, r7, r0)
                    java.lang.Object r4 = r4.s()
                    e50 r5 = defpackage.e50.a
                    if (r4 != r5) goto L64
                    return r5
                L64:
                    android.adservices.adselection.AdSelectionOutcome r4 = defpackage.m1.b(r4)
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r5 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
                    r5.<init>(r4)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.persistAdSelectionResult(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.PersistAdSelectionResultRequest, a10):java.lang.Object");
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object selectAds(android.adservices.adselection.AdSelectionManager r5, androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig r6, defpackage.a10 r7) {
                /*
                    r4 = this;
                    boolean r0 = r7 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1
                    if (r0 == 0) goto L13
                    r0 = r7
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L18
                L13:
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$Ext10Impl$Companion$selectAds$1
                    r0.<init>(r4, r7)
                L18:
                    java.lang.Object r4 = r0.result
                    int r7 = r0.label
                    r1 = 1
                    if (r7 == 0) goto L35
                    if (r7 != r1) goto L2e
                    java.lang.Object r5 = r0.L$1
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig r5 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig) r5
                    java.lang.Object r5 = r0.L$0
                    defpackage.m1.a(r5)
                    defpackage.ta3.H(r4)
                    goto L64
                L2e:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.hu2.h(r4)
                    r4 = 0
                    return r4
                L35:
                    defpackage.ta3.H(r4)
                    r0.L$0 = r5
                    r0.L$1 = r6
                    r0.label = r1
                    qs r4 = new qs
                    a10 r7 = defpackage.m60.u(r0)
                    r4.<init>(r1, r7)
                    r4.u()
                    android.adservices.adselection.AdSelectionFromOutcomesConfig r6 = r6.convertToAdServices$ads_adservices_release()
                    md r7 = new md
                    r0 = 2
                    r7.<init>(r0)
                    android.os.OutcomeReceiver r0 = androidx.core.os.OutcomeReceiverKt.asOutcomeReceiver(r4)
                    r5.selectAds(r6, r7, r0)
                    java.lang.Object r4 = r4.s()
                    e50 r5 = defpackage.e50.a
                    if (r4 != r5) goto L64
                    return r5
                L64:
                    android.adservices.adselection.AdSelectionOutcome r4 = defpackage.m1.b(r4)
                    androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r5 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
                    r5.<init>(r4)
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.Ext10Impl.Companion.selectAds(android.adservices.adselection.AdSelectionManager, androidx.privacysandbox.ads.adservices.adselection.AdSelectionFromOutcomesConfig, a10):java.lang.Object");
            }
        }

        private Ext10Impl() {
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Ext8Impl {
        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
        /* loaded from: classes3.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(sb0 sb0Var) {
                this();
            }

            public final Object reportEvent(android.adservices.adselection.AdSelectionManager adSelectionManager, ReportEventRequest reportEventRequest, a10 a10Var) {
                qs qsVar = new qs(1, m60.u(a10Var));
                qsVar.u();
                adSelectionManager.reportEvent(reportEventRequest.convertToAdServices$ads_adservices_release(), new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
                Object s = qsVar.s();
                return s == e50.a ? s : vy2.a;
            }

            public final Object updateAdCounterHistogram(android.adservices.adselection.AdSelectionManager adSelectionManager, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, a10 a10Var) {
                qs qsVar = new qs(1, m60.u(a10Var));
                qsVar.u();
                adSelectionManager.updateAdCounterHistogram(updateAdCounterHistogramRequest.convertToAdServices$ads_adservices_release(), new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
                Object s = qsVar.s();
                return s == e50.a ? s : vy2.a;
            }
        }

        private Ext8Impl() {
        }
    }

    public AdSelectionManagerImplCommon(android.adservices.adselection.AdSelectionManager adSelectionManager) {
        adSelectionManager.getClass();
        this.mAdSelectionManager = adSelectionManager;
    }

    public static /* synthetic */ Object getAdSelectionData$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, GetAdSelectionDataRequest getAdSelectionDataRequest, a10 a10Var) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.Companion.getAdSelectionData(adSelectionManagerImplCommon.mAdSelectionManager, getAdSelectionDataRequest, a10Var);
        }
        f31.f("API is not available. Min version is API 31 ext 10");
        return null;
    }

    public static /* synthetic */ Object persistAdSelectionResult$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, PersistAdSelectionResultRequest persistAdSelectionResultRequest, a10 a10Var) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.Companion.persistAdSelectionResult(adSelectionManagerImplCommon.mAdSelectionManager, persistAdSelectionResultRequest, a10Var);
        }
        f31.f("API is not available. Min version is API 31 ext 10");
        return null;
    }

    public static Object reportEvent$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportEventRequest reportEventRequest, a10 a10Var) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 8 || adServicesInfo.extServicesVersionS() >= 9) {
            Object reportEvent = Ext8Impl.Companion.reportEvent(adSelectionManagerImplCommon.mAdSelectionManager, reportEventRequest, a10Var);
            return reportEvent == e50.a ? reportEvent : vy2.a;
        }
        f31.f("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        return null;
    }

    public static Object reportImpression$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, ReportImpressionRequest reportImpressionRequest, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        adSelectionManagerImplCommon.getMAdSelectionManager().reportImpression(reportImpressionRequest.convertToAdServices$ads_adservices_release(), new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        Object s = qsVar.s();
        return s == e50.a ? s : vy2.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object selectAds$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon r4, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig r5, defpackage.a10 r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 r0 = (androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1 r0 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon$selectAds$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.ta3.H(r6)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.ta3.H(r6)
            android.adservices.adselection.AdSelectionConfig r5 = r5.convertToAdServices$ads_adservices_release()
            r0.label = r2
            java.lang.Object r6 = r4.selectAdsInternal(r5, r0)
            e50 r4 = defpackage.e50.a
            if (r6 != r4) goto L3e
            return r4
        L3e:
            android.adservices.adselection.AdSelectionOutcome r4 = defpackage.m1.b(r6)
            androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome r5 = new androidx.privacysandbox.ads.adservices.adselection.AdSelectionOutcome
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon.selectAds$suspendImpl(androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon, androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig, a10):java.lang.Object");
    }

    public static /* synthetic */ Object selectAds$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, a10 a10Var) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 10 || adServicesInfo.extServicesVersionS() >= 10) {
            return Ext10Impl.Companion.selectAds(adSelectionManagerImplCommon.mAdSelectionManager, adSelectionFromOutcomesConfig, a10Var);
        }
        f31.f("API is not available. Min version is API 31 ext 10");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, a10 a10Var) {
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        getMAdSelectionManager().selectAds(adSelectionConfig, new md(2), OutcomeReceiverKt.asOutcomeReceiver(qsVar));
        return qsVar.s();
    }

    public static Object updateAdCounterHistogram$suspendImpl(AdSelectionManagerImplCommon adSelectionManagerImplCommon, UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, a10 a10Var) {
        AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
        if (adServicesInfo.adServicesVersion() >= 8 || adServicesInfo.extServicesVersionS() >= 9) {
            Object updateAdCounterHistogram = Ext8Impl.Companion.updateAdCounterHistogram(adSelectionManagerImplCommon.mAdSelectionManager, updateAdCounterHistogramRequest, a10Var);
            return updateAdCounterHistogram == e50.a ? updateAdCounterHistogram : vy2.a;
        }
        f31.f("API is unsupported. Min version is API 33 ext 8 or API 31/32 ext 9");
        return null;
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object getAdSelectionData(GetAdSelectionDataRequest getAdSelectionDataRequest, a10 a10Var) {
        return getAdSelectionData$suspendImpl(this, getAdSelectionDataRequest, a10Var);
    }

    public final android.adservices.adselection.AdSelectionManager getMAdSelectionManager() {
        return this.mAdSelectionManager;
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object persistAdSelectionResult(PersistAdSelectionResultRequest persistAdSelectionResultRequest, a10 a10Var) {
        return persistAdSelectionResult$suspendImpl(this, persistAdSelectionResultRequest, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object reportEvent(ReportEventRequest reportEventRequest, a10 a10Var) {
        return reportEvent$suspendImpl(this, reportEventRequest, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object reportImpression(ReportImpressionRequest reportImpressionRequest, a10 a10Var) {
        return reportImpression$suspendImpl(this, reportImpressionRequest, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object selectAds(AdSelectionConfig adSelectionConfig, a10 a10Var) {
        return selectAds$suspendImpl(this, adSelectionConfig, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object selectAds(AdSelectionFromOutcomesConfig adSelectionFromOutcomesConfig, a10 a10Var) {
        return selectAds$suspendImpl(this, adSelectionFromOutcomesConfig, a10Var);
    }

    @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
    public Object updateAdCounterHistogram(UpdateAdCounterHistogramRequest updateAdCounterHistogramRequest, a10 a10Var) {
        return updateAdCounterHistogram$suspendImpl(this, updateAdCounterHistogramRequest, a10Var);
    }
}
