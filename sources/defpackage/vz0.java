package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface vz0 extends IInterface {
    public static final String c = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    Bundle extraCommand(String str, Bundle bundle);

    int getInterfaceVersion();

    boolean isEngagementSignalsApiAvailable(sz0 sz0Var, Bundle bundle);

    boolean mayLaunchUrl(sz0 sz0Var, Uri uri, Bundle bundle, List list);

    boolean newAuthTabSession(pz0 pz0Var, Bundle bundle);

    boolean newSession(sz0 sz0Var);

    boolean newSessionWithExtras(sz0 sz0Var, Bundle bundle);

    int postMessage(sz0 sz0Var, String str, Bundle bundle);

    void prefetch(sz0 sz0Var, Uri uri, Bundle bundle);

    void prefetchWithMultipleUrls(sz0 sz0Var, List list, Bundle bundle);

    boolean receiveFile(sz0 sz0Var, Uri uri, int i, Bundle bundle);

    boolean requestPostMessageChannel(sz0 sz0Var, Uri uri);

    boolean requestPostMessageChannelWithExtras(sz0 sz0Var, Uri uri, Bundle bundle);

    boolean setEngagementSignalsCallback(sz0 sz0Var, IBinder iBinder, Bundle bundle);

    boolean updateVisuals(sz0 sz0Var, Bundle bundle);

    boolean validateRelationship(sz0 sz0Var, int i, Uri uri, Bundle bundle);

    boolean warmup(long j);
}
