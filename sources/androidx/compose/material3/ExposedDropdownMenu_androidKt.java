package androidx.compose.material3;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.PopupProperties;
import defpackage.h3;
import defpackage.i3;
import defpackage.os0;
import defpackage.ps0;
import defpackage.qk0;
import defpackage.sb0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ExposedDropdownMenu_androidKt {
    public static final void OnPlatformWindowBoundsChange(os0 os0Var, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1646555525);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(os0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1646555525, i2, -1, "androidx.compose.material3.OnPlatformWindowBoundsChange (ExposedDropdownMenu.android.kt:47)");
            }
            SoftKeyboardListener((View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView()), (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()), os0Var, startRestartGroup, (i2 << 6) & 896);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new h3(os0Var, i, 5));
        }
    }

    public static final vy2 OnPlatformWindowBoundsChange$lambda$1(os0 os0Var, int i, Composer composer, int i2) {
        OnPlatformWindowBoundsChange(os0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    private static final void SoftKeyboardListener(View view, Density density, os0 os0Var, Composer composer, int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(-1319522472);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(density) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(os0Var) ? 256 : 128;
        }
        int i3 = 0;
        if (startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1319522472, i2, -1, "androidx.compose.material3.SoftKeyboardListener (ExposedDropdownMenu.android.kt:85)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(view) | ((i2 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new qk0(i3, view, os0Var);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(view, density, (ps0) rememberedValue, startRestartGroup, i2 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new i3(view, density, os0Var, i, 9));
        }
    }

    public static final DisposableEffectResult SoftKeyboardListener$lambda$5$lambda$4(View view, os0 os0Var, DisposableEffectScope disposableEffectScope) {
        final ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 exposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1 = new ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1(view, os0Var);
        return new DisposableEffectResult() { // from class: androidx.compose.material3.ExposedDropdownMenu_androidKt$SoftKeyboardListener$lambda$5$lambda$4$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ExposedDropdownMenu_androidKt$SoftKeyboardListener$1$1$listener$1.this.dispose();
            }
        };
    }

    public static final vy2 SoftKeyboardListener$lambda$6(View view, Density density, os0 os0Var, int i, Composer composer, int i2) {
        SoftKeyboardListener(view, density, os0Var, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return vy2.a;
    }

    public static /* synthetic */ vy2 a(View view, Density density, os0 os0Var, int i, Composer composer, int i2) {
        return SoftKeyboardListener$lambda$6(view, density, os0Var, i, composer, i2);
    }

    public static /* synthetic */ DisposableEffectResult b(View view, os0 os0Var, DisposableEffectScope disposableEffectScope) {
        return SoftKeyboardListener$lambda$5$lambda$4(view, os0Var, disposableEffectScope);
    }

    public static final IntRect getWindowBounds(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return RectHelper_androidKt.toComposeIntRect(rect);
    }

    public static final WindowBoundsCalculator platformWindowBoundsCalculator(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(703324275, i, -1, "androidx.compose.material3.platformWindowBoundsCalculator (ExposedDropdownMenu.android.kt:40)");
        }
        Object obj = (Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        View view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        boolean changed = composer.changed(obj) | composer.changed(view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new WindowBoundsCalculator(view);
            composer.updateRememberedValue(rememberedValue);
        }
        WindowBoundsCalculator windowBoundsCalculator = (WindowBoundsCalculator) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return windowBoundsCalculator;
    }

    /* renamed from: popupPropertiesForAnchorType-BTG8-q0 */
    public static final PopupProperties m2602popupPropertiesForAnchorTypeBTG8q0(String str, boolean z, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895018515, i, -1, "androidx.compose.material3.popupPropertiesForAnchorType (ExposedDropdownMenu.android.kt:57)");
        }
        State<Boolean> rememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, false, composer, 0, 7);
        int i2 = !popupPropertiesForAnchorType_BTG8_q0$lambda$2(rememberAccessibilityServiceState) ? 393248 : 393216;
        ExposedDropdownMenuAnchorType.Companion companion = ExposedDropdownMenuAnchorType.Companion;
        if ((ExposedDropdownMenuAnchorType.m2575equalsimpl0(str, companion.m2579getPrimaryEditableoYjWRB4()) || (ExposedDropdownMenuAnchorType.m2575equalsimpl0(str, companion.m2581getSecondaryEditableoYjWRB4()) && !popupPropertiesForAnchorType_BTG8_q0$lambda$2(rememberAccessibilityServiceState))) && !z) {
            i2 |= 8;
        }
        PopupProperties popupProperties = new PopupProperties(i2, false, false, false, false, false, 62, (sb0) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return popupProperties;
    }

    private static final boolean popupPropertiesForAnchorType_BTG8_q0$lambda$2(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
