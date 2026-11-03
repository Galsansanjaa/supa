package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qx1 {
    public static final qx1 a;
    public static final qx1 b;
    public static final qx1 m;
    public static final qx1 n;
    public static final qx1 o;
    public static final qx1 p;
    public static final qx1 q;
    public static final qx1 r;
    public static final qx1 s;
    public static final /* synthetic */ qx1[] t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qx1] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, qx1] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, qx1] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, qx1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qx1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, qx1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, qx1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, qx1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, qx1] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        a = r0;
        ?? r1 = new Enum("RATE_0_25", 1);
        b = r1;
        ?? r3 = new Enum("RATE_0_5", 2);
        m = r3;
        ?? r5 = new Enum("RATE_0_75", 3);
        n = r5;
        ?? r7 = new Enum("RATE_1", 4);
        o = r7;
        ?? r9 = new Enum("RATE_1_25", 5);
        p = r9;
        ?? r11 = new Enum("RATE_1_5", 6);
        q = r11;
        ?? r13 = new Enum("RATE_1_75", 7);
        r = r13;
        ?? r15 = new Enum("RATE_2", 8);
        s = r15;
        t = new qx1[]{r0, r1, r3, r5, r7, r9, r11, r13, r15};
    }

    public static qx1 valueOf(String str) {
        return (qx1) Enum.valueOf(qx1.class, str);
    }

    public static qx1[] values() {
        return (qx1[]) t.clone();
    }
}
