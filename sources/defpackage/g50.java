package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class g50 {
    public static final g50 a;
    public static final g50 b;
    public static final g50 m;
    public static final g50 n;
    public static final /* synthetic */ g50[] o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [g50, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g50, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [g50, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [g50, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("LAZY", 1);
        b = r1;
        ?? r3 = new Enum("ATOMIC", 2);
        m = r3;
        ?? r5 = new Enum("UNDISPATCHED", 3);
        n = r5;
        o = new g50[]{r0, r1, r3, r5};
    }

    public static g50 valueOf(String str) {
        return (g50) Enum.valueOf(g50.class, str);
    }

    public static g50[] values() {
        return (g50[]) o.clone();
    }
}
