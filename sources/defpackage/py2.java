package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class py2 implements Executor {
    public static final py2 a;
    public static final Handler b;
    public static final /* synthetic */ py2[] m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, py2] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        m = new py2[]{r0};
        b = new Handler(Looper.getMainLooper());
    }

    public static py2 valueOf(String str) {
        return (py2) Enum.valueOf(py2.class, str);
    }

    public static py2[] values() {
        return (py2[]) m.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
