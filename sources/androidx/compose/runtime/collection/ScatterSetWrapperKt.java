package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import defpackage.ps0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ScatterSetWrapperKt {
    public static final boolean fastAny(Set<? extends Object> set, ps0 ps0Var) {
        if (!(set instanceof ScatterSetWrapper)) {
            Set<? extends Object> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (((Boolean) ps0Var.invoke(it.next())).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        ScatterSet set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
        Object[] objArr = set$runtime.elements;
        long[] jArr = set$runtime.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128 && ((Boolean) ps0Var.invoke(objArr[(i << 3) + i3])).booleanValue()) {
                            return true;
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static final <T> void fastForEach(Set<? extends T> set, ps0 ps0Var) {
        if (!(set instanceof ScatterSetWrapper)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                ps0Var.invoke(it.next());
            }
            return;
        }
        ScatterSet<T> set$runtime = ((ScatterSetWrapper) set).getSet$runtime();
        Object[] objArr = set$runtime.elements;
        long[] jArr = set$runtime.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ps0Var.invoke(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final <T> Set<T> wrapIntoSet(ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
