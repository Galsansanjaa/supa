package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import defpackage.a10;
import defpackage.e50;
import defpackage.sb0;
import defpackage.vy2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable {
    private final Animatable<Dp, AnimationVector1D> animatable;
    private float defaultElevation;
    private float focusedElevation;
    private float hoveredElevation;
    private Interaction lastTargetInteraction;
    private float pressedElevation;
    private Interaction targetInteraction;

    private FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        this.animatable = new Animatable<>(Dp.m8047boximpl(f), VectorConvertersKt.getVectorConverter(Dp.Companion), null, null, 12, null);
    }

    public /* synthetic */ FloatingActionButtonElevationAnimatable(float f, float f2, float f3, float f4, sb0 sb0Var) {
        this(f, f2, f3, f4);
    }

    /* renamed from: calculateTarget-u2uoSUM, reason: not valid java name */
    private final float m2627calculateTargetu2uoSUM(Interaction interaction) {
        return interaction instanceof PressInteraction.Press ? this.pressedElevation : interaction instanceof HoverInteraction.Enter ? this.hoveredElevation : interaction instanceof FocusInteraction.Focus ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object snapElevation(defpackage.a10 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1 r0 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$snapElevation$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            defpackage.ta3.H(r5)     // Catch: java.lang.Throwable -> L25
            goto L5a
        L25:
            r5 = move-exception
            goto L5f
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ta3.H(r5)
            androidx.compose.foundation.interaction.Interaction r5 = r4.targetInteraction
            float r5 = r4.m2627calculateTargetu2uoSUM(r5)
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r4.animatable
            java.lang.Object r1 = r1.getTargetValue()
            androidx.compose.ui.unit.Dp r1 = (androidx.compose.ui.unit.Dp) r1
            float r1 = r1.m8063unboximpl()
            boolean r1 = androidx.compose.ui.unit.Dp.m8054equalsimpl0(r1, r5)
            if (r1 != 0) goto L64
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r4.animatable     // Catch: java.lang.Throwable -> L25
            androidx.compose.ui.unit.Dp r5 = androidx.compose.ui.unit.Dp.m8047boximpl(r5)     // Catch: java.lang.Throwable -> L25
            r0.label = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r5 = r1.snapTo(r5, r0)     // Catch: java.lang.Throwable -> L25
            e50 r0 = defpackage.e50.a
            if (r5 != r0) goto L5a
            return r0
        L5a:
            androidx.compose.foundation.interaction.Interaction r5 = r4.targetInteraction
            r4.lastTargetInteraction = r5
            goto L64
        L5f:
            androidx.compose.foundation.interaction.Interaction r0 = r4.targetInteraction
            r4.lastTargetInteraction = r0
            throw r5
        L64:
            vy2 r4 = defpackage.vy2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.snapElevation(a10):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, vy2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object animateElevation(androidx.compose.foundation.interaction.Interaction r5, defpackage.a10 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = (androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1 r0 = new androidx.compose.material3.FloatingActionButtonElevationAnimatable$animateElevation$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.interaction.Interaction r5 = (androidx.compose.foundation.interaction.Interaction) r5
            defpackage.ta3.H(r6)     // Catch: java.lang.Throwable -> L29
            goto L5e
        L29:
            r6 = move-exception
            goto L63
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.hu2.h(r4)
            r4 = 0
            return r4
        L32:
            defpackage.ta3.H(r6)
            float r6 = r4.m2627calculateTargetu2uoSUM(r5)
            r4.targetInteraction = r5
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r4.animatable     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.getTargetValue()     // Catch: java.lang.Throwable -> L29
            androidx.compose.ui.unit.Dp r1 = (androidx.compose.ui.unit.Dp) r1     // Catch: java.lang.Throwable -> L29
            float r1 = r1.m8063unboximpl()     // Catch: java.lang.Throwable -> L29
            boolean r1 = androidx.compose.ui.unit.Dp.m8054equalsimpl0(r1, r6)     // Catch: java.lang.Throwable -> L29
            if (r1 != 0) goto L5e
            androidx.compose.animation.core.Animatable<androidx.compose.ui.unit.Dp, androidx.compose.animation.core.AnimationVector1D> r1 = r4.animatable     // Catch: java.lang.Throwable -> L29
            androidx.compose.foundation.interaction.Interaction r3 = r4.lastTargetInteraction     // Catch: java.lang.Throwable -> L29
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L29
            r0.label = r2     // Catch: java.lang.Throwable -> L29
            java.lang.Object r6 = androidx.compose.material3.internal.ElevationKt.m3521animateElevationrAjV9yQ(r1, r6, r3, r5, r0)     // Catch: java.lang.Throwable -> L29
            e50 r0 = defpackage.e50.a
            if (r6 != r0) goto L5e
            return r0
        L5e:
            r4.lastTargetInteraction = r5
            vy2 r4 = defpackage.vy2.a
            return r4
        L63:
            r4.lastTargetInteraction = r5
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevationAnimatable.animateElevation(androidx.compose.foundation.interaction.Interaction, a10):java.lang.Object");
    }

    public final State<Dp> asState() {
        return this.animatable.asState();
    }

    /* renamed from: updateElevation-lDy3nrA, reason: not valid java name */
    public final Object m2628updateElevationlDy3nrA(float f, float f2, float f3, float f4, a10 a10Var) {
        this.defaultElevation = f;
        this.pressedElevation = f2;
        this.hoveredElevation = f3;
        this.focusedElevation = f4;
        Object snapElevation = snapElevation(a10Var);
        return snapElevation == e50.a ? snapElevation : vy2.a;
    }
}
