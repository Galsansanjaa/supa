package androidx.compose.material3.tokens;

import defpackage.ej0;
import defpackage.nb0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ShapeKeyTokens {
    private static final /* synthetic */ ej0 $ENTRIES;
    private static final /* synthetic */ ShapeKeyTokens[] $VALUES;
    public static final ShapeKeyTokens CornerExtraExtraLarge = new ShapeKeyTokens("CornerExtraExtraLarge", 0);
    public static final ShapeKeyTokens CornerExtraLarge = new ShapeKeyTokens("CornerExtraLarge", 1);
    public static final ShapeKeyTokens CornerExtraLargeIncreased = new ShapeKeyTokens("CornerExtraLargeIncreased", 2);
    public static final ShapeKeyTokens CornerExtraLargeTop = new ShapeKeyTokens("CornerExtraLargeTop", 3);
    public static final ShapeKeyTokens CornerExtraSmall = new ShapeKeyTokens("CornerExtraSmall", 4);
    public static final ShapeKeyTokens CornerExtraSmallTop = new ShapeKeyTokens("CornerExtraSmallTop", 5);
    public static final ShapeKeyTokens CornerFull = new ShapeKeyTokens("CornerFull", 6);
    public static final ShapeKeyTokens CornerLarge = new ShapeKeyTokens("CornerLarge", 7);
    public static final ShapeKeyTokens CornerLargeEnd = new ShapeKeyTokens("CornerLargeEnd", 8);
    public static final ShapeKeyTokens CornerLargeIncreased = new ShapeKeyTokens("CornerLargeIncreased", 9);
    public static final ShapeKeyTokens CornerLargeStart = new ShapeKeyTokens("CornerLargeStart", 10);
    public static final ShapeKeyTokens CornerLargeTop = new ShapeKeyTokens("CornerLargeTop", 11);
    public static final ShapeKeyTokens CornerMedium = new ShapeKeyTokens("CornerMedium", 12);
    public static final ShapeKeyTokens CornerNone = new ShapeKeyTokens("CornerNone", 13);
    public static final ShapeKeyTokens CornerSmall = new ShapeKeyTokens("CornerSmall", 14);

    private static final /* synthetic */ ShapeKeyTokens[] $values() {
        return new ShapeKeyTokens[]{CornerExtraExtraLarge, CornerExtraLarge, CornerExtraLargeIncreased, CornerExtraLargeTop, CornerExtraSmall, CornerExtraSmallTop, CornerFull, CornerLarge, CornerLargeEnd, CornerLargeIncreased, CornerLargeStart, CornerLargeTop, CornerMedium, CornerNone, CornerSmall};
    }

    static {
        ShapeKeyTokens[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nb0.s($values);
    }

    private ShapeKeyTokens(String str, int i) {
    }

    public static ej0 getEntries() {
        return $ENTRIES;
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) $VALUES.clone();
    }
}
