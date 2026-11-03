package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.browser.customtabs.CustomTabsSession;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ EngagementSignalsCallback b;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Bundle n;

    public /* synthetic */ d(EngagementSignalsCallback engagementSignalsCallback, boolean z, Bundle bundle, int i) {
        this.a = i;
        this.b = engagementSignalsCallback;
        this.m = z;
        this.n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                CustomTabsSession.AnonymousClass1.b(this.b, this.m, this.n);
                return;
            case 1:
                CustomTabsSession.AnonymousClass1.a(this.b, this.m, this.n);
                return;
            case 2:
                CustomTabsSession.AnonymousClass2.d(this.b, this.m, this.n);
                return;
            default:
                CustomTabsSession.AnonymousClass2.b(this.b, this.m, this.n);
                return;
        }
    }
}
