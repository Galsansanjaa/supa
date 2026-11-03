package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ww3 extends ek3 implements yw3 {
    @Override // defpackage.yw3
    public final void beginAdUnitExposure(String str, long j) {
        Parcel H = H();
        H.writeString(str);
        H.writeLong(j);
        I(H, 23);
    }

    @Override // defpackage.yw3
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel H = H();
        H.writeString(str);
        H.writeString(str2);
        mv3.b(H, bundle);
        I(H, 9);
    }

    @Override // defpackage.yw3
    public final void endAdUnitExposure(String str, long j) {
        Parcel H = H();
        H.writeString(str);
        H.writeLong(j);
        I(H, 24);
    }

    @Override // defpackage.yw3
    public final void generateEventId(cx3 cx3Var) {
        Parcel H = H();
        mv3.c(H, cx3Var);
        I(H, 22);
    }

    @Override // defpackage.yw3
    public final void getCachedAppInstanceId(cx3 cx3Var) {
        Parcel H = H();
        mv3.c(H, cx3Var);
        I(H, 19);
    }

    @Override // defpackage.yw3
    public final void getConditionalUserProperties(String str, String str2, cx3 cx3Var) {
        Parcel H = H();
        H.writeString(str);
        H.writeString(str2);
        mv3.c(H, cx3Var);
        I(H, 10);
    }

    @Override // defpackage.yw3
    public final void getCurrentScreenClass(cx3 cx3Var) {
        Parcel H = H();
        mv3.c(H, cx3Var);
        I(H, 17);
    }

    @Override // defpackage.yw3
    public final void getCurrentScreenName(cx3 cx3Var) {
        Parcel H = H();
        mv3.c(H, cx3Var);
        I(H, 16);
    }

    @Override // defpackage.yw3
    public final void getGmpAppId(cx3 cx3Var) {
        Parcel H = H();
        mv3.c(H, cx3Var);
        I(H, 21);
    }

    @Override // defpackage.yw3
    public final void getMaxUserProperties(String str, cx3 cx3Var) {
        Parcel H = H();
        H.writeString(str);
        mv3.c(H, cx3Var);
        I(H, 6);
    }

    @Override // defpackage.yw3
    public final void getUserProperties(String str, String str2, boolean z, cx3 cx3Var) {
        Parcel H = H();
        H.writeString(str);
        H.writeString(str2);
        ClassLoader classLoader = mv3.a;
        H.writeInt(z ? 1 : 0);
        mv3.c(H, cx3Var);
        I(H, 5);
    }

    @Override // defpackage.yw3
    public final void initialize(l01 l01Var, by3 by3Var, long j) {
        Parcel H = H();
        mv3.c(H, l01Var);
        mv3.b(H, by3Var);
        H.writeLong(j);
        I(H, 1);
    }

    @Override // defpackage.yw3
    public final void initializeWithElapsedTime(l01 l01Var, by3 by3Var, long j, long j2) {
        Parcel H = H();
        mv3.c(H, l01Var);
        mv3.b(H, by3Var);
        H.writeLong(j);
        H.writeLong(j2);
        I(H, 60);
    }

    @Override // defpackage.yw3
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel H = H();
        H.writeString(str);
        H.writeString(str2);
        mv3.b(H, bundle);
        H.writeInt(z ? 1 : 0);
        H.writeInt(1);
        H.writeLong(j);
        H.writeLong(j2);
        I(H, 59);
    }

    @Override // defpackage.yw3
    public final void logHealthData(int i, String str, l01 l01Var, l01 l01Var2, l01 l01Var3) {
        Parcel H = H();
        H.writeInt(5);
        H.writeString("Error with data collection. Data lost.");
        mv3.c(H, l01Var);
        mv3.c(H, l01Var2);
        mv3.c(H, l01Var3);
        I(H, 33);
    }

    @Override // defpackage.yw3
    public final void onActivityCreatedByScionActivityInfo(cy3 cy3Var, Bundle bundle, long j) {
        Parcel H = H();
        mv3.b(H, cy3Var);
        mv3.b(H, bundle);
        H.writeLong(j);
        I(H, 53);
    }

    @Override // defpackage.yw3
    public final void onActivityDestroyedByScionActivityInfo(cy3 cy3Var, long j) {
        Parcel H = H();
        mv3.b(H, cy3Var);
        H.writeLong(j);
        I(H, 54);
    }

    @Override // defpackage.yw3
    public final void onActivityPausedByScionActivityInfo(cy3 cy3Var, long j) {
        Parcel H = H();
        mv3.b(H, cy3Var);
        H.writeLong(j);
        I(H, 55);
    }

    @Override // defpackage.yw3
    public final void onActivityResumedByScionActivityInfo(cy3 cy3Var, long j) {
        Parcel H = H();
        mv3.b(H, cy3Var);
        H.writeLong(j);
        I(H, 56);
    }

    @Override // defpackage.yw3
    public final void onActivitySaveInstanceStateByScionActivityInfo(cy3 cy3Var, cx3 cx3Var, long j) {
        Parcel H = H();
        mv3.b(H, cy3Var);
        mv3.c(H, cx3Var);
        H.writeLong(j);
        I(H, 57);
    }

    @Override // defpackage.yw3
    public final void onActivityStartedByScionActivityInfo(cy3 cy3Var, long j) {
        Parcel H = H();
        mv3.b(H, cy3Var);
        H.writeLong(j);
        I(H, 51);
    }

    @Override // defpackage.yw3
    public final void onActivityStoppedByScionActivityInfo(cy3 cy3Var, long j) {
        Parcel H = H();
        mv3.b(H, cy3Var);
        H.writeLong(j);
        I(H, 52);
    }

    @Override // defpackage.yw3
    public final void registerOnMeasurementEventListener(lx3 lx3Var) {
        Parcel H = H();
        mv3.c(H, lx3Var);
        I(H, 35);
    }

    @Override // defpackage.yw3
    public final void retrieveAndUploadBatches(hx3 hx3Var) {
        Parcel H = H();
        mv3.c(H, hx3Var);
        I(H, 58);
    }

    @Override // defpackage.yw3
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel H = H();
        mv3.b(H, bundle);
        H.writeLong(j);
        I(H, 8);
    }

    @Override // defpackage.yw3
    public final void setCurrentScreenByScionActivityInfo(cy3 cy3Var, String str, String str2, long j) {
        Parcel H = H();
        mv3.b(H, cy3Var);
        H.writeString(str);
        H.writeString(str2);
        H.writeLong(j);
        I(H, 50);
    }

    @Override // defpackage.yw3
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.yw3
    public final void setMeasurementEnabled(boolean z, long j) {
        Parcel H = H();
        ClassLoader classLoader = mv3.a;
        H.writeInt(z ? 1 : 0);
        H.writeLong(j);
        I(H, 11);
    }

    @Override // defpackage.yw3
    public final void setUserProperty(String str, String str2, l01 l01Var, boolean z, long j) {
        Parcel H = H();
        H.writeString("fcm");
        H.writeString("_ln");
        mv3.c(H, l01Var);
        H.writeInt(1);
        H.writeLong(j);
        I(H, 4);
    }
}
