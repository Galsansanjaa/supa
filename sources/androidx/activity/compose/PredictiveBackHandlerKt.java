package androidx.activity.compose;

import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import defpackage.hu2;
import defpackage.mi0;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PredictiveBackHandlerKt {
    public static final void PredictiveBackHandler(final boolean z, ts0 ts0Var, Composer composer, int i, int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-642000585);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(ts0Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                z = true;
            }
            final State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(ts0Var, startRestartGroup, (i3 >> 3) & 14);
            startRestartGroup.startReplaceableGroup(-723524056);
            startRestartGroup.startReplaceableGroup(-3687241);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(mi0.a, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            startRestartGroup.endReplaceableGroup();
            final y40 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-1071578902);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new OnBackPressedCallback(z) { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1
                    private OnBackInstance onBackInstance;

                    public final OnBackInstance getOnBackInstance() {
                        return this.onBackInstance;
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackCancelled() {
                        super.handleOnBackCancelled();
                        OnBackInstance onBackInstance = this.onBackInstance;
                        if (onBackInstance != null) {
                            onBackInstance.cancel();
                        }
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        ts0 PredictiveBackHandler$lambda$0;
                        OnBackInstance onBackInstance = this.onBackInstance;
                        if (onBackInstance != null && !onBackInstance.isPredictiveBack()) {
                            onBackInstance.cancel();
                            this.onBackInstance = null;
                        }
                        OnBackInstance onBackInstance2 = this.onBackInstance;
                        if (onBackInstance2 == null) {
                            y40 y40Var = coroutineScope;
                            PredictiveBackHandler$lambda$0 = PredictiveBackHandlerKt.PredictiveBackHandler$lambda$0(rememberUpdatedState);
                            onBackInstance2 = new OnBackInstance(y40Var, false, PredictiveBackHandler$lambda$0);
                            this.onBackInstance = onBackInstance2;
                        }
                        if (onBackInstance2 != null) {
                            onBackInstance2.close();
                        }
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackProgressed(BackEventCompat backEventCompat) {
                        super.handleOnBackProgressed(backEventCompat);
                        OnBackInstance onBackInstance = this.onBackInstance;
                        if (onBackInstance != null) {
                            onBackInstance.m8sendJP2dKIU(backEventCompat);
                        }
                    }

                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackStarted(BackEventCompat backEventCompat) {
                        ts0 PredictiveBackHandler$lambda$0;
                        super.handleOnBackStarted(backEventCompat);
                        OnBackInstance onBackInstance = this.onBackInstance;
                        if (onBackInstance != null) {
                            onBackInstance.cancel();
                        }
                        y40 y40Var = coroutineScope;
                        PredictiveBackHandler$lambda$0 = PredictiveBackHandlerKt.PredictiveBackHandler$lambda$0(rememberUpdatedState);
                        this.onBackInstance = new OnBackInstance(y40Var, true, PredictiveBackHandler$lambda$0);
                    }

                    public final void setOnBackInstance(OnBackInstance onBackInstance) {
                        this.onBackInstance = onBackInstance;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = (PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            Boolean valueOf = Boolean.valueOf(z);
            startRestartGroup.startReplaceableGroup(-1071576918);
            boolean changed = startRestartGroup.changed(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) | startRestartGroup.changed(z);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new PredictiveBackHandlerKt$PredictiveBackHandler$1$1(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, z, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(valueOf, (ts0) rememberedValue3, startRestartGroup, i3 & 14);
            OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null) {
                hu2.h("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
                return;
            }
            OnBackPressedDispatcher onBackPressedDispatcher = current.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            startRestartGroup.startReplaceableGroup(-1071576546);
            boolean changed2 = startRestartGroup.changed(onBackPressedDispatcher) | startRestartGroup.changed(lifecycleOwner) | startRestartGroup.changed(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new PredictiveBackHandlerKt$PredictiveBackHandler$2$1(onBackPressedDispatcher, lifecycleOwner, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner, onBackPressedDispatcher, (ps0) rememberedValue4, startRestartGroup, 0);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PredictiveBackHandlerKt$PredictiveBackHandler$3(z, ts0Var, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ts0 PredictiveBackHandler$lambda$0(State<? extends ts0> state) {
        return state.getValue();
    }
}
