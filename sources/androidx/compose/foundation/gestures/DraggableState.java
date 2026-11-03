package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import defpackage.a10;
import defpackage.f31;
import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface DraggableState {

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object drag$default(DraggableState draggableState, MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var, int i, Object obj) {
            if (obj != null) {
                f31.f("Super calls with default arguments not supported in this target, function: drag");
                return null;
            }
            if ((i & 1) != 0) {
                mutatePriority = MutatePriority.Default;
            }
            return draggableState.drag(mutatePriority, ts0Var, a10Var);
        }
    }

    void dispatchRawDelta(float f);

    Object drag(MutatePriority mutatePriority, ts0 ts0Var, a10 a10Var);
}
