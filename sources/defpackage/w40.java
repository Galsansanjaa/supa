package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class w40 {
    public static final w40 a;
    public static final w40 b;
    public static final w40 m;
    public static final w40 n;
    public static final w40 o;
    public static final /* synthetic */ w40[] p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [w40, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [w40, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [w40, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [w40, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [w40, java.lang.Enum] */
    static {
        ?? r0 = new Enum("CPU_ACQUIRED", 0);
        a = r0;
        ?? r1 = new Enum("BLOCKING", 1);
        b = r1;
        ?? r3 = new Enum("PARKING", 2);
        m = r3;
        ?? r5 = new Enum("DORMANT", 3);
        n = r5;
        ?? r7 = new Enum("TERMINATED", 4);
        o = r7;
        p = new w40[]{r0, r1, r3, r5, r7};
    }

    public static w40 valueOf(String str) {
        return (w40) Enum.valueOf(w40.class, str);
    }

    public static w40[] values() {
        return (w40[]) p.clone();
    }
}
