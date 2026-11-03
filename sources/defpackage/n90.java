package defpackage;

import android.adservices.adselection.AdSelectionConfig;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.topics.GetTopicsRequest;
import android.credentials.ClearCredentialStateException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class n90 {
    public static /* synthetic */ ReportImpressionRequest a(long j, AdSelectionConfig adSelectionConfig) {
        return new ReportImpressionRequest(j, adSelectionConfig);
    }

    public static /* synthetic */ GetTopicsRequest.Builder b() {
        return new GetTopicsRequest.Builder();
    }

    public static /* synthetic */ ClearCredentialStateException c(String str, String str2) {
        return new ClearCredentialStateException(str, str2);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void e() {
    }
}
