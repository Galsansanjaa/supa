package androidx.compose.runtime.internal;

import defpackage.sb0;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class PlatformOptimizedCancellationException extends CancellationException {
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformOptimizedCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PlatformOptimizedCancellationException(String str) {
        super(str);
    }

    public /* synthetic */ PlatformOptimizedCancellationException(String str, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        StackTraceElement[] stackTraceElementArr;
        stackTraceElementArr = PlatformOptimizedCancellationException_jvmKt.EmptyStackTraceElements;
        setStackTrace(stackTraceElementArr);
        return this;
    }
}
