package defpackage;

import android.os.Bundle;
import android.os.IInterface;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface pz0 extends IInterface {
    public static final String a = "android$support$customtabs$IAuthTabCallback".replace('$', '.');

    int getInterfaceVersion();

    void onExtraCallback(String str, Bundle bundle);

    Bundle onExtraCallbackWithResult(String str, Bundle bundle);

    void onNavigationEvent(int i, Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
