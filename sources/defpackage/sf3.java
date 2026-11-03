package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sf3 {
    public static final sf3 a;
    public static final sf3 b;
    public static final sf3 m;
    public static final sf3 n;
    public static final sf3 o;
    public static final sf3 p;
    public static final sf3 q;
    public static final sf3 r;
    public static final sf3 s;
    public static final sf3 t;
    public static final sf3 u;
    public static final /* synthetic */ sf3[] v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v1, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v3, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [sf3, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [sf3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("ANY_BOOLEAN", 0);
        a = r0;
        ?? r1 = new Enum("ENCODING_TYPE", 1);
        b = r1;
        ?? r3 = new Enum("MAX_ID", 2);
        m = r3;
        ?? r5 = new Enum("NUM_CUSTOM_PURPOSES", 3);
        n = r5;
        ?? r7 = new Enum("NUM_ENTRIES", 4);
        o = r7;
        ?? r9 = new Enum("NUM_RESTRICTIONS", 5);
        p = r9;
        ?? r11 = new Enum("PURPOSE_ID", 6);
        q = r11;
        ?? r13 = new Enum("RESTRICTION_TYPE", 7);
        r = r13;
        ?? r15 = new Enum("SEGMENT_TYPE", 8);
        s = r15;
        ?? r2 = new Enum("SINGLE_OR_RANGE", 9);
        t = r2;
        ?? r4 = new Enum("VENDOR_ID", 10);
        u = r4;
        v = new sf3[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2, r4};
    }

    public static sf3 valueOf(String str) {
        return (sf3) Enum.valueOf(sf3.class, str);
    }

    public static sf3[] values() {
        return (sf3[]) v.clone();
    }
}
