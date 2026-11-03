package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bc {
    public static final bc a;
    public static final bc b;
    public static final bc m;
    public static final bc n;
    public static final bc o;
    public static final bc p;
    public static final /* synthetic */ bc[] q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [bc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [bc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [bc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [bc, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [bc, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UPDATE", 0);
        a = r0;
        ?? r1 = new Enum("PROMOTED", 1);
        b = r1;
        ?? r3 = new Enum("LATEST", 2);
        m = r3;
        ?? r5 = new Enum("EDITOR_CHOICE", 3);
        n = r5;
        ?? r7 = new Enum("TRENDING", 4);
        o = r7;
        ?? r9 = new Enum("NONE", 5);
        p = r9;
        q = new bc[]{r0, r1, r3, r5, r7, r9};
    }

    public static bc valueOf(String str) {
        return (bc) Enum.valueOf(bc.class, str);
    }

    public static bc[] values() {
        return (bc[]) q.clone();
    }
}
