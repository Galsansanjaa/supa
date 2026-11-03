package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class m03 {
    public static final m03 a;
    public static final m03 b;
    public static final m03 m;
    public static final /* synthetic */ m03[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [m03, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [m03, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [m03, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        a = r0;
        ?? r1 = new Enum("InstallAll", 1);
        b = r1;
        ?? r3 = new Enum("Progress", 2);
        m = r3;
        n = new m03[]{r0, r1, r3};
    }

    public static m03 valueOf(String str) {
        return (m03) Enum.valueOf(m03.class, str);
    }

    public static m03[] values() {
        return (m03[]) n.clone();
    }
}
