package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vq {
    public static final vq a;
    public static final vq b;
    public static final vq m;
    public static final /* synthetic */ vq[] n;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, vq] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, vq] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, vq] */
    static {
        ?? r0 = new Enum("SUSPEND", 0);
        a = r0;
        ?? r1 = new Enum("DROP_OLDEST", 1);
        b = r1;
        ?? r3 = new Enum("DROP_LATEST", 2);
        m = r3;
        n = new vq[]{r0, r1, r3};
    }

    public static vq valueOf(String str) {
        return (vq) Enum.valueOf(vq.class, str);
    }

    public static vq[] values() {
        return (vq[]) n.clone();
    }
}
