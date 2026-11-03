package androidx.core.os;

import android.os.Bundle;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class HeapProfileRequestBuilder extends ProfilingRequestBuilder<HeapProfileRequestBuilder> {
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.ProfilingRequestBuilder
    public Bundle getParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.ProfilingRequestBuilder
    public int getProfilingType() {
        return 2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.core.os.ProfilingRequestBuilder
    public HeapProfileRequestBuilder getThis() {
        return this;
    }

    public final HeapProfileRequestBuilder setBufferSizeKb(int i) {
        this.mParams.putInt("KEY_SIZE_KB", i);
        return this;
    }

    public final HeapProfileRequestBuilder setDurationMs(int i) {
        this.mParams.putInt("KEY_DURATION_MS", i);
        return this;
    }

    public final HeapProfileRequestBuilder setSamplingIntervalBytes(long j) {
        this.mParams.putLong("KEY_SAMPLING_INTERVAL_BYTES", j);
        return this;
    }

    public final HeapProfileRequestBuilder setTrackJavaAllocations(boolean z) {
        this.mParams.putBoolean("KEY_TRACK_JAVA_ALLOCATIONS", z);
        return this;
    }
}
