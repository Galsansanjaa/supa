package defpackage;

import android.os.Process;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.uptodown.tv.ui.fragment.TvSearchFragment;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ u3(int i) {
        this.a = i;
    }

    public /* synthetic */ u3(TvSearchFragment tvSearchFragment) {
        this.a = 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                AndroidComposeView.Companion.addNotificationForSysPropsChange$lambda$0();
                return;
            case 2:
                Process.killProcess(Process.myPid());
                return;
            default:
                int i2 = TvSearchFragment.n;
                return;
        }
    }
}
