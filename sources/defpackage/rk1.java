package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rk1 {
    public static final rk1 a;
    public static final rk1 b;
    public static final rk1 m;
    public static final /* synthetic */ rk1[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rk1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rk1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, rk1] */
    static {
        ?? r0 = new Enum("TODAY", 0);
        a = r0;
        ?? r1 = new Enum("WEEK", 1);
        b = r1;
        ?? r3 = new Enum("MONTHLY", 2);
        m = r3;
        n = new rk1[]{r0, r1, r3};
    }

    public static rk1 valueOf(String str) {
        return (rk1) Enum.valueOf(rk1.class, str);
    }

    public static rk1[] values() {
        return (rk1[]) n.clone();
    }
}
