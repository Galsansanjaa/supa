package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class dh2 {
    public static final dh2 a;
    public static final dh2 b;
    public static final /* synthetic */ dh2[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, dh2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, dh2] */
    static {
        ?? r0 = new Enum("CRASHLYTICS", 0);
        a = r0;
        ?? r1 = new Enum("PERFORMANCE", 1);
        b = r1;
        m = new dh2[]{r0, r1, new Enum("MATT_SAYS_HI", 2)};
    }

    public static dh2 valueOf(String str) {
        return (dh2) Enum.valueOf(dh2.class, str);
    }

    public static dh2[] values() {
        return (dh2[]) m.clone();
    }
}
