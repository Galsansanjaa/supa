package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class o61 extends kx {
    public final /* synthetic */ int C;

    @Override // defpackage.kx
    public qu0 g(Context context, Looper looper, gn0 gn0Var, Object obj, wu0 wu0Var, xu0 xu0Var) {
        switch (this.C) {
            case 2:
                Object obj2 = gn0Var.q;
                Integer num = (Integer) gn0Var.r;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new fj2(context, looper, gn0Var, bundle, wu0Var, xu0Var);
            case 3:
                obj.getClass();
                throw new ClassCastException();
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            default:
                return super.g(context, looper, gn0Var, obj, wu0Var, xu0Var);
            case 6:
                return new bm3(context, looper, gn0Var, (am3) obj, (mk3) wu0Var, (mk3) xu0Var);
            case 9:
                return new cm3(context, looper, gn0Var, (GoogleSignInOptions) obj, (mk3) wu0Var, (mk3) xu0Var);
            case 11:
                return new qu0(context, looper, 51, gn0Var, wu0Var, xu0Var);
            case 12:
                return new qu0(context, looper, 148, gn0Var, wu0Var, xu0Var);
        }
    }

    @Override // defpackage.kx
    public qu0 h(Context context, Looper looper, gn0 gn0Var, Object obj, mk3 mk3Var, mk3 mk3Var2) {
        switch (this.C) {
            case 0:
                context.getClass();
                looper.getClass();
                ((l7) obj).getClass();
                return new qu0(context, looper, 352, gn0Var, mk3Var, mk3Var2);
            case 1:
                context.getClass();
                looper.getClass();
                ((l7) obj).getClass();
                return new qu0(context, looper, 381, gn0Var, mk3Var, mk3Var2);
            case 2:
            case 3:
            case 6:
            case 9:
            default:
                return super.h(context, looper, gn0Var, obj, mk3Var, mk3Var2);
            case 4:
                return new qu0(context, looper, 449, gn0Var, mk3Var, mk3Var2);
            case 5:
                return new pl3(context, looper, gn0Var, (dp2) obj, mk3Var, mk3Var2);
            case 7:
                return new fm3(context, looper, gn0Var, mk3Var, mk3Var2);
            case 8:
                return new vl3(context, looper, gn0Var, mk3Var, mk3Var2);
            case 10:
                return new qu0(context, looper, 457, gn0Var, mk3Var, mk3Var2);
        }
    }
}
