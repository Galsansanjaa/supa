package androidx.compose.animation;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EnterExitState {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ EnterExitState[] $VALUES;
    public static final EnterExitState PreEnter = new EnterExitState("PreEnter", 0);
    public static final EnterExitState Visible = new EnterExitState("Visible", 1);
    public static final EnterExitState PostExit = new EnterExitState("PostExit", 2);

    private static final /* synthetic */ EnterExitState[] $values() {
        return new EnterExitState[]{PreEnter, Visible, PostExit};
    }

    static {
        EnterExitState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private EnterExitState(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) $VALUES.clone();
    }
}
