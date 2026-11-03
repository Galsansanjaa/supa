package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class lt1 implements LeadingMarginSpan {
    public final hi1 a;
    public final String b;
    public final Paint m = gs1.c;
    public int n;

    public lt1(hi1 hi1Var, String str) {
        this.a = hi1Var;
        this.b = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && (charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint paint2 = this.m;
            paint2.set(paint);
            hi1 hi1Var = this.a;
            hi1Var.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = hi1Var.c;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.b;
            int measureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = hi1Var.a;
            if (measureText > i10) {
                this.n = measureText;
                i10 = measureText;
            } else {
                this.n = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - measureText;
            } else {
                i8 = (i10 - measureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.n, this.a.a);
    }
}
