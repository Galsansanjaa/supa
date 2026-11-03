package androidx.room.concurrent;

import defpackage.h20;
import defpackage.mq2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ThreadLocal_jvmAndroidKt {
    public static /* synthetic */ void ThreadLocal$annotations() {
    }

    public static final <T> h20 asContextElement(ThreadLocal<T> threadLocal, T t) {
        threadLocal.getClass();
        return new mq2(threadLocal, t);
    }

    public static final long currentThreadId() {
        return Thread.currentThread().getId();
    }
}
