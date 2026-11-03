package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yv {
    public static final yv a;
    public static final /* synthetic */ yv[] b;

    /* JADX INFO: Fake field, exist only in values array */
    yv EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, yv] */
    static {
        Enum r0 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        a = r1;
        b = new yv[]{r0, r1};
    }

    public static yv valueOf(String str) {
        return (yv) Enum.valueOf(yv.class, str);
    }

    public static yv[] values() {
        return (yv[]) b.clone();
    }
}
