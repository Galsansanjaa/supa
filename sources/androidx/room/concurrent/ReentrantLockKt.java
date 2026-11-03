package androidx.room.concurrent;

import defpackage.os0;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ReentrantLockKt {
    public static final <T> T withLock(ReentrantLock reentrantLock, os0 os0Var) {
        reentrantLock.getClass();
        os0Var.getClass();
        reentrantLock.lock();
        try {
            return (T) os0Var.invoke();
        } finally {
            reentrantLock.unlock();
        }
    }
}
