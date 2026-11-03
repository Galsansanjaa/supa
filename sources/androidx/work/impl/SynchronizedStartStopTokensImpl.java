package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import defpackage.sl2;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
final class SynchronizedStartStopTokensImpl implements StartStopTokens {
    private final StartStopTokens delegate;
    private final Object lock;

    public SynchronizedStartStopTokensImpl(StartStopTokens startStopTokens) {
        startStopTokens.getClass();
        this.delegate = startStopTokens;
        this.lock = new Object();
    }

    @Override // androidx.work.impl.StartStopTokens
    public boolean contains(WorkGenerationalId workGenerationalId) {
        boolean contains;
        workGenerationalId.getClass();
        synchronized (this.lock) {
            contains = this.delegate.contains(workGenerationalId);
        }
        return contains;
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken remove(WorkGenerationalId workGenerationalId) {
        StartStopToken remove;
        workGenerationalId.getClass();
        synchronized (this.lock) {
            remove = this.delegate.remove(workGenerationalId);
        }
        return remove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken remove(WorkSpec workSpec) {
        int i = sl2.a;
        workSpec.getClass();
        return remove(WorkSpecKt.generationalId(workSpec));
    }

    @Override // androidx.work.impl.StartStopTokens
    public List<StartStopToken> remove(String str) {
        List<StartStopToken> remove;
        str.getClass();
        synchronized (this.lock) {
            remove = this.delegate.remove(str);
        }
        return remove;
    }

    @Override // androidx.work.impl.StartStopTokens
    public StartStopToken tokenFor(WorkGenerationalId workGenerationalId) {
        StartStopToken startStopToken;
        workGenerationalId.getClass();
        synchronized (this.lock) {
            startStopToken = this.delegate.tokenFor(workGenerationalId);
        }
        return startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken tokenFor(WorkSpec workSpec) {
        int i = sl2.a;
        workSpec.getClass();
        return tokenFor(WorkSpecKt.generationalId(workSpec));
    }
}
