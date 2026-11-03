package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class s90 extends MetricAffectingSpan {
    public static final /* synthetic */ int n = 0;
    public final float a;
    public final Typeface b;
    public final int m;

    public s90(float f, Typeface typeface, int i) {
        typeface.getClass();
        this.a = f;
        this.b = typeface;
        this.m = i;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setTextSize(this.a);
        textPaint.setTypeface(this.b);
        textPaint.setColor(this.m);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setTextSize(this.a);
        textPaint.setTypeface(this.b);
        textPaint.setColor(this.m);
    }
}
