package androidx.compose.foundation;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutatePriority {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ MutatePriority[] $VALUES;
    public static final MutatePriority Default = new MutatePriority("Default", 0);
    public static final MutatePriority UserInput = new MutatePriority("UserInput", 1);
    public static final MutatePriority PreventUserInput = new MutatePriority("PreventUserInput", 2);

    private static final /* synthetic */ MutatePriority[] $values() {
        return new MutatePriority[]{Default, UserInput, PreventUserInput};
    }

    static {
        MutatePriority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private MutatePriority(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) $VALUES.clone();
    }
}
