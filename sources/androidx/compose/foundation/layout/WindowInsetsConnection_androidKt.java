package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ps0;
import defpackage.t1;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class WindowInsetsConnection_androidKt {
    private static final double DecelMinusOne;
    private static final double DecelerationRate;
    private static final float EndTension = 1.0f;
    private static final float GravityEarth = 9.80665f;
    private static final float InchesPerMeter = 39.37f;
    private static final float Inflection = 0.35f;
    private static final float P1 = 0.175f;
    private static final float P2 = 0.35000002f;
    private static final float PlatformFlingScrollFriction = ViewConfiguration.getScrollFriction();
    private static final float StartTension = 0.5f;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        DecelerationRate = log;
        DecelMinusOne = log - 1.0d;
    }

    public static final /* synthetic */ double access$getDecelMinusOne$p() {
        return DecelMinusOne;
    }

    public static final /* synthetic */ double access$getDecelerationRate$p() {
        return DecelerationRate;
    }

    public static final /* synthetic */ float access$getPlatformFlingScrollFriction$p() {
        return PlatformFlingScrollFriction;
    }

    public static final Modifier imeNestedScroll(Modifier modifier) {
        if (Build.VERSION.SDK_INT < 30) {
            return modifier;
        }
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ps0() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$imeNestedScroll$$inlined$debugInspectorInfo$1
            @Override // defpackage.ps0
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return vy2.a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("imeNestedScroll");
            }
        } : InspectableValueKt.getNoInspectorInfo(), new t1(13));
    }

    public static final Modifier imeNestedScroll$lambda$1(Modifier modifier, Composer composer, int i) {
        composer.startReplaceGroup(-369978792);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-369978792, i, -1, "androidx.compose.foundation.layout.imeNestedScroll.<anonymous> (WindowInsetsConnection.android.kt:76)");
        }
        Modifier nestedScroll$default = NestedScrollModifierKt.nestedScroll$default(modifier, m1145rememberWindowInsetsConnectionVRgvIgI(WindowInsetsHolder.Companion.current(composer, 6).getIme(), WindowInsetsSides.Companion.m1166getBottomJoeWqyM(), composer, 48), null, 2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return nestedScroll$default;
    }

    /* renamed from: rememberWindowInsetsConnection-VRgvIgI */
    public static final NestedScrollConnection m1145rememberWindowInsetsConnectionVRgvIgI(AndroidWindowInsets androidWindowInsets, int i, Composer composer, int i2) {
        composer.startReplaceGroup(-1011341039);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1011341039, i2, -1, "androidx.compose.foundation.layout.rememberWindowInsetsConnection (WindowInsetsConnection.android.kt:105)");
        }
        if (Build.VERSION.SDK_INT < 30) {
            DoNothingNestedScrollConnection doNothingNestedScrollConnection = DoNothingNestedScrollConnection.INSTANCE;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return doNothingNestedScrollConnection;
        }
        SideCalculator m1104chooseCalculatorni1skBw = SideCalculator.Companion.m1104chooseCalculatorni1skBw(i, (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()));
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        int i3 = 0;
        boolean changed = ((((i2 & 14) ^ 6) > 4 && composer.changed(androidWindowInsets)) || (i2 & 6) == 4) | composer.changed(view) | composer.changed(m1104chooseCalculatorni1skBw) | composer.changed(density);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new WindowInsetsNestedScrollConnection(androidWindowInsets, view, m1104chooseCalculatorni1skBw, density);
            composer.updateRememberedValue(rememberedValue);
        }
        WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = (WindowInsetsNestedScrollConnection) rememberedValue;
        boolean changedInstance = composer.changedInstance(windowInsetsNestedScrollConnection);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new m(windowInsetsNestedScrollConnection, i3);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(windowInsetsNestedScrollConnection, (ps0) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return windowInsetsNestedScrollConnection;
    }

    public static final DisposableEffectResult rememberWindowInsetsConnection_VRgvIgI$lambda$1$0(final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection_VRgvIgI$lambda$1$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                WindowInsetsNestedScrollConnection.this.dispose();
            }
        };
    }
}
