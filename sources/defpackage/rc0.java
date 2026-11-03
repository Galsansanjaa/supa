package defpackage;

import android.app.Notification;
import android.app.job.JobInfo;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract /* synthetic */ class rc0 {
    public static /* synthetic */ Notification.DecoratedMediaCustomViewStyle a() {
        return new Notification.DecoratedMediaCustomViewStyle();
    }

    public static /* synthetic */ JobInfo.TriggerContentUri b(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* synthetic */ LocaleList c(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan d(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ void e() {
    }

    public static void f(xc0 xc0Var) {
        if ((Build.VERSION.SDK_INT <= 23 || xc0Var != ForkJoinPool.commonPool()) && !xc0Var.a.isTerminated()) {
            xc0Var.shutdown();
            throw null;
        }
    }

    public static /* synthetic */ void g(hl1 hl1Var) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || hl1Var != ForkJoinPool.commonPool()) && !(isTerminated = hl1Var.isTerminated())) {
            hl1Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = hl1Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        hl1Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void h(gx1 gx1Var) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || gx1Var != ForkJoinPool.commonPool()) && !(isTerminated = gx1Var.isTerminated())) {
            gx1Var.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = gx1Var.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        gx1Var.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void i(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
