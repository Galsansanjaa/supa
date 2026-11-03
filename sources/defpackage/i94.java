package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class i94 {
    public static final i94 a;
    public static final i94 b;
    public static final /* synthetic */ i94[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, i94] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, i94] */
    static {
        ?? r0 = new Enum("CONSENT", 0);
        a = r0;
        Enum r1 = new Enum("LEGITIMATE_INTEREST", 1);
        Enum r3 = new Enum("FLEXIBLE_CONSENT", 2);
        ?? r5 = new Enum("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        b = r5;
        m = new i94[]{r0, r1, r3, r5};
    }

    public static i94[] values() {
        return (i94[]) m.clone();
    }
}
