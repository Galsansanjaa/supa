package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class z1 {
    public static final z1 a;
    public static final z1 b;
    public static final /* synthetic */ z1[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, z1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, z1] */
    static {
        ?? r0 = new Enum("DOWNLOADED", 0);
        a = r0;
        ?? r1 = new Enum("INSTALLED", 1);
        b = r1;
        m = new z1[]{r0, r1};
    }

    public static z1 valueOf(String str) {
        return (z1) Enum.valueOf(z1.class, str);
    }

    public static z1[] values() {
        return (z1[]) m.clone();
    }
}
