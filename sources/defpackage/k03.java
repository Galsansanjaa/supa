package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class k03 {
    public static final k03 a;
    public static final k03 b;
    public static final k03 m;
    public static final k03 n;
    public static final /* synthetic */ k03[] o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, k03] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, k03] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, k03] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, k03] */
    static {
        ?? r0 = new Enum("IDLE", 0);
        a = r0;
        ?? r1 = new Enum("SHRINKING", 1);
        b = r1;
        ?? r3 = new Enum("SMALL", 2);
        m = r3;
        ?? r5 = new Enum("GROWING", 3);
        n = r5;
        o = new k03[]{r0, r1, r3, r5};
    }

    public static k03 valueOf(String str) {
        return (k03) Enum.valueOf(k03.class, str);
    }

    public static k03[] values() {
        return (k03[]) o.clone();
    }
}
