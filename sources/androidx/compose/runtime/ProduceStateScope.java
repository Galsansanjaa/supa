package androidx.compose.runtime;

import defpackage.a10;
import defpackage.j20;
import defpackage.os0;
import defpackage.y40;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface ProduceStateScope<T> extends MutableState<T>, y40 {
    Object awaitDispose(os0 os0Var, a10 a10Var);

    @Override // defpackage.y40
    /* synthetic */ j20 getCoroutineContext();
}
