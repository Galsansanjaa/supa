package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.core.content.IntentCompat;
import defpackage.hu2;
import defpackage.oz0;
import defpackage.pz0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AuthTabSessionToken {
    private static final String TAG = "AuthTabSessionToken";
    private final AuthTabCallback mCallback;
    private final pz0 mCallbackBinder;
    private final PendingIntent mSessionId;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class MockCallback extends oz0 {
        @Override // defpackage.pz0
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // defpackage.pz0
        public void onExtraCallback(String str, Bundle bundle) throws RemoteException {
        }

        @Override // defpackage.pz0
        public Bundle onExtraCallbackWithResult(String str, Bundle bundle) throws RemoteException {
            return Bundle.EMPTY;
        }

        @Override // defpackage.pz0
        public void onNavigationEvent(int i, Bundle bundle) throws RemoteException {
        }

        @Override // defpackage.pz0
        public void onWarmupCompleted(Bundle bundle) throws RemoteException {
        }
    }

    public AuthTabSessionToken(pz0 pz0Var, PendingIntent pendingIntent) {
        if (pz0Var == null && pendingIntent == null) {
            hu2.h("AuthTabSessionToken must have either a session id or a callback (or both).");
            throw null;
        }
        this.mCallbackBinder = pz0Var;
        this.mSessionId = pendingIntent;
        this.mCallback = pz0Var == null ? null : new AuthTabCallback() { // from class: androidx.browser.auth.AuthTabSessionToken.1
            @Override // androidx.browser.auth.AuthTabCallback
            public void onExtraCallback(String str, Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onExtraCallback(str, bundle);
                } catch (RemoteException unused) {
                    Log.e(AuthTabSessionToken.TAG, "RemoteException during IAuthTabCallback transaction");
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public Bundle onExtraCallbackWithResult(String str, Bundle bundle) {
                try {
                    return AuthTabSessionToken.this.mCallbackBinder.onExtraCallbackWithResult(str, bundle);
                } catch (RemoteException unused) {
                    Log.e(AuthTabSessionToken.TAG, "RemoteException during IAuthTabCallback transaction");
                    return Bundle.EMPTY;
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public void onNavigationEvent(int i, Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onNavigationEvent(i, bundle);
                } catch (RemoteException unused) {
                    Log.e(AuthTabSessionToken.TAG, "RemoteException during IAuthTabCallback transaction");
                }
            }

            @Override // androidx.browser.auth.AuthTabCallback
            public void onWarmupCompleted(Bundle bundle) {
                try {
                    AuthTabSessionToken.this.mCallbackBinder.onWarmupCompleted(bundle);
                } catch (RemoteException unused) {
                    Log.e(AuthTabSessionToken.TAG, "RemoteException during IAuthTabCallback transaction");
                }
            }
        };
    }

    public static AuthTabSessionToken createSessionTokenFromIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder(CustomTabsIntent.EXTRA_SESSION);
        PendingIntent pendingIntent = (PendingIntent) IntentCompat.getParcelableExtra(intent, CustomTabsIntent.EXTRA_SESSION_ID, PendingIntent.class);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        return new AuthTabSessionToken(binder != null ? oz0.asInterface(binder) : null, pendingIntent);
    }

    private IBinder getCallbackBinderAssertNotNull() {
        pz0 pz0Var = this.mCallbackBinder;
        if (pz0Var != null) {
            return pz0Var.asBinder();
        }
        hu2.h("AuthTabSessionToken must have valid binder or pending session");
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthTabSessionToken)) {
            return false;
        }
        AuthTabSessionToken authTabSessionToken = (AuthTabSessionToken) obj;
        PendingIntent id = authTabSessionToken.getId();
        PendingIntent pendingIntent = this.mSessionId;
        if ((pendingIntent == null) != (id == null)) {
            return false;
        }
        return pendingIntent != null ? pendingIntent.equals(id) : getCallbackBinderAssertNotNull().equals(authTabSessionToken.getCallbackBinderAssertNotNull());
    }

    public AuthTabCallback getCallback() {
        return this.mCallback;
    }

    public IBinder getCallbackBinder() {
        pz0 pz0Var = this.mCallbackBinder;
        if (pz0Var == null) {
            return null;
        }
        return pz0Var.asBinder();
    }

    public PendingIntent getId() {
        return this.mSessionId;
    }

    public boolean hasId() {
        return this.mSessionId != null;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.mSessionId;
        return pendingIntent != null ? pendingIntent.hashCode() : getCallbackBinderAssertNotNull().hashCode();
    }

    public boolean isAssociatedWith(AuthTabSession authTabSession) {
        return authTabSession.getBinder().equals(this.mCallbackBinder);
    }
}
