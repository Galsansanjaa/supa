package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qk1 {
    public static final qk1 a;
    public static final qk1 b;
    public static final /* synthetic */ qk1[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, qk1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, qk1] */
    static {
        ?? r0 = new Enum("MOBILEDATA", 0);
        a = r0;
        ?? r1 = new Enum("WIFI", 1);
        b = r1;
        m = new qk1[]{r0, r1};
    }

    public static qk1 valueOf(String str) {
        return (qk1) Enum.valueOf(qk1.class, str);
    }

    public static qk1[] values() {
        return (qk1[]) m.clone();
    }
}
