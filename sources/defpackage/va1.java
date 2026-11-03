package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class va1 {
    public static final /* synthetic */ va1[] a = {new Enum("PUBLIC", 0), new Enum("PROTECTED", 1), new Enum("INTERNAL", 2), new Enum("PRIVATE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    va1 EF5;

    public static va1 valueOf(String str) {
        return (va1) Enum.valueOf(va1.class, str);
    }

    public static va1[] values() {
        return (va1[]) a.clone();
    }
}
