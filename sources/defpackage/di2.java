package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class di2 {
    public static final di2 a;
    public static final di2 b;
    public static final /* synthetic */ di2[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, di2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, di2] */
    static {
        ?? r0 = new Enum("GENERAL", 0);
        a = r0;
        ?? r1 = new Enum("FALLBACK", 1);
        b = r1;
        m = new di2[]{r0, r1};
    }

    public static di2 valueOf(String str) {
        return (di2) Enum.valueOf(di2.class, str);
    }

    public static di2[] values() {
        return (di2[]) m.clone();
    }
}
