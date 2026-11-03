package androidx.window.core;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class VerificationMode {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ VerificationMode[] $VALUES;
    public static final VerificationMode STRICT = new VerificationMode("STRICT", 0);
    public static final VerificationMode LOG = new VerificationMode("LOG", 1);
    public static final VerificationMode QUIET = new VerificationMode("QUIET", 2);

    private static final /* synthetic */ VerificationMode[] $values() {
        return new VerificationMode[]{STRICT, LOG, QUIET};
    }

    static {
        VerificationMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private VerificationMode(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static VerificationMode valueOf(String str) {
        return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) $VALUES.clone();
    }
}
