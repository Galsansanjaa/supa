package defpackage;

import android.app.Dialog;
import android.content.Context;
import com.uptodown.R;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hi3 extends Dialog {
    public final /* synthetic */ xi3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi3(Context context, xi3 xi3Var) {
        super(context, R.style.CmpActivityTheme);
        this.a = xi3Var;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.a.a();
    }
}
