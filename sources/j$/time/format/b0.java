package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final class b0 {
    public static final b0 LENIENT;
    public static final b0 SMART;
    public static final b0 STRICT;
    public static final /* synthetic */ b0[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.format.b0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.time.format.b0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.format.b0] */
    static {
        ?? r0 = new Enum("STRICT", 0);
        STRICT = r0;
        ?? r1 = new Enum("SMART", 1);
        SMART = r1;
        ?? r3 = new Enum("LENIENT", 2);
        LENIENT = r3;
        a = new b0[]{r0, r1, r3};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) a.clone();
    }
}
