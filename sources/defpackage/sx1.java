package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sx1 {
    public static final sx1 a;
    public static final sx1 b;
    public static final sx1 m;
    public static final sx1 n;
    public static final sx1 o;
    public static final sx1 p;
    public static final sx1 q;
    public static final /* synthetic */ sx1[] r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, sx1] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, sx1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, sx1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, sx1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, sx1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, sx1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, sx1] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        a = r0;
        ?? r1 = new Enum("UNSTARTED", 1);
        b = r1;
        ?? r3 = new Enum("ENDED", 2);
        m = r3;
        ?? r5 = new Enum("PLAYING", 3);
        n = r5;
        ?? r7 = new Enum("PAUSED", 4);
        o = r7;
        ?? r9 = new Enum("BUFFERING", 5);
        p = r9;
        ?? r11 = new Enum("VIDEO_CUED", 6);
        q = r11;
        r = new sx1[]{r0, r1, r3, r5, r7, r9, r11};
    }

    public static sx1 valueOf(String str) {
        return (sx1) Enum.valueOf(sx1.class, str);
    }

    public static sx1[] values() {
        return (sx1[]) r.clone();
    }
}
