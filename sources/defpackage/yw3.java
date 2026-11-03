package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface yw3 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(cx3 cx3Var);

    void getAppInstanceId(cx3 cx3Var);

    void getCachedAppInstanceId(cx3 cx3Var);

    void getConditionalUserProperties(String str, String str2, cx3 cx3Var);

    void getCurrentScreenClass(cx3 cx3Var);

    void getCurrentScreenName(cx3 cx3Var);

    void getGmpAppId(cx3 cx3Var);

    void getMaxUserProperties(String str, cx3 cx3Var);

    void getSessionId(cx3 cx3Var);

    void getTestFlag(cx3 cx3Var, int i);

    void getUserProperties(String str, String str2, boolean z, cx3 cx3Var);

    void initForTests(Map map);

    void initialize(l01 l01Var, by3 by3Var, long j);

    void initializeWithElapsedTime(l01 l01Var, by3 by3Var, long j, long j2);

    void isDataCollectionEnabled(cx3 cx3Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, cx3 cx3Var, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, l01 l01Var, l01 l01Var2, l01 l01Var3);

    void onActivityCreated(l01 l01Var, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(cy3 cy3Var, Bundle bundle, long j);

    void onActivityDestroyed(l01 l01Var, long j);

    void onActivityDestroyedByScionActivityInfo(cy3 cy3Var, long j);

    void onActivityPaused(l01 l01Var, long j);

    void onActivityPausedByScionActivityInfo(cy3 cy3Var, long j);

    void onActivityResumed(l01 l01Var, long j);

    void onActivityResumedByScionActivityInfo(cy3 cy3Var, long j);

    void onActivitySaveInstanceState(l01 l01Var, cx3 cx3Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(cy3 cy3Var, cx3 cx3Var, long j);

    void onActivityStarted(l01 l01Var, long j);

    void onActivityStartedByScionActivityInfo(cy3 cy3Var, long j);

    void onActivityStopped(l01 l01Var, long j);

    void onActivityStoppedByScionActivityInfo(cy3 cy3Var, long j);

    void performAction(Bundle bundle, cx3 cx3Var, long j);

    void registerOnMeasurementEventListener(lx3 lx3Var);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(hx3 hx3Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(l01 l01Var, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(cy3 cy3Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(lx3 lx3Var);

    void setInstanceIdProvider(ay3 ay3Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, l01 l01Var, boolean z, long j);

    void unregisterOnMeasurementEventListener(lx3 lx3Var);
}
