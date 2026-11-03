package androidx.compose.runtime;

import androidx.compose.runtime.NextFrameEndCallbackQueue;
import defpackage.ps0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements ps0 {
    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 markFrameComplete$lambda$0;
        markFrameComplete$lambda$0 = NextFrameEndCallbackQueue.markFrameComplete$lambda$0((NextFrameEndCallbackQueue.NextFrameEndAwaiter) obj);
        return markFrameComplete$lambda$0;
    }
}
