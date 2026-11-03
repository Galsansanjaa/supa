package androidx.compose.foundation.text;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Handle {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ Handle[] $VALUES;
    public static final Handle Cursor = new Handle("Cursor", 0);
    public static final Handle SelectionStart = new Handle("SelectionStart", 1);
    public static final Handle SelectionEnd = new Handle("SelectionEnd", 2);

    private static final /* synthetic */ Handle[] $values() {
        return new Handle[]{Cursor, SelectionStart, SelectionEnd};
    }

    static {
        Handle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private Handle(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) $VALUES.clone();
    }
}
