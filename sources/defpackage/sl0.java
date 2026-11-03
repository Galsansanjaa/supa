package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sl0 {
    public static final sl0 a;
    public static final sl0 b;
    public static final sl0 m;
    public static final sl0 n;
    public static final sl0 o;
    public static final /* synthetic */ sl0[] p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sl0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sl0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, sl0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, sl0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, sl0] */
    static {
        ?? r0 = new Enum("WISHLIST_ADD", 0);
        a = r0;
        ?? r1 = new Enum("WISHLIST_REMOVE", 1);
        b = r1;
        ?? r3 = new Enum("RECOMMENDED_ADD", 2);
        m = r3;
        ?? r5 = new Enum("RECOMMENDED_REMOVE", 3);
        n = r5;
        ?? r7 = new Enum("LIKE", 4);
        o = r7;
        p = new sl0[]{r0, r1, r3, r5, r7};
    }

    public static sl0 valueOf(String str) {
        return (sl0) Enum.valueOf(sl0.class, str);
    }

    public static sl0[] values() {
        return (sl0[]) p.clone();
    }
}
