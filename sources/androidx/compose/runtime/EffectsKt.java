package androidx.compose.runtime;

import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.tooling.ComposeToolingFlags;
import defpackage.ea0;
import defpackage.hd0;
import defpackage.hu2;
import defpackage.ic0;
import defpackage.j20;
import defpackage.jw0;
import defpackage.mi0;
import defpackage.nb0;
import defpackage.os0;
import defpackage.ps0;
import defpackage.q2;
import defpackage.qx;
import defpackage.t71;
import defpackage.ts0;
import defpackage.vy2;
import defpackage.y40;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class EffectsKt {
    private static final String DisposableEffectNoParamError = "DisposableEffect must provide one or more 'key' parameters that define the identity of the DisposableEffect and determine when its previous effect should be disposed and a new effect started for the new key.";
    private static final DisposableEffectScope InternalDisposableEffectScope = new DisposableEffectScope();
    private static final String LaunchedEffectNoParamError = "LaunchedEffect must provide one or more 'key' parameters that define the identity of the LaunchedEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    public static final void DisposableEffect(Object obj, Object obj2, Object obj3, ps0 ps0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1239538271, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:377)");
        }
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(ps0Var);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, Object obj2, ps0 ps0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:339)");
        }
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(ps0Var);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void DisposableEffect(Object obj, ps0 ps0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:302)");
        }
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DisposableEffectImpl(ps0Var);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @hd0
    public static final void DisposableEffect(ps0 ps0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-904483903, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:269)");
        }
        throw new IllegalStateException(DisposableEffectNoParamError);
    }

    public static final void DisposableEffect(Object[] objArr, ps0 ps0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:413)");
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean changed = composer.changed(copyOf.length);
        for (Object obj : copyOf) {
            changed |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new DisposableEffectImpl(ps0Var));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, Object obj3, ts0 ts0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-54093371, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:534)");
        }
        j20 applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, ts0Var);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, Object obj2, ts0 ts0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:510)");
        }
        j20 applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj) | composer.changed(obj2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, ts0Var);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void LaunchedEffect(Object obj, ts0 ts0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:491)");
        }
        j20 applyCoroutineContext = composer.getApplyCoroutineContext();
        boolean changed = composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LaunchedEffectImpl(applyCoroutineContext, ts0Var);
            composer.updateRememberedValue(rememberedValue);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @hd0
    public static final void LaunchedEffect(ts0 ts0Var, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-805415771);
        int i2 = i & 1;
        if (startRestartGroup.shouldExecute(i2 != 0, i2)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-805415771, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:475)");
            }
            hu2.h(LaunchedEffectNoParamError);
        } else {
            startRestartGroup.skipToGroupEnd();
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new q2(i, 3, ts0Var));
            }
        }
    }

    public static final void LaunchedEffect(Object[] objArr, ts0 ts0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:557)");
        }
        j20 applyCoroutineContext = composer.getApplyCoroutineContext();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        boolean changed = composer.changed(copyOf.length);
        for (Object obj : copyOf) {
            changed |= composer.changed(obj);
        }
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            composer.updateRememberedValue(new LaunchedEffectImpl(applyCoroutineContext, ts0Var));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final vy2 LaunchedEffect$lambda$0(ts0 ts0Var, int i, Composer composer, int i2) {
        LaunchedEffect(ts0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    public static final void SideEffect(Object obj, Object obj2, Object obj3, os0 os0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1659153943, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:151)");
        }
        if (composer.changed(obj) | composer.changed(obj2) | composer.changed(obj3)) {
            recordSideEffectWithTracing(composer, os0Var);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void SideEffect(Object obj, Object obj2, os0 os0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(322341111, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:118)");
        }
        if (composer.changed(obj) | composer.changed(obj2)) {
            recordSideEffectWithTracing(composer, os0Var);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void SideEffect(Object obj, os0 os0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(224973783, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:87)");
        }
        if (composer.changed(obj)) {
            recordSideEffectWithTracing(composer, os0Var);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void SideEffect(os0 os0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:60)");
        }
        recordSideEffectWithTracing(composer, os0Var);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final void SideEffect(Object[] objArr, os0 os0Var, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1304457028, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:183)");
        }
        boolean changed = composer.changed(objArr.length);
        for (Object obj : objArr) {
            changed |= composer.changed(obj);
        }
        if (changed) {
            recordSideEffectWithTracing(composer, os0Var);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final y40 createCompositionCoroutineScope(j20 j20Var, Composer composer) {
        if (j20Var.get(jw0.y) == null) {
            return new RememberedCoroutineScope(composer.getApplyCoroutineContext(), j20Var);
        }
        t71 a = nb0.a();
        a.P(new qx(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return ea0.a(a);
    }

    private static final void recordSideEffectWithTracing(Composer composer, os0 os0Var) {
        if (ComposeToolingFlags.isVerboseTracingEnabled) {
            composer.recordSideEffect(new ic0(os0Var, 3));
        } else {
            composer.recordSideEffect(os0Var);
        }
    }

    public static final vy2 recordSideEffectWithTracing$lambda$0(os0 os0Var) {
        Trace trace = Trace.INSTANCE;
        Object beginSection = trace.beginSection("Compose:SideEffect:effect");
        try {
            os0Var.invoke();
            trace.endSection(beginSection);
            return vy2.a;
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(beginSection);
            throw th;
        }
    }

    public static final y40 rememberCoroutineScope(os0 os0Var, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            os0Var = new os0() { // from class: androidx.compose.runtime.EffectsKt$rememberCoroutineScope$1
                @Override // defpackage.os0
                public final mi0 invoke() {
                    return mi0.a;
                }
            };
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = createCompositionCoroutineScope((j20) os0Var.invoke(), composer);
            composer.updateRememberedValue(rememberedValue);
        }
        return (y40) rememberedValue;
    }
}
