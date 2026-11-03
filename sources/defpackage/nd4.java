package defpackage;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class nd4 extends je4 {
    public static final md4 d = new md4(0);
    public final AtomicLong c = new AtomicLong(SieveCacheKt.NodeLinkMask);

    @Override // defpackage.je4
    public final void a() {
        this.c.set(0L);
    }
}
