package defpackage;

import android.os.Bundle;
import android.os.IInterface;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface yz0 extends IInterface {
    public static final String d = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    int getInterfaceVersion();

    void onGreatestScrollPercentageIncreased(int i, Bundle bundle);

    void onSessionEnded(boolean z, Bundle bundle);

    void onVerticalScrollEvent(boolean z, Bundle bundle);
}
