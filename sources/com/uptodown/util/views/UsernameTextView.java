package com.uptodown.util.views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import com.uptodown.R;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class UsernameTextView extends AppCompatTextView {
    public static final /* synthetic */ int t = 0;
    public ValueAnimator a;
    public float b;
    public int[] m;
    public Integer n;
    public long o;
    public long p;
    public boolean q;
    public String r;
    public Handler s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UsernameTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    public UsernameTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.s = new Handler(Looper.getMainLooper());
        this.n = Integer.valueOf(getCurrentTextColor());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void b() {
        int color;
        getPaint().setShader(null);
        String str = this.r;
        if (str != null) {
            switch (str.hashCode()) {
                case 110843959:
                    if (str.equals("type1")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_1_1);
                        break;
                    }
                    break;
                case 110843960:
                    if (str.equals("type2")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_2_1);
                        break;
                    }
                    break;
                case 110843961:
                    if (str.equals("type3")) {
                        color = ContextCompat.getColor(getContext(), R.color.turbo_username_type_3_1);
                        break;
                    }
                    break;
            }
            setTextColor(color);
        }
        color = ContextCompat.getColor(getContext(), R.color.text_terciary);
        setTextColor(color);
    }

    public final Handler getAnimationHandler() {
        return this.s;
    }

    public final String getUsernameFormat() {
        return this.r;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        if (this.m != null) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                b();
            } else {
                float width = getWidth();
                int[] iArr = this.m;
                iArr.getClass();
                float f = this.b;
                getPaint().setShader(new LinearGradient(0.0f, 0.0f, width, 0.0f, iArr, new float[]{0.0f, f, f, f, 1.0f}, Shader.TileMode.CLAMP));
            }
        } else {
            Integer num = this.n;
            if (num != null) {
                num.getClass();
                setTextColor(num.intValue());
            }
        }
        super.onDraw(canvas);
    }

    public final void setAnimationHandler(Handler handler) {
        this.s = handler;
    }

    public final void setTurbo(boolean z) {
        this.q = z;
    }

    public final void setUsernameFormat(String str) {
        this.r = str;
    }
}
