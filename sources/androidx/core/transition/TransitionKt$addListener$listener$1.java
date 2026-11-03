package androidx.core.transition;

import android.transition.Transition;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ ps0 $onCancel;
    final /* synthetic */ ps0 $onEnd;
    final /* synthetic */ ps0 $onPause;
    final /* synthetic */ ps0 $onResume;
    final /* synthetic */ ps0 $onStart;

    public TransitionKt$addListener$listener$1(ps0 ps0Var, ps0 ps0Var2, ps0 ps0Var3, ps0 ps0Var4, ps0 ps0Var5) {
        this.$onEnd = ps0Var;
        this.$onResume = ps0Var2;
        this.$onPause = ps0Var3;
        this.$onCancel = ps0Var4;
        this.$onStart = ps0Var5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        this.$onStart.invoke(transition);
    }
}
