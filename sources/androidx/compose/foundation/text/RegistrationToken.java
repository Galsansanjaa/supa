package androidx.compose.foundation.text;

import defpackage.os0;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class RegistrationToken {
    private boolean disposed;
    private final Executor executor;
    private Runnable unregister;

    public RegistrationToken(Executor executor) {
        this.executor = executor;
    }

    public final void dispose() {
        Executor executor = this.executor;
        if (executor == null) {
            this.disposed = true;
            Runnable runnable = this.unregister;
            if (runnable != null) {
                runnable.run();
            }
            this.unregister = null;
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.RegistrationToken$dispose$$inlined$tryExecute$1
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2;
                    synchronized (RegistrationToken.this) {
                        RegistrationToken.this.disposed = true;
                        runnable2 = RegistrationToken.this.unregister;
                        RegistrationToken.this.unregister = null;
                    }
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            synchronized (this) {
                this.disposed = true;
                Runnable runnable2 = this.unregister;
                this.unregister = null;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }
    }

    public final void register(final PasswordVisibilitySetting passwordVisibilitySetting, final os0 os0Var) {
        boolean z;
        Executor executor = this.executor;
        if (executor == null) {
            this.unregister = passwordVisibilitySetting.registerObserver(os0Var);
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: androidx.compose.foundation.text.RegistrationToken$register$$inlined$tryExecute$1
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z2;
                    Runnable registerObserver = PasswordVisibilitySetting.this.registerObserver(os0Var);
                    synchronized (this) {
                        if (this.disposed) {
                            z2 = true;
                        } else {
                            this.unregister = registerObserver;
                            z2 = false;
                        }
                    }
                    if (z2) {
                        registerObserver.run();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            Runnable registerObserver = passwordVisibilitySetting.registerObserver(os0Var);
            synchronized (this) {
                if (this.disposed) {
                    z = true;
                } else {
                    this.unregister = registerObserver;
                    z = false;
                }
                if (z) {
                    registerObserver.run();
                }
            }
        }
    }
}
