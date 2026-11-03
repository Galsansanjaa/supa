package defpackage;

import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bx extends CharacterStyle implements UpdateAppearance {
    public final LinearGradient a;
    public final float b;

    public bx(LinearGradient linearGradient, float f) {
        this.a = linearGradient;
        this.b = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        textPaint.setShader(this.a);
        textPaint.setTextSize(this.b);
        textPaint.setColor(textPaint.linkColor);
    }
}
