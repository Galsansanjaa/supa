package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hi2 {
    public static final hi2 a;
    public static final hi2 b;
    public static final hi2 m;
    public static final /* synthetic */ hi2[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [hi2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hi2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [hi2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("START", 0);
        a = r0;
        ?? r1 = new Enum("STOP", 1);
        b = r1;
        ?? r3 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        m = r3;
        n = new hi2[]{r0, r1, r3};
    }

    public static hi2 valueOf(String str) {
        return (hi2) Enum.valueOf(hi2.class, str);
    }

    public static hi2[] values() {
        return (hi2[]) n.clone();
    }
}
