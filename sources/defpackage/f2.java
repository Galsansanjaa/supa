package defpackage;

import android.adservices.common.AdData;
import android.app.slice.Slice;
import android.content.pm.SigningInfo;
import android.credentials.ClearCredentialStateRequest;
import android.credentials.CreateCredentialException;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import android.service.credentials.Action;
import android.service.credentials.BeginCreateCredentialRequest;
import android.service.credentials.BeginGetCredentialOption;
import android.service.credentials.CallingAppInfo;
import android.service.credentials.RemoteEntry;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class f2 {
    public static /* synthetic */ AdData.Builder a() {
        return new AdData.Builder();
    }

    public static /* synthetic */ ClearCredentialStateRequest b(Bundle bundle) {
        return new ClearCredentialStateRequest(bundle);
    }

    public static /* synthetic */ CreateCredentialException c(String str, String str2) {
        return new CreateCredentialException(str, str2);
    }

    public static /* synthetic */ CredentialOption.Builder d(Bundle bundle, String str, Bundle bundle2) {
        return new CredentialOption.Builder(str, bundle, bundle2);
    }

    public static /* synthetic */ GetCredentialException e(String str, String str2) {
        return new GetCredentialException(str, str2);
    }

    public static /* synthetic */ GetCredentialRequest.Builder f(Bundle bundle) {
        return new GetCredentialRequest.Builder(bundle);
    }

    public static /* synthetic */ Action g(Slice slice) {
        return new Action(slice);
    }

    public static /* synthetic */ BeginCreateCredentialRequest h(String str, Bundle bundle, CallingAppInfo callingAppInfo) {
        return new BeginCreateCredentialRequest(str, bundle, callingAppInfo);
    }

    public static /* synthetic */ BeginGetCredentialOption i(String str, String str2, Bundle bundle) {
        return new BeginGetCredentialOption(str, str2, bundle);
    }

    public static /* synthetic */ CallingAppInfo j(String str, SigningInfo signingInfo, String str2) {
        return new CallingAppInfo(str, signingInfo, str2);
    }

    public static /* synthetic */ RemoteEntry k(Slice slice) {
        return new RemoteEntry(slice);
    }

    public static /* synthetic */ void l() {
    }

    public static /* synthetic */ void m() {
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p() {
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void t() {
    }

    public static /* synthetic */ void u() {
    }
}
