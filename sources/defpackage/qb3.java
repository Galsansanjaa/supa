package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class qb3 {
    public static final qb3 a;
    public static final /* synthetic */ qb3[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [qb3, java.lang.Enum] */
    static {
        ?? r0 = new Enum("SDK_INIT_SUCCESS", 0);
        a = r0;
        b = new qb3[]{r0};
    }

    public static qb3 valueOf(String str) {
        return (qb3) Enum.valueOf(qb3.class, str);
    }

    public static qb3[] values() {
        return (qb3[]) b.clone();
    }
}
