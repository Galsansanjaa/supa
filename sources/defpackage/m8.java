package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                AppBarLayout.a((AppBarLayout) obj2, (MaterialShapeDrawable) obj, valueAnimator);
                return;
            case 1:
                DeterminateDrawable.a((DeterminateDrawable) obj2, (BaseProgressIndicatorSpec) obj, valueAnimator);
                return;
            case 2:
                ExpandCollapseAnimationHelper.a((ExpandCollapseAnimationHelper) obj2, (Rect) obj, valueAnimator);
                return;
            default:
                ((ViewPropertyAnimatorUpdateListener) obj2).onAnimationUpdate((View) obj);
                return;
        }
    }
}
