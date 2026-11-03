package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class f51 {
    public static final f51 a;
    public static final f51 b;
    public static final f51 m;
    public static final /* synthetic */ f51[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f51, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f51, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [f51, java.lang.Enum] */
    static {
        ?? r0 = new Enum("NONE", 0);
        a = r0;
        ?? r1 = new Enum("OTHER_INSTALLATION", 1);
        b = r1;
        ?? r3 = new Enum("INSTALLER", 2);
        m = r3;
        n = new f51[]{r0, r1, r3};
    }

    public static f51 valueOf(String str) {
        return (f51) Enum.valueOf(f51.class, str);
    }

    public static f51[] values() {
        return (f51[]) n.clone();
    }
}
