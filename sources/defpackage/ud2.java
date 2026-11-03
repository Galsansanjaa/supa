package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ud2 {
    public static final ud2 a;
    public static final ud2 b;
    public static final /* synthetic */ ud2[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [ud2, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ud2, java.lang.Enum] */
    static {
        ?? r0 = new Enum("APPS", 0);
        a = r0;
        ?? r1 = new Enum("CATEGORIES", 1);
        b = r1;
        m = new ud2[]{r0, r1};
    }

    public static ud2 valueOf(String str) {
        return (ud2) Enum.valueOf(ud2.class, str);
    }

    public static ud2[] values() {
        return (ud2[]) m.clone();
    }
}
