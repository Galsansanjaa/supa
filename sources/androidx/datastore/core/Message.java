package androidx.datastore.core;

import defpackage.j20;
import defpackage.lx;
import defpackage.sb0;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class Message<T> {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Update<T> extends Message<T> {
        private final lx ack;
        private final j20 callerContext;
        private final State<T> lastState;
        private final ts0 transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(ts0 ts0Var, lx lxVar, State<T> state, j20 j20Var) {
            super(null);
            ts0Var.getClass();
            lxVar.getClass();
            j20Var.getClass();
            this.transform = ts0Var;
            this.ack = lxVar;
            this.lastState = state;
            this.callerContext = j20Var;
        }

        public final lx getAck() {
            return this.ack;
        }

        public final j20 getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final ts0 getTransform() {
            return this.transform;
        }
    }

    private Message() {
    }

    public /* synthetic */ Message(sb0 sb0Var) {
        this();
    }

    public abstract State<T> getLastState();
}
