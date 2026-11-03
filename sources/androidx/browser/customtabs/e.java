package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.browser.auth.AuthTabCallback;
import androidx.browser.customtabs.CustomTabsClient;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Bundle n;

    public /* synthetic */ e(Object obj, int i, Bundle bundle, int i2) {
        this.a = i2;
        this.b = obj;
        this.m = i;
        this.n = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((EngagementSignalsCallback) this.b).onGreatestScrollPercentageIncreased(this.m, this.n);
                return;
            case 1:
                ((EngagementSignalsCallback) this.b).onGreatestScrollPercentageIncreased(this.m, this.n);
                return;
            default:
                CustomTabsClient.AnonymousClass2.b((AuthTabCallback) this.b, this.m, this.n);
                return;
        }
    }
}
