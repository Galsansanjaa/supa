package androidx.compose.animation;

import defpackage.jh2;
import defpackage.lt;
import defpackage.sb0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class EnterTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final EnterTransition None = new EnterTransitionImpl(new TransitionData(null, null, null, null, null, false, null, 127, null));

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final EnterTransition getNone() {
            return EnterTransition.None;
        }
    }

    private EnterTransition() {
    }

    public /* synthetic */ EnterTransition(sb0 sb0Var) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof EnterTransition) && jh2.k(((EnterTransition) obj).getData$animation(), getData$animation());
    }

    public abstract TransitionData getData$animation();

    public int hashCode() {
        return getData$animation().hashCode();
    }

    public final EnterTransition plus(EnterTransition enterTransition) {
        Fade fade = enterTransition.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        Slide slide = enterTransition.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        ChangeSize changeSize = enterTransition.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        Scale scale = enterTransition.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        Veil veil = enterTransition.getData$animation().getVeil();
        if (veil == null) {
            veil = getData$animation().getVeil();
        }
        Map<TransitionEffectKey<?>, TransitionEffect> effectsMap = getData$animation().getEffectsMap();
        Map<TransitionEffectKey<?>, TransitionEffect> effectsMap2 = enterTransition.getData$animation().getEffectsMap();
        effectsMap.getClass();
        effectsMap2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(effectsMap);
        linkedHashMap.putAll(effectsMap2);
        return new EnterTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, false, linkedHashMap, 32, null));
    }

    public String toString() {
        if (equals(None)) {
            return "EnterTransition.None";
        }
        TransitionData data$animation = getData$animation();
        Fade fade = data$animation.getFade();
        String fade2 = fade != null ? fade.toString() : null;
        Slide slide = data$animation.getSlide();
        String slide2 = slide != null ? slide.toString() : null;
        ChangeSize changeSize = data$animation.getChangeSize();
        String changeSize2 = changeSize != null ? changeSize.toString() : null;
        Scale scale = data$animation.getScale();
        String scale2 = scale != null ? scale.toString() : null;
        Veil veil = data$animation.getVeil();
        String veil2 = veil != null ? veil.toString() : null;
        StringBuilder D = lt.D("EnterTransition: Fade - ", fade2, ", Slide - ", slide2, ", Shrink - ");
        lt.L(D, changeSize2, ", Scale - ", scale2, ", Veil - ");
        D.append(veil2);
        return D.toString();
    }
}
