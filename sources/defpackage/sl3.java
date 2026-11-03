package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import org.json.JSONException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class sl3 extends jk3 {
    public final /* synthetic */ int k;
    public final Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl3(int i, uo2 uo2Var) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 1);
        this.k = i;
        switch (i) {
            case 1:
                this.l = uo2Var;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 1);
                return;
            case 2:
                this.l = uo2Var;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 1);
                return;
            default:
                this.l = uo2Var;
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl3(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 1);
        this.k = 3;
        this.l = revocationBoundService;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [cm0, tu0] */
    @Override // defpackage.jk3
    public final boolean K(int i, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String e;
        int i2 = this.k;
        Object obj = this.l;
        switch (i2) {
            case 0:
                if (i != 1) {
                    return false;
                }
                Status status = (Status) zl3.a(parcel, Status.CREATOR);
                kb2 kb2Var = (kb2) zl3.a(parcel, kb2.CREATOR);
                zl3.b(parcel);
                t61.F(status, kb2Var, (uo2) obj);
                return true;
            case 1:
                if (i != 1) {
                    return false;
                }
                Status status2 = (Status) zl3.a(parcel, Status.CREATOR);
                so soVar = (so) zl3.a(parcel, so.CREATOR);
                zl3.b(parcel);
                t61.F(status2, soVar, (uo2) obj);
                return true;
            case 2:
                if (i != 1) {
                    return false;
                }
                Status status3 = (Status) zl3.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) zl3.a(parcel, PendingIntent.CREATOR);
                zl3.b(parcel);
                t61.F(status3, pendingIntent, (uo2) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    M();
                    jm3.Y(revocationBoundService).Z();
                    return true;
                }
                M();
                gm2 a = gm2.a(revocationBoundService);
                GoogleSignInAccount b = a.b();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.u;
                if (b != null) {
                    String e2 = a.e("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(e2) && (e = a.e(gm2.f("googleSignInOptions", e2))) != null) {
                        try {
                            googleSignInOptions = GoogleSignInOptions.c(e);
                        } catch (JSONException unused) {
                        }
                    }
                    googleSignInOptions = null;
                }
                dn3.o(googleSignInOptions);
                ?? tu0Var = new tu0(revocationBoundService, me.a, googleSignInOptions, new su0(new jw0(27), Looper.getMainLooper()));
                int i3 = 18;
                Context context = tu0Var.a;
                ok3 ok3Var = tu0Var.i;
                if (b == null) {
                    boolean z = tu0Var.f() == 3;
                    h21 h21Var = im3.a;
                    if (h21Var.c <= 3) {
                        Log.d((String) h21Var.b, ((String) h21Var.d).concat("Signing out"));
                    }
                    im3.a(context);
                    if (z) {
                        BasePendingResult basePendingResult3 = new BasePendingResult(ok3Var);
                        basePendingResult3.e(Status.o);
                        basePendingResult = basePendingResult3;
                    } else {
                        gm3 gm3Var = new gm3(ok3Var, 0);
                        ok3Var.a(gm3Var);
                        basePendingResult = gm3Var;
                    }
                    basePendingResult.a(new ol3(basePendingResult, new uo2(), new r82(i3)));
                    return true;
                }
                boolean z2 = tu0Var.f() == 3;
                h21 h21Var2 = im3.a;
                if (h21Var2.c <= 3) {
                    Log.d((String) h21Var2.b, ((String) h21Var2.d).concat("Revoking access"));
                }
                String e3 = gm2.a(context).e("refreshToken");
                im3.a(context);
                if (!z2) {
                    gm3 gm3Var2 = new gm3(ok3Var, 1);
                    ok3Var.a(gm3Var2);
                    basePendingResult2 = gm3Var2;
                } else if (e3 == null) {
                    h21 h21Var3 = xl3.m;
                    Status status4 = new Status(4, null, null, null);
                    dn3.i("Status code must not be SUCCESS", !status4.c());
                    BasePendingResult yk3Var = new yk3(status4);
                    yk3Var.e(status4);
                    basePendingResult2 = yk3Var;
                } else {
                    xl3 xl3Var = new xl3(e3);
                    new Thread(xl3Var).start();
                    basePendingResult2 = xl3Var.b;
                }
                basePendingResult2.a(new ol3(basePendingResult2, new uo2(), new r82(i3)));
                return true;
        }
    }

    public void M() {
        if (!m60.w((RevocationBoundService) this.l, Binder.getCallingUid())) {
            throw new SecurityException(sg3.o(Binder.getCallingUid(), "Calling UID ", " is not Google Play services."));
        }
    }
}
