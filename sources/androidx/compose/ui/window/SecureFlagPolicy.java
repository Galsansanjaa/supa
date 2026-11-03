package androidx.compose.ui.window;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class SecureFlagPolicy {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ SecureFlagPolicy[] $VALUES;
    public static final SecureFlagPolicy Inherit = new SecureFlagPolicy("Inherit", 0);
    public static final SecureFlagPolicy SecureOn = new SecureFlagPolicy("SecureOn", 1);
    public static final SecureFlagPolicy SecureOff = new SecureFlagPolicy("SecureOff", 2);

    private static final /* synthetic */ SecureFlagPolicy[] $values() {
        return new SecureFlagPolicy[]{Inherit, SecureOn, SecureOff};
    }

    static {
        SecureFlagPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private SecureFlagPolicy(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) $VALUES.clone();
    }
}
