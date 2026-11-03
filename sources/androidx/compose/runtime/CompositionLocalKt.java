package androidx.compose.runtime;

import androidx.compose.foundation.style.StylePropertiesKt;
import defpackage.n;
import defpackage.os0;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.v2;
import defpackage.vy2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CompositionLocalKt {
    public static final void CompositionLocalProvider(CompositionLocalContext compositionLocalContext, ts0 ts0Var, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1162003659);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(compositionLocalContext) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(ts0Var) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162003659, i2, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:446)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime = compositionLocalContext.getCompositionLocals$runtime();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime.size());
            for (Map.Entry<CompositionLocal<Object>, ValueHolder<Object>> entry : compositionLocals$runtime.entrySet()) {
                arrayList.add(entry.getValue().toProvided(entry.getKey()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), ts0Var, startRestartGroup, i2 & StylePropertiesKt.TextDirectionMask);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v2(i, ts0Var, 10, compositionLocalContext));
        }
    }

    public static final void CompositionLocalProvider(ProvidedValue<?> providedValue, ts0 ts0Var, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-149765515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-149765515, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:425)");
        }
        startRestartGroup.startProvider(providedValue);
        ts0Var.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v2(i, ts0Var, 8, providedValue));
        }
    }

    public static final void CompositionLocalProvider(ProvidedValue<?>[] providedValueArr, ts0 ts0Var, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(415205898);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(415205898, i, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:405)");
        }
        startRestartGroup.startProviders(providedValueArr);
        ts0Var.invoke(startRestartGroup, Integer.valueOf((i >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new v2(i, ts0Var, 9, providedValueArr));
        }
    }

    public static final vy2 CompositionLocalProvider$lambda$0(ProvidedValue[] providedValueArr, ts0 ts0Var, int i, Composer composer, int i2) {
        CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ts0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    public static final vy2 CompositionLocalProvider$lambda$1(ProvidedValue providedValue, ts0 ts0Var, int i, Composer composer, int i2) {
        CompositionLocalProvider((ProvidedValue<?>) providedValue, ts0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    public static final vy2 CompositionLocalProvider$lambda$3(CompositionLocalContext compositionLocalContext, ts0 ts0Var, int i, Composer composer, int i2) {
        CompositionLocalProvider(compositionLocalContext, ts0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    public static /* synthetic */ Object b(HostDefaultKey hostDefaultKey, CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return compositionLocalWithHostDefaultOf$lambda$0(hostDefaultKey, compositionLocalAccessorScope);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(SnapshotMutationPolicy<T> snapshotMutationPolicy, os0 os0Var) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, os0Var);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, os0 os0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, os0Var);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithComputedDefaultOf(ps0 ps0Var) {
        return new ComputedProvidableCompositionLocal(ps0Var);
    }

    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithHostDefaultOf(HostDefaultKey<T> hostDefaultKey) {
        return compositionLocalWithComputedDefaultOf(new n(hostDefaultKey, 25));
    }

    public static final Object compositionLocalWithHostDefaultOf$lambda$0(HostDefaultKey hostDefaultKey, CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return ((HostDefaultProvider) compositionLocalAccessorScope.getCurrentValue(HostDefaultProviderKt.getLocalHostDefaultProvider())).getHostDefault(hostDefaultKey);
    }

    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(os0 os0Var) {
        return new StaticProvidableCompositionLocal(os0Var);
    }

    public static final <T> T withCompositionLocal(ProvidedValue<?> providedValue, ts0 ts0Var, Composer composer, int i) {
        composer.startProvider(providedValue);
        T t = (T) ts0Var.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endProvider();
        return t;
    }

    public static final <T> T withCompositionLocals(ProvidedValue<?>[] providedValueArr, ts0 ts0Var, Composer composer, int i) {
        composer.startProviders(providedValueArr);
        T t = (T) ts0Var.invoke(composer, Integer.valueOf((i >> 3) & 14));
        composer.endProvider();
        return t;
    }
}
