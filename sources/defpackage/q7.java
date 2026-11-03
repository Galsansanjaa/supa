package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class q7 {
    public static final q7 a;
    public static final q7 b;
    public static final q7 m;
    public static final /* synthetic */ q7[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q7] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, q7] */
    static {
        ?? r0 = new Enum("OUTDATED", 0);
        a = r0;
        ?? r1 = new Enum("UPDATED", 1);
        b = r1;
        ?? r3 = new Enum("UNAVAILABLE", 2);
        m = r3;
        n = new q7[]{r0, r1, r3};
    }

    public static q7 valueOf(String str) {
        return (q7) Enum.valueOf(q7.class, str);
    }

    public static q7[] values() {
        return (q7[]) n.clone();
    }
}
