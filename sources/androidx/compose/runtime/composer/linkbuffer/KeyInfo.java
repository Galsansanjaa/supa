package androidx.compose.runtime.composer.linkbuffer;

import androidx.compose.runtime.JoinedKey;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class KeyInfo {
    public static final int $stable = 8;
    private final long handle;
    private final int index;
    private final int key;
    private final int nodes;
    private final Object objectKey;

    public KeyInfo(int i, Object obj, long j, int i2, int i3) {
        this.key = i;
        this.objectKey = obj;
        this.handle = j;
        this.nodes = i2;
        this.index = i3;
    }

    public final int getAddress() {
        return GroupHandleKt.getGroup(getHandle());
    }

    public final long getHandle() {
        return this.handle;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Object getJoinedKey() {
        Object obj = this.objectKey;
        int i = this.key;
        return obj != null ? new JoinedKey(Integer.valueOf(i), this.objectKey) : Integer.valueOf(i);
    }

    public final int getKey() {
        return this.key;
    }

    public final int getNodes() {
        return this.nodes;
    }

    public final Object getObjectKey() {
        return this.objectKey;
    }
}
