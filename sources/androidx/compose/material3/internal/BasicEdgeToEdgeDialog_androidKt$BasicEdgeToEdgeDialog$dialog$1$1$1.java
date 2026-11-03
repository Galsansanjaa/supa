package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.jh2;
import defpackage.os0;
import defpackage.ps0;
import defpackage.sg3;
import defpackage.ts0;
import defpackage.us0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1 implements ts0 {
    final /* synthetic */ State<us0> $currentContent$delegate;
    final /* synthetic */ State<Boolean> $currentDismissOnBackPress$delegate;
    final /* synthetic */ State<os0> $currentOnDismissRequest$delegate;
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: Multi-variable type inference failed */
    public BasicEdgeToEdgeDialog_androidKt$BasicEdgeToEdgeDialog$dialog$1$1$1(Modifier modifier, State<Boolean> state, State<? extends os0> state2, State<? extends us0> state3) {
        this.$modifier = modifier;
        this.$currentDismissOnBackPress$delegate = state;
        this.$currentOnDismissRequest$delegate = state2;
        this.$currentContent$delegate = state3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 invoke$lambda$1$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.dialog(semanticsPropertyReceiver);
        return vy2.a;
    }

    @Override // defpackage.ts0
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return vy2.a;
    }

    public final void invoke(Composer composer, int i) {
        boolean BasicEdgeToEdgeDialog$lambda$4;
        os0 BasicEdgeToEdgeDialog$lambda$3;
        us0 BasicEdgeToEdgeDialog$lambda$2;
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-635938462, i, -1, "androidx.compose.material3.internal.BasicEdgeToEdgeDialog.<anonymous>.<anonymous>.<anonymous> (BasicEdgeToEdgeDialog.android.kt:115)");
        }
        PredictiveBackState rememberPredictiveBackState = BasicEdgeToEdgeDialogKt.rememberPredictiveBackState(composer, 0);
        BasicEdgeToEdgeDialog$lambda$4 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$4(this.$currentDismissOnBackPress$delegate);
        BasicEdgeToEdgeDialog$lambda$3 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$3(this.$currentOnDismissRequest$delegate);
        BasicEdgeToEdgeDialogKt.PredictiveBackStateHandler(rememberPredictiveBackState, BasicEdgeToEdgeDialog$lambda$4, BasicEdgeToEdgeDialog$lambda$3, composer, 0, 0);
        Modifier modifier = this.$modifier;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new Object();
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier semantics$default = SemanticsModifierKt.semantics$default(modifier, false, (ps0) rememberedValue, 1, null);
        State<us0> state = this.$currentContent$delegate;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, semantics$default);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        os0 constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m4501constructorimpl = Updater.m4501constructorimpl(composer);
        ts0 m = sg3.m(companion, m4501constructorimpl, maybeCachedBoxMeasurePolicy, m4501constructorimpl, currentCompositionLocalMap);
        if (m4501constructorimpl.getInserting() || !jh2.k(m4501constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            sg3.A(m, currentCompositeKeyHash, m4501constructorimpl, currentCompositeKeyHash);
        }
        Updater.m4509setimpl(m4501constructorimpl, materializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        BasicEdgeToEdgeDialog$lambda$2 = BasicEdgeToEdgeDialog_androidKt.BasicEdgeToEdgeDialog$lambda$2(state);
        BasicEdgeToEdgeDialog$lambda$2.invoke(rememberPredictiveBackState, composer, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
