package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.ConnectivityManager;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import defpackage.a01;
import defpackage.d83;
import defpackage.da3;
import defpackage.fa3;
import defpackage.ga3;
import defpackage.gq1;
import defpackage.hq1;
import defpackage.hu2;
import defpackage.j32;
import defpackage.l1;
import defpackage.oj2;
import defpackage.w93;
import defpackage.yc1;
import defpackage.yp1;
import defpackage.zz0;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class YouTubePlayerView extends oj2 implements LifecycleEventObserver {
    public final ArrayList a;
    public final yc1 b;
    public boolean m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context) {
        this(context, null, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.a = new ArrayList();
        yc1 yc1Var = new yc1(context, new w93(this, 1));
        this.b = yc1Var;
        addView(yc1Var, new FrameLayout.LayoutParams(-1, -1));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, j32.a, 0, 0);
        obtainStyledAttributes.getClass();
        this.m = obtainStyledAttributes.getBoolean(1, true);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        boolean z2 = obtainStyledAttributes.getBoolean(2, true);
        String string = obtainStyledAttributes.getString(3);
        obtainStyledAttributes.recycle();
        if (z && string == null) {
            hu2.h("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
            throw null;
        }
        ga3 ga3Var = new ga3(string, this, z);
        if (this.m) {
            zz0 zz0Var = new zz0(context);
            zz0Var.c(1, "controls");
            yc1Var.a(ga3Var, z2, new a01(zz0Var.a), string);
        }
    }

    public final void a(l1 l1Var, a01 a01Var) {
        if (this.m) {
            hu2.h("YouTubePlayerView: If you want to initialize this view manually, you need to set 'enableAutomaticInitialization' to false.");
            return;
        }
        yc1 yc1Var = this.b;
        yc1Var.getClass();
        yc1Var.a(l1Var, true, a01Var, null);
    }

    public final void b() {
        yc1 yc1Var = this.b;
        d83 d83Var = yc1Var.a;
        hq1 hq1Var = yc1Var.b;
        Context context = hq1Var.a;
        if (Build.VERSION.SDK_INT >= 24) {
            gq1 gq1Var = hq1Var.d;
            if (gq1Var != null) {
                Object systemService = context.getSystemService("connectivity");
                systemService.getClass();
                ((ConnectivityManager) systemService).unregisterNetworkCallback(gq1Var);
                hq1Var.b.clear();
                hq1Var.d = null;
                hq1Var.c = null;
            }
        } else {
            yp1 yp1Var = hq1Var.c;
            if (yp1Var != null) {
                try {
                    context.unregisterReceiver(yp1Var);
                } catch (Throwable unused) {
                }
                hq1Var.b.clear();
                hq1Var.d = null;
                hq1Var.c = null;
            }
        }
        yc1Var.removeView(d83Var);
        d83Var.removeAllViews();
        d83Var.destroy();
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.m;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        lifecycleOwner.getClass();
        event.getClass();
        int i = fa3.a[event.ordinal()];
        yc1 yc1Var = this.b;
        switch (i) {
            case 1:
                yc1Var.m.a = true;
                yc1Var.q = true;
                return;
            case 2:
                ((da3) yc1Var.a.getYoutubePlayer$core_release()).e();
                yc1Var.m.a = false;
                yc1Var.q = false;
                return;
            case 3:
                b();
                return;
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            default:
                hu2.e();
                return;
        }
    }

    public final void setCustomPlayerUi(View view) {
        view.getClass();
        this.b.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z) {
        this.m = z;
    }
}
