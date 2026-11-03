package defpackage;

import android.text.TextUtils;
import androidx.constraintlayout.core.state.Interpolator;
import androidx.constraintlayout.core.state.Transition;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ru0 implements b10, Interpolator {
    public final /* synthetic */ String a;

    public /* synthetic */ ru0(String str) {
        this.a = str;
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        return Transition.d(this.a, f);
    }

    @Override // defpackage.b10
    public Object h(zc4 zc4Var) {
        if (!zc4Var.j()) {
            throw new ExecutionException(zc4Var.g());
        }
        String str = (String) zc4Var.h();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.a;
            if (str.endsWith(str2)) {
                return str2;
            }
        }
        throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
    }
}
