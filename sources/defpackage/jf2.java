package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class jf2 {
    public static final sa4 b;
    public static final sa4 c;
    public static final sa4 d;
    public static final sa4 e;
    public static final int a = nb0.M(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");
    public static final int f = nb0.M(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i = 4;
        b = new sa4("PERMIT", i);
        c = new sa4("TAKEN", i);
        d = new sa4("BROKEN", i);
        e = new sa4("CANCELLED", i);
    }
}
