package androidx.activity;

import defpackage.os0;
import defpackage.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;
    private final List<os0> onReportCallbacks;
    private final os0 reportFullyDrawn;
    private boolean reportPosted;
    private final Runnable reportRunnable;
    private boolean reportedFullyDrawn;
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, os0 os0Var) {
        executor.getClass();
        os0Var.getClass();
        this.executor = executor;
        this.reportFullyDrawn = os0Var;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new r(this, 16);
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter fullyDrawnReporter) {
        fullyDrawnReporter.getClass();
        synchronized (fullyDrawnReporter.lock) {
            fullyDrawnReporter.reportPosted = false;
            if (fullyDrawnReporter.reporterCount == 0 && !fullyDrawnReporter.reportedFullyDrawn) {
                fullyDrawnReporter.reportFullyDrawn.invoke();
                fullyDrawnReporter.fullyDrawnReported();
            }
        }
    }

    public final void addOnReportDrawnListener(os0 os0Var) {
        boolean z;
        os0Var.getClass();
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z = true;
            } else {
                this.onReportCallbacks.add(os0Var);
                z = false;
            }
        }
        if (z) {
            os0Var.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((os0) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.lock) {
            z = this.reportedFullyDrawn;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(os0 os0Var) {
        os0Var.getClass();
        synchronized (this.lock) {
            this.onReportCallbacks.remove(os0Var);
        }
    }

    public final void removeReporter() {
        int i;
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn && (i = this.reporterCount) > 0) {
                this.reporterCount = i - 1;
                postWhenReportersAreDone();
            }
        }
    }
}
