package androidx.work;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class NetworkType {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;
    public static final NetworkType NOT_REQUIRED = new NetworkType("NOT_REQUIRED", 0);
    public static final NetworkType CONNECTED = new NetworkType("CONNECTED", 1);
    public static final NetworkType UNMETERED = new NetworkType("UNMETERED", 2);
    public static final NetworkType NOT_ROAMING = new NetworkType("NOT_ROAMING", 3);
    public static final NetworkType METERED = new NetworkType("METERED", 4);
    public static final NetworkType TEMPORARILY_UNMETERED = new NetworkType("TEMPORARILY_UNMETERED", 5);

    private static final /* synthetic */ NetworkType[] $values() {
        return new NetworkType[]{NOT_REQUIRED, CONNECTED, UNMETERED, NOT_ROAMING, METERED, TEMPORARILY_UNMETERED};
    }

    static {
        NetworkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private NetworkType(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }
}
