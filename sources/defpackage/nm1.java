package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public interface nm1 {
    pe2 getOnLock();

    boolean holdsLock(Object obj);

    boolean isLocked();

    Object lock(Object obj, a10 a10Var);

    boolean tryLock(Object obj);

    void unlock(Object obj);
}
