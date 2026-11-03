package defpackage;

import android.content.SharedPreferences;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.uptodown.R;
import com.uptodown.activities.MainActivity;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fh1 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ fh1(int i, MainActivity mainActivity) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i = this.a;
        int i2 = -1;
        boolean z = true;
        MainActivity mainActivity = this.b;
        animation.getClass();
        switch (i) {
            case 0:
                ArrayList arrayList = mainActivity.U;
                int i3 = MainActivity.F0;
                int i4 = mainActivity.T;
                if (i4 > 0 && i4 < arrayList.size()) {
                    i2 = (-1) + mainActivity.T;
                    mainActivity.T = i2;
                }
                if (i2 < 0 || i2 >= arrayList.size()) {
                    ((b93) arrayList.get(mainActivity.T)).a().setVisibility(8);
                    mainActivity.finish();
                } else {
                    RelativeLayout relativeLayout = mainActivity.W;
                    if (relativeLayout != null) {
                        relativeLayout.removeAllViews();
                    }
                    RelativeLayout a = ((b93) arrayList.get(i2)).a();
                    RelativeLayout relativeLayout2 = mainActivity.W;
                    if (relativeLayout2 != null) {
                        relativeLayout2.addView(a);
                    }
                    try {
                        SharedPreferences sharedPreferences = mainActivity.getSharedPreferences("SettingsPreferences", 0);
                        if (sharedPreferences.contains("animations")) {
                            z = sharedPreferences.getBoolean("animations", true);
                        }
                    } catch (Exception unused) {
                    }
                    if (z) {
                        a.startAnimation(AnimationUtils.loadAnimation(mainActivity, R.anim.slide_back_in));
                        a.setVisibility(0);
                    } else {
                        a.setVisibility(0);
                    }
                }
                mainActivity.V = false;
                return;
            case 1:
                ArrayList arrayList2 = mainActivity.U;
                int i5 = MainActivity.F0;
                int i6 = mainActivity.T;
                if (i6 >= 0 && i6 < arrayList2.size() - 1) {
                    i2 = mainActivity.T + 1;
                    mainActivity.T = i2;
                }
                if (i2 < 0 || i2 >= arrayList2.size()) {
                    mainActivity.n1();
                    return;
                }
                Object obj = arrayList2.get(i2);
                obj.getClass();
                mainActivity.r1((b93) obj);
                if (((b93) arrayList2.get(mainActivity.T)).a == 2 && ((b93) arrayList2.get(0)).a == 1) {
                    ((b93) arrayList2.get(0)).a().removeAllViews();
                    arrayList2.remove(0);
                    mainActivity.T = 0;
                }
                mainActivity.E1();
                return;
            case 2:
                FrameLayout frameLayout = mainActivity.s0;
                frameLayout.getClass();
                frameLayout.removeAllViews();
                return;
            case 3:
                FrameLayout frameLayout2 = mainActivity.u0;
                frameLayout2.getClass();
                frameLayout2.removeAllViews();
                mainActivity.u0 = null;
                return;
            default:
                int i7 = MainActivity.F0;
                RelativeLayout relativeLayout3 = mainActivity.S;
                if (relativeLayout3 != null) {
                    relativeLayout3.removeAllViews();
                    RelativeLayout relativeLayout4 = mainActivity.S;
                    if (relativeLayout4 != null) {
                        relativeLayout4.setVisibility(8);
                    }
                    mainActivity.S = null;
                }
                mainActivity.m1();
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.a;
        animation.getClass();
        switch (i) {
            case 0:
                this.b.V = true;
                return;
            case 1:
            case 2:
            case 3:
            default:
                return;
        }
    }
}
