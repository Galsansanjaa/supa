package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class jo1 {
    public static final jo1 a;
    public static final jo1 b;
    public static final jo1 m;
    public static final /* synthetic */ jo1[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, jo1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, jo1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, jo1] */
    static {
        ?? r0 = new Enum("NAME", 0);
        a = r0;
        ?? r1 = new Enum("DATE", 1);
        b = r1;
        ?? r3 = new Enum("SIZE", 2);
        m = r3;
        n = new jo1[]{r0, r1, r3};
    }

    public static jo1 valueOf(String str) {
        return (jo1) Enum.valueOf(jo1.class, str);
    }

    public static jo1[] values() {
        return (jo1[]) n.clone();
    }
}
