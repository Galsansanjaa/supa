package androidx.datastore.core;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public abstract class State<T> {
    private final int version;

    private State(int i) {
        this.version = i;
    }

    public /* synthetic */ State(int i, sb0 sb0Var) {
        this(i);
    }

    public final int getVersion() {
        return this.version;
    }
}
