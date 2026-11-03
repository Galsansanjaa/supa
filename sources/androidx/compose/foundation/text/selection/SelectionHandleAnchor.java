package androidx.compose.foundation.text.selection;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SelectionHandleAnchor {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ SelectionHandleAnchor[] $VALUES;
    public static final SelectionHandleAnchor Left = new SelectionHandleAnchor("Left", 0);
    public static final SelectionHandleAnchor Middle = new SelectionHandleAnchor("Middle", 1);
    public static final SelectionHandleAnchor Right = new SelectionHandleAnchor("Right", 2);

    private static final /* synthetic */ SelectionHandleAnchor[] $values() {
        return new SelectionHandleAnchor[]{Left, Middle, Right};
    }

    static {
        SelectionHandleAnchor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private SelectionHandleAnchor(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) $VALUES.clone();
    }
}
