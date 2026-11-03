package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.AtomicInt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class StateObjectImpl implements StateObject {
    public static final int $stable = 8;
    private final AtomicInt readerKind = new AtomicInt(0);

    /* renamed from: isReadIn-h_f27i8$runtime, reason: not valid java name */
    public final boolean m4788isReadInh_f27i8$runtime(int i) {
        return (ReaderKind.m4777constructorimpl(this.readerKind.get()) & i) != 0;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        return null;
    }

    /* renamed from: recordReadIn-h_f27i8$runtime, reason: not valid java name */
    public final void m4789recordReadInh_f27i8$runtime(int i) {
        int m4777constructorimpl;
        do {
            m4777constructorimpl = ReaderKind.m4777constructorimpl(this.readerKind.get());
            if ((m4777constructorimpl & i) != 0) {
                return;
            }
        } while (!this.readerKind.compareAndSet(m4777constructorimpl, ReaderKind.m4777constructorimpl(m4777constructorimpl | i)));
    }
}
