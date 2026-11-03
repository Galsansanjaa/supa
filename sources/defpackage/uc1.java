package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class uc1 {
    public static final uc1 a;
    public static final uc1 b;
    public static final /* synthetic */ uc1[] m;

    /* JADX INFO: Fake field, exist only in values array */
    uc1 EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [uc1, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [uc1, java.lang.Enum] */
    static {
        Enum r0 = new Enum("SYNCHRONIZED", 0);
        ?? r1 = new Enum("PUBLICATION", 1);
        a = r1;
        ?? r3 = new Enum("NONE", 2);
        b = r3;
        m = new uc1[]{r0, r1, r3};
    }

    public static uc1 valueOf(String str) {
        return (uc1) Enum.valueOf(uc1.class, str);
    }

    public static uc1[] values() {
        return (uc1[]) m.clone();
    }
}
