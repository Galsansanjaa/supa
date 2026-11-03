package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import defpackage.a10;
import defpackage.ea0;
import defpackage.j20;
import defpackage.jh2;
import defpackage.m60;
import defpackage.os;
import defpackage.qs;
import defpackage.r71;
import defpackage.us0;
import defpackage.vy2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private r71 animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    private os continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), Math.round(f)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        os osVar = this.continuation;
        if (osVar != null) {
            osVar.p(null, new us0() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$animationEnded$1
                @Override // defpackage.us0
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Throwable) obj, (Void) obj2, (j20) obj3);
                    return vy2.a;
                }

                public final void invoke(Throwable th, Void r2, j20 j20Var) {
                }
            });
        }
        this.continuation = null;
        r71 r71Var = this.animationJob;
        if (r71Var != null) {
            r71Var.cancel(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r7v3, types: [w42, java.lang.Object] */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1150flinghuYlsQE(long r19, float r21, boolean r22, defpackage.a10 r23) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m1150flinghuYlsQE(long, float, boolean, a10):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(a10 a10Var) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            return windowInsetsAnimationController;
        }
        qs qsVar = new qs(1, m60.u(a10Var));
        qsVar.u();
        this.continuation = qsVar;
        requestAnimationController();
        return qsVar.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final vy2 onReady$lambda$0(Throwable th, WindowInsetsAnimationController windowInsetsAnimationController, j20 j20Var) {
        return vy2.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.getType$foundation_layout(), -1L, null, this.cancellationSignal, this);
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m1151scroll8S9VItk(long j, float f) {
        r71 r71Var = this.animationJob;
        if (r71Var != null) {
            r71Var.cancel(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f != 0.0f) {
            if (this.windowInsets.isVisible() != (f > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo1102consumedOffsetsMKHz9U(j);
                }
                int valueOf = this.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int valueOf2 = this.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int valueOf3 = this.sideCalculator.valueOf(currentInsets);
                if (valueOf3 == (f > 0.0f ? valueOf2 : valueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m5106getZeroF1C5BW0();
                }
                float f2 = valueOf3 + f + this.partialConsumption;
                int o = ea0.o(Math.round(f2), valueOf, valueOf2);
                this.partialConsumption = f2 - Math.round(f2);
                if (o != valueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, o), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo1102consumedOffsetsMKHz9U(j);
            }
        }
        return Offset.Companion.m5106getZeroF1C5BW0();
    }

    public final void dispose() {
        os osVar = this.continuation;
        if (osVar != null) {
            osVar.p(null, new us0() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$dispose$1
                @Override // defpackage.us0
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    invoke((Throwable) obj, (Void) obj2, (j20) obj3);
                    return vy2.a;
                }

                public final void invoke(Throwable th, Void r2, j20 j20Var) {
                }
            });
        }
        r71 r71Var = this.animationJob;
        if (r71Var != null) {
            r71Var.cancel(null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!jh2.k(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final View getView() {
        return this.view;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo632onPostFlingRZ2iAVY(long j, long j2, a10 a10Var) {
        return m1150flinghuYlsQE(j2, this.sideCalculator.showMotion(Velocity.m8283getXimpl(j2), Velocity.m8284getYimpl(j2)), true, a10Var);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo633onPostScrollDzOQY0M(long j, long j2, int i) {
        return m1151scroll8S9VItk(j2, this.sideCalculator.showMotion(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo634onPreFlingQWom1Mo(long j, a10 a10Var) {
        return m1150flinghuYlsQE(j, this.sideCalculator.hideMotion(Velocity.m8283getXimpl(j), Velocity.m8284getYimpl(j)), false, a10Var);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo635onPreScrollOzD1aCk(long j, int i) {
        return m1151scroll8S9VItk(j, this.sideCalculator.hideMotion(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [us0, java.lang.Object] */
    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i) {
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        os osVar = this.continuation;
        if (osVar != 0) {
            osVar.p(windowInsetsAnimationController, new Object());
        }
        this.continuation = null;
    }
}
