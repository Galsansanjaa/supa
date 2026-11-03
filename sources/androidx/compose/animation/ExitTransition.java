package androidx.compose.animation;

import defpackage.jh2;
import defpackage.lt;
import defpackage.sb0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class ExitTransition {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ExitTransition KeepUntilTransitionsFinished;
    private static final ExitTransition None;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final ExitTransition getKeepUntilTransitionsFinished$animation() {
            return ExitTransition.KeepUntilTransitionsFinished;
        }

        public final ExitTransition getNone() {
            return ExitTransition.None;
        }
    }

    static {
        sb0 sb0Var = null;
        Fade fade = null;
        Slide slide = null;
        ChangeSize changeSize = null;
        Scale scale = null;
        Veil veil = null;
        Map map = null;
        None = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, false, map, 127, sb0Var));
        KeepUntilTransitionsFinished = new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, true, map, 95, sb0Var));
    }

    private ExitTransition() {
    }

    public /* synthetic */ ExitTransition(sb0 sb0Var) {
        this();
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExitTransition) && jh2.k(((ExitTransition) obj).getData$animation(), getData$animation());
    }

    public abstract TransitionData getData$animation();

    public int hashCode() {
        return getData$animation().hashCode();
    }

    public final ExitTransition plus(ExitTransition exitTransition) {
        Fade fade = exitTransition.getData$animation().getFade();
        if (fade == null) {
            fade = getData$animation().getFade();
        }
        Slide slide = exitTransition.getData$animation().getSlide();
        if (slide == null) {
            slide = getData$animation().getSlide();
        }
        ChangeSize changeSize = exitTransition.getData$animation().getChangeSize();
        if (changeSize == null) {
            changeSize = getData$animation().getChangeSize();
        }
        Scale scale = exitTransition.getData$animation().getScale();
        if (scale == null) {
            scale = getData$animation().getScale();
        }
        Veil veil = exitTransition.getData$animation().getVeil();
        if (veil == null) {
            veil = getData$animation().getVeil();
        }
        boolean z = exitTransition.getData$animation().getHold() || getData$animation().getHold();
        Map<TransitionEffectKey<?>, TransitionEffect> effectsMap = getData$animation().getEffectsMap();
        Map<TransitionEffectKey<?>, TransitionEffect> effectsMap2 = exitTransition.getData$animation().getEffectsMap();
        effectsMap.getClass();
        effectsMap2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(effectsMap);
        linkedHashMap.putAll(effectsMap2);
        return new ExitTransitionImpl(new TransitionData(fade, slide, changeSize, scale, veil, z, linkedHashMap));
    }

    public String toString() {
        if (equals(None)) {
            return "ExitTransition.None";
        }
        if (equals(KeepUntilTransitionsFinished)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
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
        boolean hold = data$animation.getHold();
        StringBuilder D = lt.D("ExitTransition:  Fade - ", fade2, ",  Slide - ", slide2, ",  Shrink - ");
        lt.L(D, changeSize2, ",  Scale - ", scale2, ",  Veil - ");
        D.append(veil2);
        D.append(",  KeepUntilTransitionsFinished - ");
        D.append(hold);
        return D.toString();
    }
}
