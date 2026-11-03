package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class px1 {
    public static final px1 a;
    public static final px1 b;
    public static final px1 m;
    public static final px1 n;
    public static final px1 o;
    public static final px1 p;
    public static final px1 q;
    public static final px1 r;
    public static final /* synthetic */ px1[] s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, px1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, px1] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        a = r0;
        ?? r1 = new Enum("SMALL", 1);
        b = r1;
        ?? r3 = new Enum("MEDIUM", 2);
        m = r3;
        ?? r5 = new Enum("LARGE", 3);
        n = r5;
        ?? r7 = new Enum("HD720", 4);
        o = r7;
        ?? r9 = new Enum("HD1080", 5);
        p = r9;
        ?? r11 = new Enum("HIGH_RES", 6);
        q = r11;
        ?? r13 = new Enum("DEFAULT", 7);
        r = r13;
        s = new px1[]{r0, r1, r3, r5, r7, r9, r11, r13};
    }

    public static px1 valueOf(String str) {
        return (px1) Enum.valueOf(px1.class, str);
    }

    public static px1[] values() {
        return (px1[]) s.clone();
    }
}
