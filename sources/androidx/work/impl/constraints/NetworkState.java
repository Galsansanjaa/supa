package androidx.work.impl.constraints;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class NetworkState {
    private final boolean isBlocked;
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public NetworkState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isConnected = z;
        this.isValidated = z2;
        this.isMetered = z3;
        this.isNotRoaming = z4;
        this.isBlocked = z5;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkState.isConnected;
        }
        if ((i & 2) != 0) {
            z2 = networkState.isValidated;
        }
        if ((i & 4) != 0) {
            z3 = networkState.isMetered;
        }
        if ((i & 8) != 0) {
            z4 = networkState.isNotRoaming;
        }
        if ((i & 16) != 0) {
            z5 = networkState.isBlocked;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return networkState.copy(z, z2, z7, z4, z6);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final boolean component2() {
        return this.isValidated;
    }

    public final boolean component3() {
        return this.isMetered;
    }

    public final boolean component4() {
        return this.isNotRoaming;
    }

    public final boolean component5() {
        return this.isBlocked;
    }

    public final NetworkState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new NetworkState(z, z2, z3, z4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming && this.isBlocked == networkState.isBlocked;
    }

    public int hashCode() {
        return ((((((((this.isConnected ? 1231 : 1237) * 31) + (this.isValidated ? 1231 : 1237)) * 31) + (this.isMetered ? 1231 : 1237)) * 31) + (this.isNotRoaming ? 1231 : 1237)) * 31) + (this.isBlocked ? 1231 : 1237);
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ", isBlocked=" + this.isBlocked + ')';
    }
}
