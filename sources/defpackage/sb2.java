package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sb2 {
    public static final sb2 a;
    public static final sb2 b;
    public static final sb2 m;
    public static final /* synthetic */ sb2[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [sb2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sb2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [sb2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NETWORK_UNMETERED", 0);
        a = r0;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        b = r1;
        ?? r3 = new Enum("DEVICE_CHARGING", 2);
        m = r3;
        n = new sb2[]{r0, r1, r3};
    }

    public static sb2 valueOf(String str) {
        return (sb2) Enum.valueOf(sb2.class, str);
    }

    public static sb2[] values() {
        return (sb2[]) n.clone();
    }
}
