package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ia2 {
    public static final ia2 a;
    public static final /* synthetic */ ia2[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, ia2] */
    static {
        ?? r0 = new Enum("ALL", 0);
        a = r0;
        b = new ia2[]{r0, new Enum("TOP_LEFT", 1), new Enum("TOP_RIGHT", 2), new Enum("BOTTOM_LEFT", 3), new Enum("BOTTOM_RIGHT", 4), new Enum("TOP", 5), new Enum("BOTTOM", 6), new Enum("LEFT", 7), new Enum("RIGHT", 8), new Enum("OTHER_TOP_LEFT", 9), new Enum("OTHER_TOP_RIGHT", 10), new Enum("OTHER_BOTTOM_LEFT", 11), new Enum("OTHER_BOTTOM_RIGHT", 12), new Enum("DIAGONAL_FROM_TOP_LEFT", 13), new Enum("DIAGONAL_FROM_TOP_RIGHT", 14)};
    }

    public static ia2 valueOf(String str) {
        return (ia2) Enum.valueOf(ia2.class, str);
    }

    public static ia2[] values() {
        return (ia2[]) b.clone();
    }
}
