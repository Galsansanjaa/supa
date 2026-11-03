package defpackage;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class jd1 implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) ((Math.cos(10.0d * f) * Math.pow(2.718281828459045d, (-f) / 0.2d) * (-1.0d)) + 1.0d);
    }
}
