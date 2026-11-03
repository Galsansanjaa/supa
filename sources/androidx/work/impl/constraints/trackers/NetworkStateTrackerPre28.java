package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.NetworkApi24;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class NetworkStateTrackerPre28 extends ConstraintTracker<NetworkState> {
    private final ConnectivityManager connectivityManager;
    private volatile boolean isBlocked;
    private final Object lock;
    private final NetworkStateTrackerPre28$networkCallback$1 networkCallback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28$networkCallback$1] */
    public NetworkStateTrackerPre28(Context context, TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        context.getClass();
        taskExecutor.getClass();
        Object systemService = getAppContext().getSystemService("connectivity");
        systemService.getClass();
        this.connectivityManager = (ConnectivityManager) systemService;
        this.lock = new Object();
        this.networkCallback = new ConnectivityManager.NetworkCallback() { // from class: androidx.work.impl.constraints.trackers.NetworkStateTrackerPre28$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z) {
                ConnectivityManager connectivityManager;
                String str;
                Object obj;
                boolean z2;
                network.getClass();
                connectivityManager = NetworkStateTrackerPre28.this.connectivityManager;
                if (network.equals(connectivityManager.getActiveNetwork())) {
                    Logger logger = Logger.get();
                    str = NetworkStateTrackerKt.TAG;
                    logger.debug(str, "Network blocked status changed: " + z);
                    NetworkState state = NetworkStateTrackerPre28.this.getState();
                    obj = NetworkStateTrackerPre28.this.lock;
                    NetworkStateTrackerPre28 networkStateTrackerPre28 = NetworkStateTrackerPre28.this;
                    synchronized (obj) {
                        z2 = networkStateTrackerPre28.isBlocked;
                        if (z2 == z) {
                            return;
                        }
                        networkStateTrackerPre28.isBlocked = z;
                        NetworkStateTrackerPre28.this.setState(NetworkState.copy$default(state, false, false, false, false, z, 15, null));
                    }
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                String str;
                ConnectivityManager connectivityManager;
                boolean z;
                network.getClass();
                networkCapabilities.getClass();
                Logger logger = Logger.get();
                str = NetworkStateTrackerKt.TAG;
                logger.debug(str, "Network capabilities changed: " + networkCapabilities);
                NetworkStateTrackerPre28 networkStateTrackerPre28 = NetworkStateTrackerPre28.this;
                connectivityManager = networkStateTrackerPre28.connectivityManager;
                z = NetworkStateTrackerPre28.this.isBlocked;
                networkStateTrackerPre28.setState(NetworkStateTrackerKt.getActiveNetworkState(connectivityManager, z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                String str;
                network.getClass();
                Logger logger = Logger.get();
                str = NetworkStateTrackerKt.TAG;
                logger.debug(str, "Network connection lost");
                NetworkStateTrackerPre28.this.setState(new NetworkState(false, false, false, false, false));
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public NetworkState readSystemState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager, this.isBlocked);
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        String str;
        String str2;
        String str3;
        try {
            Logger logger = Logger.get();
            str3 = NetworkStateTrackerKt.TAG;
            logger.debug(str3, "Registering network callback");
            NetworkApi24.registerDefaultNetworkCallbackCompat(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e) {
            Logger logger2 = Logger.get();
            str2 = NetworkStateTrackerKt.TAG;
            logger2.error(str2, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            Logger logger3 = Logger.get();
            str = NetworkStateTrackerKt.TAG;
            logger3.error(str, "Received exception while registering network callback", e2);
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        String str;
        String str2;
        String str3;
        try {
            Logger logger = Logger.get();
            str3 = NetworkStateTrackerKt.TAG;
            logger.debug(str3, "Unregistering network callback");
            this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        } catch (IllegalArgumentException e) {
            Logger logger2 = Logger.get();
            str2 = NetworkStateTrackerKt.TAG;
            logger2.error(str2, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            Logger logger3 = Logger.get();
            str = NetworkStateTrackerKt.TAG;
            logger3.error(str, "Received exception while unregistering network callback", e2);
        }
    }
}
