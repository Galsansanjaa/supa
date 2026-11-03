package defpackage;

import android.widget.RelativeLayout;
import com.uptodown.activities.preferences.PreferencesActivity;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ky1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RelativeLayout b;

    public /* synthetic */ ky1(RelativeLayout relativeLayout, int i) {
        this.a = i;
        this.b = relativeLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RelativeLayout relativeLayout = this.b;
        switch (i) {
            case 0:
                int i2 = PreferencesActivity.X;
                relativeLayout.setPressed(true);
                relativeLayout.postDelayed(new ky1(relativeLayout, 1), 600L);
                return;
            default:
                int i3 = PreferencesActivity.X;
                relativeLayout.setPressed(false);
                return;
        }
    }
}
