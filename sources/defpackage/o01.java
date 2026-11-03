package defpackage;

import android.os.Bundle;
import android.os.IInterface;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface o01 extends IInterface {
    public static final String f = "android$support$customtabs$IPostMessageService".replace('$', '.');

    int getInterfaceVersion();

    void onMessageChannelReady(sz0 sz0Var, Bundle bundle);

    void onPostMessage(sz0 sz0Var, String str, Bundle bundle);
}
