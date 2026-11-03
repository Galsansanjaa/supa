package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import defpackage.os0;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
final class ReportDrawnComposition implements os0 {
    private final ps0 checkReporter;
    private final FullyDrawnReporter fullyDrawnReporter;
    private final os0 predicate;
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, os0 os0Var) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = os0Var;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.INSTANCE);
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        observeReporter(os0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [v42, java.lang.Object] */
    public final void observeReporter(os0 os0Var) {
        ?? obj = new Object();
        this.snapshotStateObserver.observeReads(os0Var, this.checkReporter, new ReportDrawnComposition$observeReporter$1(obj, os0Var));
        if (obj.a) {
            removeReporter();
        }
    }

    @Override // defpackage.os0
    public /* bridge */ /* synthetic */ Object invoke() {
        m9invoke();
        return vy2.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m9invoke() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        m9invoke();
    }
}
