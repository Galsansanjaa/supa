package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hs2 {
    public static final hs2 a;
    public static final hs2 b;
    public static final hs2 m;
    public static final hs2 n;
    public static final hs2 o;
    public static final hs2 p;
    public static final hs2 q;
    public static final hs2 r;
    public static final hs2 s;
    public static final /* synthetic */ hs2[] t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, hs2] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, hs2] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, hs2] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, hs2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, hs2] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, hs2] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, hs2] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, hs2] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, hs2] */
    static {
        ?? r0 = new Enum("NONE", 0);
        a = r0;
        ?? r1 = new Enum("FEATURED_CAROUSEL", 1);
        b = r1;
        ?? r3 = new Enum("LATEST_UPDATES", 2);
        m = r3;
        ?? r5 = new Enum("TOP_DOWNLOADS", 3);
        n = r5;
        ?? r7 = new Enum("CATEGORY", 4);
        o = r7;
        ?? r9 = new Enum("RELATED_CATEGORIES", 5);
        p = r9;
        ?? r11 = new Enum("FLOATING_CATEGORY", 6);
        q = r11;
        ?? r13 = new Enum("NEW_RELEASES", 7);
        r = r13;
        ?? r15 = new Enum("MAIN_APP", 8);
        s = r15;
        t = new hs2[]{r0, r1, r3, r5, r7, r9, r11, r13, r15};
    }

    public static hs2 valueOf(String str) {
        return (hs2) Enum.valueOf(hs2.class, str);
    }

    public static hs2[] values() {
        return (hs2[]) t.clone();
    }
}
