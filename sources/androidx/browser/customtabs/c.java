package androidx.browser.customtabs;

import android.os.IBinder;
import androidx.browser.auth.AuthTabSessionToken;
import androidx.browser.customtabs.CustomTabsService;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements IBinder.DeathRecipient {
    public final /* synthetic */ int a;
    public final /* synthetic */ CustomTabsService.AnonymousClass1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(CustomTabsService.AnonymousClass1 anonymousClass1, Object obj, int i) {
        this.a = i;
        this.b = anonymousClass1;
        this.c = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.a;
        Object obj = this.c;
        CustomTabsService.AnonymousClass1 anonymousClass1 = this.b;
        switch (i) {
            case 0:
                CustomTabsService.AnonymousClass1.a(anonymousClass1, (CustomTabsSessionToken) obj);
                return;
            default:
                CustomTabsService.AnonymousClass1.b(anonymousClass1, (AuthTabSessionToken) obj);
                return;
        }
    }
}
