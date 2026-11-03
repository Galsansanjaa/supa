package androidx.compose.runtime.tooling;

import androidx.compose.runtime.InternalComposer;
import androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext;
import defpackage.e4;
import defpackage.h20;
import defpackage.i20;
import defpackage.j20;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.xu3;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CompositionErrorContextImpl implements CompositionErrorContext, OperationErrorContext, h20 {
    public static final int $stable = 0;
    public static final Key Key = new Key(null);
    private final InternalComposer composer;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Key implements i20 {
        private Key() {
        }

        public /* synthetic */ Key(sb0 sb0Var) {
            this();
        }

        public String toString() {
            return "CompositionErrorContext";
        }
    }

    public CompositionErrorContextImpl(InternalComposer internalComposer) {
        this.composer = internalComposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComposeStackTrace attachComposeStackTrace$lambda$0(CompositionErrorContextImpl compositionErrorContextImpl, Object obj) {
        return compositionErrorContextImpl.composer.stackTraceForValue$runtime(obj);
    }

    @Override // androidx.compose.runtime.tooling.CompositionErrorContext
    public boolean attachComposeStackTrace(Throwable th, Object obj) {
        return ComposeStackTraceKt.tryAttachComposeStackTrace(th, new e4(22, this, obj));
    }

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
    public List<ComposeStackTraceFrame> buildStackTrace(Integer num) {
        return this.composer.parentStackTrace$runtime();
    }

    @Override // defpackage.j20
    public /* bridge */ <R> R fold(R r, ts0 ts0Var) {
        return (R) xu3.l(this, r, ts0Var);
    }

    @Override // defpackage.j20
    public /* bridge */ <E extends h20> E get(i20 i20Var) {
        return (E) xu3.m(this, i20Var);
    }

    @Override // defpackage.h20
    public i20 getKey() {
        return Key;
    }

    @Override // androidx.compose.runtime.composer.gapbuffer.changelist.OperationErrorContext
    public boolean getSourceInformationEnabled() {
        return this.composer.getSourceMarkersEnabled$runtime();
    }

    @Override // defpackage.j20
    public /* bridge */ j20 minusKey(i20 i20Var) {
        return xu3.r(this, i20Var);
    }

    @Override // defpackage.j20
    public /* bridge */ j20 plus(j20 j20Var) {
        return xu3.t(this, j20Var);
    }
}
