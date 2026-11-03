package androidx.browser.auth;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.IBinder;
import defpackage.pz0;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AuthTabSession {
    private final pz0 mCallback;
    private final ComponentName mComponentName;
    private final PendingIntent mId;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static class PendingSession {
        private final AuthTabCallback mCallback;
        private final Executor mExecutor;
        private final PendingIntent mId;

        public PendingSession(PendingIntent pendingIntent, Executor executor, AuthTabCallback authTabCallback) {
            this.mId = pendingIntent;
            this.mExecutor = executor;
            this.mCallback = authTabCallback;
        }

        public AuthTabCallback getCallback() {
            return this.mCallback;
        }

        public Executor getExecutor() {
            return this.mExecutor;
        }

        public PendingIntent getId() {
            return this.mId;
        }
    }

    public AuthTabSession(pz0 pz0Var, ComponentName componentName, PendingIntent pendingIntent) {
        this.mCallback = pz0Var;
        this.mComponentName = componentName;
        this.mId = pendingIntent;
    }

    public IBinder getBinder() {
        return this.mCallback.asBinder();
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    public PendingIntent getId() {
        return this.mId;
    }
}
