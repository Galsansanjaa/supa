package androidx.datastore.core;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class NativeSharedCounter {
    public final native long nativeCreateSharedCounter(int i);

    public final native int nativeGetCounterValue(long j);

    public final native int nativeIncrementAndGetCounterValue(long j);

    public final native int nativeTruncateFile(int i);
}
