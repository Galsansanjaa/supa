package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rx1 {
    public static final rx1 a;
    public static final rx1 b;
    public static final rx1 m;
    public static final rx1 n;
    public static final rx1 o;
    public static final rx1 p;
    public static final /* synthetic */ rx1[] q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, rx1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, rx1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, rx1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, rx1] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, rx1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, rx1] */
    static {
        ?? r0 = new Enum("UNKNOWN", 0);
        a = r0;
        ?? r1 = new Enum("INVALID_PARAMETER_IN_REQUEST", 1);
        b = r1;
        ?? r3 = new Enum("HTML_5_PLAYER", 2);
        m = r3;
        ?? r5 = new Enum("VIDEO_NOT_FOUND", 3);
        n = r5;
        ?? r7 = new Enum("VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER", 4);
        o = r7;
        ?? r9 = new Enum("REQUEST_MISSING_HTTP_REFERER", 5);
        p = r9;
        q = new rx1[]{r0, r1, r3, r5, r7, r9};
    }

    public static rx1 valueOf(String str) {
        return (rx1) Enum.valueOf(rx1.class, str);
    }

    public static rx1[] values() {
        return (rx1[]) q.clone();
    }
}
