package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class a12 {
    public static final a12 a;
    public static final /* synthetic */ a12[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a12, java.lang.Enum] */
    static {
        ?? r0 = new Enum("DEFAULT", 0);
        a = r0;
        b = new a12[]{r0, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static a12 valueOf(String str) {
        return (a12) Enum.valueOf(a12.class, str);
    }

    public static a12[] values() {
        return (a12[]) b.clone();
    }
}
