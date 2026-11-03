package androidx.compose.ui.state;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ToggleableState {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ ToggleableState[] $VALUES;
    public static final ToggleableState On = new ToggleableState("On", 0);
    public static final ToggleableState Off = new ToggleableState("Off", 1);
    public static final ToggleableState Indeterminate = new ToggleableState("Indeterminate", 2);

    private static final /* synthetic */ ToggleableState[] $values() {
        return new ToggleableState[]{On, Off, Indeterminate};
    }

    static {
        ToggleableState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private ToggleableState(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) $VALUES.clone();
    }
}
