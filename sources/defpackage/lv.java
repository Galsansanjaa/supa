package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class lv {
    public static final lv a;
    public static final lv b;
    public static final /* synthetic */ lv[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, lv] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, lv] */
    static {
        ?? r0 = new Enum("NONE", 0);
        a = r0;
        Enum r1 = new Enum("ALL_JSON_OBJECTS", 1);
        ?? r3 = new Enum("POLYMORPHIC", 2);
        b = r3;
        m = new lv[]{r0, r1, r3};
    }

    public static lv valueOf(String str) {
        return (lv) Enum.valueOf(lv.class, str);
    }

    public static lv[] values() {
        return (lv[]) m.clone();
    }
}
