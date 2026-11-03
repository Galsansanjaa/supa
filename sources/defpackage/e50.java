package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class e50 {
    public static final e50 a;
    public static final e50 b;
    public static final e50 m;
    public static final /* synthetic */ e50[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [e50, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [e50, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [e50, java.lang.Enum] */
    static {
        ?? r0 = new Enum("COROUTINE_SUSPENDED", 0);
        a = r0;
        ?? r1 = new Enum("UNDECIDED", 1);
        b = r1;
        ?? r3 = new Enum("RESUMED", 2);
        m = r3;
        n = new e50[]{r0, r1, r3};
    }

    public static e50 valueOf(String str) {
        return (e50) Enum.valueOf(e50.class, str);
    }

    public static e50[] values() {
        return (e50[]) n.clone();
    }
}
