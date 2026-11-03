package androidx.compose.foundation.text;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;
    private final os0 place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i, int i2, os0 os0Var) {
        this.width = i;
        this.height = i2;
        this.place = os0Var;
    }

    public final int getHeight() {
        return this.height;
    }

    public final os0 getPlace() {
        return this.place;
    }

    public final int getWidth() {
        return this.width;
    }
}
