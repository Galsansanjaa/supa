package androidx.compose.ui.input.pointer;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class PointerEventPass {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ PointerEventPass[] $VALUES;
    public static final PointerEventPass Initial = new PointerEventPass("Initial", 0);
    public static final PointerEventPass Main = new PointerEventPass("Main", 1);
    public static final PointerEventPass Final = new PointerEventPass("Final", 2);

    private static final /* synthetic */ PointerEventPass[] $values() {
        return new PointerEventPass[]{Initial, Main, Final};
    }

    static {
        PointerEventPass[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private PointerEventPass(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) $VALUES.clone();
    }
}
