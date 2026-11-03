package defpackage;

import android.content.Intent;
import com.uptodown.activities.GdprPrivacySettings;
import com.uptodown.activities.MainActivity;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class dh1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ dh1(int i, MainActivity mainActivity) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        vy2 vy2Var = vy2.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                mainActivity.e0 = null;
                mainActivity.N0();
                return vy2Var;
            default:
                mainActivity.z0.launch(new Intent(mainActivity, (Class<?>) GdprPrivacySettings.class));
                return vy2Var;
        }
    }
}
