package androidx.room.concurrent;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class CloseBarrierKt {
    public static final void ifNotClosed(CloseBarrier closeBarrier, os0 os0Var) {
        closeBarrier.getClass();
        os0Var.getClass();
        if (closeBarrier.block$room_runtime_release()) {
            try {
                os0Var.invoke();
            } finally {
                closeBarrier.unblock$room_runtime_release();
            }
        }
    }
}
