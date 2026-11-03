package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import defpackage.bb1;
import defpackage.os0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawnWhen$1$1 extends bb1 implements ps0 {
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    final /* synthetic */ os0 $predicate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportDrawnKt$ReportDrawnWhen$1$1(FullyDrawnReporter fullyDrawnReporter, os0 os0Var) {
        super(1);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$predicate = os0Var;
    }

    @Override // defpackage.ps0
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        if (this.$fullyDrawnReporter.isFullyDrawnReported()) {
            return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$1
                @Override // androidx.compose.runtime.DisposableEffectResult
                public void dispose() {
                }
            };
        }
        final ReportDrawnComposition reportDrawnComposition = new ReportDrawnComposition(this.$fullyDrawnReporter, this.$predicate);
        return new DisposableEffectResult() { // from class: androidx.activity.compose.ReportDrawnKt$ReportDrawnWhen$1$1$invoke$$inlined$onDispose$2
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                ReportDrawnComposition.this.removeReporter();
            }
        };
    }
}
