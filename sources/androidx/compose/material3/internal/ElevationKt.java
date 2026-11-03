package androidx.compose.material3.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.unit.Dp;
import defpackage.a10;
import defpackage.e50;
import defpackage.sb0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ElevationKt {
    private static final TweenSpec<Dp> DefaultIncomingSpec;
    private static final TweenSpec<Dp> DefaultOutgoingSpec;
    private static final TweenSpec<Dp> HoveredOutgoingSpec;
    private static final Easing OutgoingSpecEasing;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        OutgoingSpecEasing = cubicBezierEasing;
        DefaultIncomingSpec = new TweenSpec<>(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        int i = 2;
        sb0 sb0Var = null;
        int i2 = 0;
        DefaultOutgoingSpec = new TweenSpec<>(150, i2, cubicBezierEasing, i, sb0Var);
        HoveredOutgoingSpec = new TweenSpec<>(120, i2, cubicBezierEasing, i, sb0Var);
    }

    /* renamed from: animateElevation-rAjV9yQ, reason: not valid java name */
    public static final Object m3521animateElevationrAjV9yQ(Animatable<Dp, ?> animatable, float f, Interaction interaction, Interaction interaction2, a10 a10Var) {
        AnimationSpec<Dp> incomingAnimationSpecForInteraction = interaction2 != null ? ElevationDefaults.INSTANCE.incomingAnimationSpecForInteraction(interaction2) : interaction != null ? ElevationDefaults.INSTANCE.outgoingAnimationSpecForInteraction(interaction) : null;
        e50 e50Var = e50.a;
        vy2 vy2Var = vy2.a;
        if (incomingAnimationSpecForInteraction != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, Dp.m8047boximpl(f), incomingAnimationSpecForInteraction, null, null, a10Var, 12, null);
            return animateTo$default == e50Var ? animateTo$default : vy2Var;
        }
        Object snapTo = animatable.snapTo(Dp.m8047boximpl(f), a10Var);
        return snapTo == e50Var ? snapTo : vy2Var;
    }

    /* renamed from: animateElevation-rAjV9yQ$default, reason: not valid java name */
    public static /* synthetic */ Object m3522animateElevationrAjV9yQ$default(Animatable animatable, float f, Interaction interaction, Interaction interaction2, a10 a10Var, int i, Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m3521animateElevationrAjV9yQ(animatable, f, interaction, interaction2, a10Var);
    }
}
