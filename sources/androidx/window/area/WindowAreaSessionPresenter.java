package androidx.window.area;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface WindowAreaSessionPresenter extends WindowAreaSession {
    Context getContext();

    Window getWindow();

    void setContentView(View view);
}
