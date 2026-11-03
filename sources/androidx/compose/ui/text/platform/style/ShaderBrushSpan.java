package androidx.compose.ui.text.platform.style;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.text.platform.AndroidTextPaint_androidKt;
import defpackage.wp1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ShaderBrushSpan extends CharacterStyle implements UpdateAppearance {
    public static final int $stable = 8;
    private final float alpha;
    private final ShaderBrush shaderBrush;
    private final State<Shader> shaderState;
    private final MutableState size$delegate;

    public ShaderBrushSpan(ShaderBrush shaderBrush, float f) {
        MutableState mutableStateOf$default;
        this.shaderBrush = shaderBrush;
        this.alpha = f;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m5147boximpl(Size.Companion.m5167getUnspecifiedNHjbRc()), null, 2, null);
        this.size$delegate = mutableStateOf$default;
        this.shaderState = SnapshotStateKt.derivedStateOf(new wp1(this, 28));
    }

    public static /* synthetic */ Shader a(ShaderBrushSpan shaderBrushSpan) {
        return shaderState$lambda$0(shaderBrushSpan);
    }

    public static final Shader shaderState$lambda$0(ShaderBrushSpan shaderBrushSpan) {
        if (shaderBrushSpan.m7799getSizeNHjbRc() == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m5161isEmptyimpl(shaderBrushSpan.m7799getSizeNHjbRc())) {
            return null;
        }
        return shaderBrushSpan.shaderBrush.mo5307createShaderuvyYCjk(shaderBrushSpan.m7799getSizeNHjbRc());
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ShaderBrush getShaderBrush() {
        return this.shaderBrush;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSize-NH-jbRc */
    public final long m7799getSizeNHjbRc() {
        return ((Size) this.size$delegate.getValue()).m5164unboximpl();
    }

    /* renamed from: setSize-uvyYCjk */
    public final void m7800setSizeuvyYCjk(long j) {
        this.size$delegate.setValue(Size.m5147boximpl(j));
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        AndroidTextPaint_androidKt.setAlpha(textPaint, this.alpha);
        textPaint.setShader(this.shaderState.getValue());
    }
}
