package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class zd0 implements Executor {
    public static final zd0 a;
    public static final /* synthetic */ zd0[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, zd0] */
    static {
        ?? r0 = new Enum("INSTANCE", 0);
        a = r0;
        b = new zd0[]{r0};
    }

    public static zd0 valueOf(String str) {
        return (zd0) Enum.valueOf(zd0.class, str);
    }

    public static zd0[] values() {
        return (zd0[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
