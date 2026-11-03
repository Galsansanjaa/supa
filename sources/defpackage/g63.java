package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class g63 implements ThreadFactory {
    public static final /* synthetic */ g63 b = new g63(1);
    public final /* synthetic */ int a;

    public /* synthetic */ g63(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new de(runnable);
            default:
                Object obj = o64.j;
                return new Thread(runnable, "ProcessStablePhenotypeFlag");
        }
    }
}
