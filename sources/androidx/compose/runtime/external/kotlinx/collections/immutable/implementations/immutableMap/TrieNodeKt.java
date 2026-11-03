package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import defpackage.wd;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 32;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 31;
    public static final int MAX_SHIFT = 30;

    public static final /* synthetic */ Object[] access$insertEntryAtIndex(Object[] objArr, int i, Object obj, Object obj2) {
        return insertEntryAtIndex(objArr, i, obj, obj2);
    }

    public static final /* synthetic */ Object[] access$removeEntryAtIndex(Object[] objArr, int i) {
        return removeEntryAtIndex(objArr, i);
    }

    public static final /* synthetic */ Object[] access$removeNodeAtIndex(Object[] objArr, int i) {
        return removeNodeAtIndex(objArr, i);
    }

    public static final /* synthetic */ Object[] access$replaceEntryWithNode(Object[] objArr, int i, int i2, TrieNode trieNode) {
        return replaceEntryWithNode(objArr, i, i2, trieNode);
    }

    public static final /* synthetic */ Object[] access$replaceNodeWithEntry(Object[] objArr, int i, int i2, Object obj, Object obj2) {
        return replaceNodeWithEntry(objArr, i, i2, obj, obj2);
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final <K, V> Object[] insertEntryAtIndex(Object[] objArr, int i, K k, V v) {
        Object[] objArr2 = new Object[objArr.length + 2];
        wd.o0(objArr, objArr2, 0, 0, i, 6);
        wd.k0(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = k;
        objArr2[i + 1] = v;
        return objArr2;
    }

    public static final Object[] removeEntryAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        wd.o0(objArr, objArr2, 0, 0, i, 6);
        wd.k0(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] removeNodeAtIndex(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        wd.o0(objArr, objArr2, 0, 0, i, 6);
        wd.k0(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public static final Object[] replaceEntryWithNode(Object[] objArr, int i, int i2, TrieNode<?, ?> trieNode) {
        Object[] objArr2 = new Object[objArr.length - 1];
        wd.o0(objArr, objArr2, 0, 0, i, 6);
        wd.k0(objArr, objArr2, i, i + 2, i2);
        objArr2[i2 - 2] = trieNode;
        wd.k0(objArr, objArr2, i2 - 1, i2, objArr.length);
        return objArr2;
    }

    public static final <K, V> Object[] replaceNodeWithEntry(Object[] objArr, int i, int i2, K k, V v) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        wd.k0(copyOf, copyOf, i + 2, i + 1, objArr.length);
        wd.k0(copyOf, copyOf, i2 + 2, i2, i);
        copyOf[i2] = k;
        copyOf[i2 + 1] = v;
        return copyOf;
    }
}
