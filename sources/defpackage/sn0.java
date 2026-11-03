package defpackage;

import android.adservices.topics.Topic;
import android.app.ApplicationExitInfo;
import android.location.GnssStatus;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class sn0 implements ct1, gy, oj0, b10 {
    public final /* synthetic */ int a;

    public /* synthetic */ sn0(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ Topic a(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo c(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* bridge */ /* synthetic */ GnssStatus d(Object obj) {
        return (GnssStatus) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteGesture f(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture g(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture i(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture j(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture k(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture l(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture m(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* synthetic */ void n(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void o(Object obj, String str, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void q(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ boolean s(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof InsertGesture;
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ boolean x(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    @Override // defpackage.gy
    public Object b(gn0 gn0Var) {
        zn0 lambda$getComponents$0;
        io0 components$lambda$0;
        lo0 components$lambda$1;
        switch (this.a) {
            case 1:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(gn0Var);
                return lambda$getComponents$0;
            case 4:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(gn0Var);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(gn0Var);
                return components$lambda$1;
        }
    }

    @Override // defpackage.ct1
    public void e(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override // defpackage.b10
    public Object h(zc4 zc4Var) {
        Object obj;
        synchronized (zc4Var.a) {
            dn3.r(zc4Var.c, "Task is not yet complete");
            if (zc4Var.d) {
                throw new CancellationException("Task is already canceled.");
            }
            boolean isInstance = IOException.class.isInstance(zc4Var.f);
            Exception exc = zc4Var.f;
            if (isInstance) {
                throw ((Throwable) IOException.class.cast(exc));
            }
            if (exc != null) {
                throw new RuntimeException(exc);
            }
            obj = zc4Var.e;
        }
        Bundle bundle = (Bundle) obj;
        if (bundle == null) {
            hu2.p("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            hu2.p("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            hu2.p(string3);
            return null;
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        hu2.p("SERVICE_NOT_AVAILABLE");
        return null;
    }
}
