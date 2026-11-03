package defpackage;

import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.adselection.ReportEventRequest;
import android.adservices.adselection.ReportImpressionRequest;
import android.adservices.common.KeyedFrequencyCap;
import j$.time.Duration;
import j$.time.TimeConversions;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class g2 {
    public static /* synthetic */ GetAdSelectionDataRequest.Builder a() {
        return new GetAdSelectionDataRequest.Builder();
    }

    public static /* synthetic */ ReportEventRequest.Builder b(long j, String str, String str2, int i) {
        return new ReportEventRequest.Builder(j, str, str2, i);
    }

    public static /* synthetic */ ReportImpressionRequest c(long j) {
        return new ReportImpressionRequest(j);
    }

    public static /* synthetic */ KeyedFrequencyCap.Builder d(int i, int i2, Duration duration) {
        return new KeyedFrequencyCap.Builder(i, i2, TimeConversions.convert(duration));
    }

    public static /* synthetic */ void e() {
    }
}
