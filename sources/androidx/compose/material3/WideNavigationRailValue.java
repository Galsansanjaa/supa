package androidx.compose.material3;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class WideNavigationRailValue {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ WideNavigationRailValue[] $VALUES;
    public static final WideNavigationRailValue Collapsed = new WideNavigationRailValue("Collapsed", 0);
    public static final WideNavigationRailValue Expanded = new WideNavigationRailValue("Expanded", 1);

    private static final /* synthetic */ WideNavigationRailValue[] $values() {
        return new WideNavigationRailValue[]{Collapsed, Expanded};
    }

    static {
        WideNavigationRailValue[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private WideNavigationRailValue(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static WideNavigationRailValue valueOf(String str) {
        return (WideNavigationRailValue) Enum.valueOf(WideNavigationRailValue.class, str);
    }

    public static WideNavigationRailValue[] values() {
        return (WideNavigationRailValue[]) $VALUES.clone();
    }
}
