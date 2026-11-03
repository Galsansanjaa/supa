package androidx.compose.ui.spatial;

import androidx.compose.ui.Actual_androidKt;
import defpackage.os0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ExecuteDelayUsingPostAndRemove implements ExecuteDelayed {
    public static final ExecuteDelayUsingPostAndRemove INSTANCE = new ExecuteDelayUsingPostAndRemove();

    private ExecuteDelayUsingPostAndRemove() {
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public Object executeDelayed(long j, os0 os0Var) {
        return Actual_androidKt.postDelayed(j, os0Var);
    }

    @Override // androidx.compose.ui.spatial.ExecuteDelayed
    public void removeDelayedExecution(Object obj) {
        Actual_androidKt.removePost(obj);
    }
}
