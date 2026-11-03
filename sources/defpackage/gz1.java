package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class gz1 {
    public static final gz1 a;
    public static final gz1 b;
    public static final gz1 m;
    public static final /* synthetic */ gz1[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, gz1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, gz1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, gz1] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        ?? r1 = new Enum("VERY_LOW", 1);
        b = r1;
        ?? r3 = new Enum("HIGHEST", 2);
        m = r3;
        n = new gz1[]{r0, r1, r3};
    }

    public static gz1 valueOf(String str) {
        return (gz1) Enum.valueOf(gz1.class, str);
    }

    public static gz1[] values() {
        return (gz1[]) n.clone();
    }
}
