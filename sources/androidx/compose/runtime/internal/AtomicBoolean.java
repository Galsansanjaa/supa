package androidx.compose.runtime.internal;

import defpackage.jh2;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AtomicBoolean {
    private final AtomicInt wrapped;

    private /* synthetic */ AtomicBoolean(AtomicInt atomicInt) {
        this.wrapped = atomicInt;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AtomicBoolean m4735boximpl(AtomicInt atomicInt) {
        return new AtomicBoolean(atomicInt);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m4736constructorimpl(AtomicInt atomicInt) {
        return atomicInt;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m4737constructorimpl(boolean z) {
        return m4736constructorimpl(new AtomicInt(z ? 1 : 0));
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ AtomicInt m4738constructorimpl$default(AtomicInt atomicInt, int i, sb0 sb0Var) {
        if ((i & 1) != 0) {
            atomicInt = new AtomicInt(0);
        }
        return m4736constructorimpl(atomicInt);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4739equalsimpl(AtomicInt atomicInt, Object obj) {
        return (obj instanceof AtomicBoolean) && jh2.k(atomicInt, ((AtomicBoolean) obj).m4746unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4740equalsimpl0(AtomicInt atomicInt, AtomicInt atomicInt2) {
        return jh2.k(atomicInt, atomicInt2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final boolean m4741getimpl(AtomicInt atomicInt) {
        return atomicInt.get() != 0;
    }

    /* renamed from: getAndSet-impl, reason: not valid java name */
    public static final boolean m4742getAndSetimpl(AtomicInt atomicInt, boolean z) {
        return atomicInt.compareAndSet(1, z ? 1 : 0);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4743hashCodeimpl(AtomicInt atomicInt) {
        return atomicInt.hashCode();
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m4744setimpl(AtomicInt atomicInt, boolean z) {
        atomicInt.set(z ? 1 : 0);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4745toStringimpl(AtomicInt atomicInt) {
        return "AtomicBoolean(wrapped=" + atomicInt + ")";
    }

    public boolean equals(Object obj) {
        return m4739equalsimpl(this.wrapped, obj);
    }

    public int hashCode() {
        return m4743hashCodeimpl(this.wrapped);
    }

    public String toString() {
        return m4745toStringimpl(this.wrapped);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicInt m4746unboximpl() {
        return this.wrapped;
    }
}
