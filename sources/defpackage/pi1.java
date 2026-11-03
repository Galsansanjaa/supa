package defpackage;

import android.window.OnBackInvokedCallback;
import androidx.activity.OnBackPressedDispatcher;
import com.google.android.material.motion.MaterialBackHandler;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pi1 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pi1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((MaterialBackHandler) obj).handleBackInvoked();
                return;
            case 1:
                OnBackPressedDispatcher.Api33Impl.a((os0) obj);
                return;
            default:
                ((Runnable) obj).run();
                return;
        }
    }
}
