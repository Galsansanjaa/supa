package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import defpackage.i61;
import defpackage.vp1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class NearestRangeKeyIndexMap implements LazyLayoutKeyIndexMap {
    public static final int $stable = 8;
    private final Object[] keys;
    private final int keysStartIndex;
    private final ObjectIntMap<Object> map;

    public NearestRangeKeyIndexMap(i61 i61Var, LazyLayoutIntervalContent<?> lazyLayoutIntervalContent) {
        IntervalList<?> intervals = lazyLayoutIntervalContent.getIntervals();
        int i = i61Var.a;
        if (i < 0) {
            InlineClassHelperKt.throwIllegalStateException("negative nearestRange.first");
        }
        int min = Math.min(i61Var.b, intervals.getSize() - 1);
        if (min < i) {
            this.map = ObjectIntMapKt.emptyObjectIntMap();
            this.keys = new Object[0];
            this.keysStartIndex = 0;
        } else {
            int i2 = (min - i) + 1;
            this.keys = new Object[i2];
            this.keysStartIndex = i;
            MutableObjectIntMap mutableObjectIntMap = new MutableObjectIntMap(i2);
            intervals.forEach(i, min, new vp1(i, min, mutableObjectIntMap, this));
            this.map = mutableObjectIntMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
    
        if (r1 == null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.vy2 lambda$1$0(int r4, int r5, androidx.collection.MutableObjectIntMap r6, androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap r7, androidx.compose.foundation.lazy.layout.IntervalList.Interval r8) {
        /*
            java.lang.Object r0 = r8.getValue()
            androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent$Interval r0 = (androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval) r0
            ps0 r0 = r0.getKey()
            int r1 = r8.getStartIndex()
            int r4 = java.lang.Math.max(r4, r1)
            int r1 = r8.getStartIndex()
            int r2 = r8.getSize()
            int r2 = r2 + r1
            int r2 = r2 + (-1)
            int r5 = java.lang.Math.min(r5, r2)
            if (r4 > r5) goto L49
        L23:
            if (r0 == 0) goto L35
            int r1 = r8.getStartIndex()
            int r1 = r4 - r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r0.invoke(r1)
            if (r1 != 0) goto L39
        L35:
            java.lang.Object r1 = androidx.compose.foundation.lazy.layout.Lazy_androidKt.getDefaultLazyLayoutKey(r4)
        L39:
            r6.set(r1, r4)
            java.lang.Object[] r2 = r7.keys
            int r3 = r7.keysStartIndex
            int r3 = r4 - r3
            r2[r3] = r1
            if (r4 == r5) goto L49
            int r4 = r4 + 1
            goto L23
        L49:
            vy2 r4 = defpackage.vy2.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap.lambda$1$0(int, int, androidx.collection.MutableObjectIntMap, androidx.compose.foundation.lazy.layout.NearestRangeKeyIndexMap, androidx.compose.foundation.lazy.layout.IntervalList$Interval):vy2");
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public int getIndex(Object obj) {
        ObjectIntMap<Object> objectIntMap = this.map;
        int findKeyIndex = objectIntMap.findKeyIndex(obj);
        if (findKeyIndex >= 0) {
            return objectIntMap.values[findKeyIndex];
        }
        return -1;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap
    public Object getKey(int i) {
        Object[] objArr = this.keys;
        int i2 = i - this.keysStartIndex;
        if (i2 < 0 || i2 >= objArr.length) {
            return null;
        }
        return objArr[i2];
    }
}
