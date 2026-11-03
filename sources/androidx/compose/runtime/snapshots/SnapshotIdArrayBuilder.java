package androidx.compose.runtime.snapshots;

import androidx.collection.MutableLongList;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SnapshotIdArrayBuilder {
    public static final int $stable = 8;
    private final MutableLongList list;

    public SnapshotIdArrayBuilder(long[] jArr) {
        MutableLongList mutableLongList;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            mutableLongList = new MutableLongList(copyOf.length);
            mutableLongList.addAll(mutableLongList._size, copyOf);
        } else {
            mutableLongList = new MutableLongList(0, 1, null);
        }
        this.list = mutableLongList;
    }

    public final void add(long j) {
        this.list.add(j);
    }

    public final long[] toArray() {
        MutableLongList mutableLongList = this.list;
        int i = mutableLongList._size;
        if (i == 0) {
            return null;
        }
        long[] jArr = new long[i];
        long[] jArr2 = mutableLongList.content;
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = jArr2[i2];
        }
        return jArr;
    }
}
