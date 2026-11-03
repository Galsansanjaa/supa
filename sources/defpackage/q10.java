package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class q10 {
    public static final q10 a;
    public static final q10 b;
    public static final /* synthetic */ q10[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [q10, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [q10, java.lang.Enum] */
    static {
        ?? r0 = new Enum("BULLET", 0);
        a = r0;
        ?? r1 = new Enum("ORDERED", 1);
        b = r1;
        m = new q10[]{r0, r1};
    }

    public static q10 valueOf(String str) {
        return (q10) Enum.valueOf(q10.class, str);
    }

    public static q10[] values() {
        return (q10[]) m.clone();
    }
}
