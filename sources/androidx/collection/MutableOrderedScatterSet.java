package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import defpackage.jh2;
import defpackage.kw;
import defpackage.nf2;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.wd;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableOrderedScatterSet<E> extends OrderedScatterSet<E> {
    private int growthLimit;

    public MutableOrderedScatterSet() {
        this(0, 1, null);
    }

    public MutableOrderedScatterSet(int i) {
        super(null);
        if (!(i >= 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        initializeStorage(ScatterMapKt.unloadedCapacity(i));
    }

    public /* synthetic */ MutableOrderedScatterSet(int i, int i2, sb0 sb0Var) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    private final int findAbsoluteInsertIndex(E e) {
        int hashCode = (e != null ? e.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * ScatterMapKt.BitmaskLsb);
            for (long j4 = (~j3) & (j3 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (jh2.k(this.elements[numberOfTrailingZeros], e)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int findFirstAvailableSlot = findFirstAvailableSlot(i2);
                if (this.growthLimit == 0 && ((this.metadata[findFirstAvailableSlot >> 3] >> ((findFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    findFirstAvailableSlot = findFirstAvailableSlot(i2);
                }
                this._size++;
                int i10 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i11 = findFirstAvailableSlot >> 3;
                long j5 = jArr2[i11];
                int i12 = (findFirstAvailableSlot & 7) << 3;
                this.growthLimit = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this._capacity;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((findFirstAvailableSlot - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return findFirstAvailableSlot;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    private final int findFirstAvailableSlot(int i) {
        int i2 = this._capacity;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    private final void fixupNodes(int[] iArr) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr[i];
            int i3 = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
            int i4 = (int) (SieveCacheKt.NodeLinkMask & j);
            long j2 = ((j & SieveCacheKt.NodeMetaMask) | (i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i3])) << 31;
            if (i4 != Integer.MAX_VALUE) {
                i2 = iArr[i4];
            }
            jArr[i] = j2 | i2;
            i++;
        }
        int i5 = this.head;
        if (i5 != Integer.MAX_VALUE) {
            this.head = iArr[i5];
        }
        int i6 = this.tail;
        if (i6 != Integer.MAX_VALUE) {
            this.tail = iArr[i6];
        }
    }

    private final void fixupNodes(long[] jArr) {
        long[] jArr2 = this.nodes;
        int length = jArr2.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            if (i >= length) {
                break;
            }
            long j = jArr2[i];
            int i3 = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
            int i4 = (int) (SieveCacheKt.NodeLinkMask & j);
            long j2 = ((j & SieveCacheKt.NodeMetaMask) | (i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i3] & 4294967295L))) << 31;
            if (i4 != Integer.MAX_VALUE) {
                i2 = (int) (4294967295L & jArr[i4]);
            }
            jArr2[i] = i2 | j2;
            i++;
        }
        int i5 = this.head;
        if (i5 != Integer.MAX_VALUE) {
            this.head = (int) (jArr[i5] & 4294967295L);
        }
        int i6 = this.tail;
        if (i6 != Integer.MAX_VALUE) {
            this.tail = (int) (jArr[i6] & 4294967295L);
        }
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            int i2 = ((i + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i3 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        initializeGrowth();
    }

    private final void initializeStorage(int i) {
        long[] jArr;
        int max = i > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(i)) : 0;
        this._capacity = max;
        initializeMetadata(max);
        this.elements = max == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[max];
        if (max == 0) {
            jArr = SieveCacheKt.getEmptyNodes();
        } else {
            long[] jArr2 = new long[max];
            Arrays.fill(jArr2, 0, max, 4611686018427387903L);
            jArr = jArr2;
        }
        this.nodes = jArr;
    }

    private final void moveNodeToHead(int i) {
        long[] jArr = this.nodes;
        int i2 = this.head;
        jArr[i] = (i2 & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = ((SieveCacheKt.NodeLinkMask & i) << 31) | (jArr[i2] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = i;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = i;
        }
    }

    private final void removeNode(int i) {
        long[] jArr = this.nodes;
        long j = jArr[i];
        int i2 = (int) ((j >> 31) & SieveCacheKt.NodeLinkMask);
        int i3 = (int) (j & SieveCacheKt.NodeLinkMask);
        if (i2 != Integer.MAX_VALUE) {
            jArr[i2] = (jArr[i2] & SieveCacheKt.NodeMetaAndPreviousMask) | (i3 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i3;
        }
        if (i3 != Integer.MAX_VALUE) {
            jArr[i3] = ((i2 & SieveCacheKt.NodeLinkMask) << 31) | (jArr[i3] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i2;
        }
        jArr[i] = 4611686018427387903L;
    }

    public final boolean add(E e) {
        int size = getSize();
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(e);
        this.elements[findAbsoluteInsertIndex] = e;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[findAbsoluteInsertIndex] = (i & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((SieveCacheKt.NodeLinkMask & findAbsoluteInsertIndex) << 31) | (jArr[i] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = findAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = findAbsoluteInsertIndex;
        }
        return getSize() != size;
    }

    public final boolean addAll(ObjectList<E> objectList) {
        objectList.getClass();
        int size = getSize();
        plusAssign((ObjectList) objectList);
        return size != getSize();
    }

    public final boolean addAll(OrderedScatterSet<E> orderedScatterSet) {
        orderedScatterSet.getClass();
        int size = getSize();
        plusAssign((OrderedScatterSet) orderedScatterSet);
        return size != getSize();
    }

    public final boolean addAll(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        int size = getSize();
        plusAssign((ScatterSet) scatterSet);
        return size != getSize();
    }

    public final boolean addAll(Iterable<? extends E> iterable) {
        iterable.getClass();
        int size = getSize();
        plusAssign((Iterable) iterable);
        return size != getSize();
    }

    public final boolean addAll(nf2 nf2Var) {
        nf2Var.getClass();
        int size = getSize();
        plusAssign(nf2Var);
        return size != getSize();
    }

    public final boolean addAll(E[] eArr) {
        eArr.getClass();
        int size = getSize();
        plusAssign((Object[]) eArr);
        return size != getSize();
    }

    public final void adjustStorage$collection() {
        int i = this._capacity;
        if (i <= 8 || Long.compare((this._size * 32) ^ Long.MIN_VALUE, (i * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this._capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final Set<E> asMutableSet() {
        return new MutableOrderedSetWrapper(this);
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            wd.v0(jArr, -9187201950435737472L);
            long[] jArr2 = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        wd.r0(null, this.elements, 0, this._capacity);
        wd.v0(this.nodes, 4611686018427387903L);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        initializeGrowth();
    }

    public final void dropDeletes$collection() {
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i = this._capacity;
        Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i];
        int i2 = 0;
        long j = 9223372034707292159L;
        Arrays.fill(jArr3, 0, i, 9223372034707292159L);
        int i3 = (i + 7) >> 3;
        for (int i4 = 0; i4 < i3; i4++) {
            long j2 = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int length = jArr.length;
        int i5 = length - 1;
        int i6 = length - 2;
        jArr[i6] = (jArr[i6] & 72057594037927935L) | (-72057594037927936L);
        jArr[i5] = jArr[0];
        int i7 = 0;
        while (i7 != i) {
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j3 = (jArr[i8] >> i9) & 255;
            if (j3 != 128 && j3 == 254) {
                Object obj = objArr[i7];
                int hashCode = (obj != null ? obj.hashCode() : i2) * ScatterMapKt.MurmurHashC1;
                int i10 = (hashCode ^ (hashCode << 16)) >>> 7;
                int i11 = i2;
                int findFirstAvailableSlot = findFirstAvailableSlot(i10);
                int i12 = i10 & i;
                long j4 = j;
                if (((findFirstAvailableSlot - i12) & i) / 8 == ((i7 - i12) & i) / 8) {
                    jArr[i8] = ((r11 & 127) << i9) | (jArr[i8] & (~(255 << i9)));
                    if (jArr3[i7] == j4) {
                        long j5 = i7;
                        jArr3[i7] = j5 | (j5 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i11];
                } else {
                    int i13 = findFirstAvailableSlot >> 3;
                    long j6 = jArr[i13];
                    int i14 = (findFirstAvailableSlot & 7) << 3;
                    if (((j6 >> i14) & 255) == 128) {
                        jArr[i13] = (j6 & (~(255 << i14))) | ((r11 & 127) << i14);
                        jArr[i8] = (jArr[i8] & (~(255 << i9))) | (128 << i9);
                        objArr[findFirstAvailableSlot] = objArr[i7];
                        objArr[i7] = null;
                        jArr2[findFirstAvailableSlot] = jArr2[i7];
                        jArr2[i7] = 4611686018427387903L;
                        int i15 = (int) ((jArr3[i7] >> 32) & 4294967295L);
                        if (i15 != Integer.MAX_VALUE) {
                            jArr3[i15] = (jArr3[i15] & (-4294967296L)) | findFirstAvailableSlot;
                            jArr3[i7] = (jArr3[i7] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i7] = 9223372032559808512L | findFirstAvailableSlot;
                        }
                        jArr3[findFirstAvailableSlot] = (i7 << 32) | SieveCacheKt.NodeLinkMask;
                    } else {
                        jArr[i13] = ((r11 & 127) << i14) | (j6 & (~(255 << i14)));
                        Object obj2 = objArr[findFirstAvailableSlot];
                        objArr[findFirstAvailableSlot] = objArr[i7];
                        objArr[i7] = obj2;
                        long j7 = jArr2[findFirstAvailableSlot];
                        jArr2[findFirstAvailableSlot] = jArr2[i7];
                        jArr2[i7] = j7;
                        int i16 = (int) ((jArr3[i7] >> 32) & 4294967295L);
                        if (i16 != Integer.MAX_VALUE) {
                            long j8 = findFirstAvailableSlot;
                            jArr3[i16] = (jArr3[i16] & (-4294967296L)) | j8;
                            jArr3[i7] = (jArr3[i7] & 4294967295L) | (j8 << 32);
                        } else {
                            long j9 = findFirstAvailableSlot;
                            jArr3[i7] = j9 | (j9 << 32);
                            i16 = i7;
                        }
                        jArr3[findFirstAvailableSlot] = (i16 << 32) | i7;
                        i7--;
                    }
                    jArr[jArr.length - 1] = jArr[i11];
                }
                i7++;
                i2 = i11;
                j = j4;
            } else {
                i7++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ObjectList<E> objectList) {
        objectList.getClass();
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            minusAssign((MutableOrderedScatterSet<E>) objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(OrderedScatterSet<E> orderedScatterSet) {
        orderedScatterSet.getClass();
        Object[] objArr = orderedScatterSet.elements;
        long[] jArr = orderedScatterSet.nodes;
        int i = orderedScatterSet.tail;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
            minusAssign((MutableOrderedScatterSet<E>) objArr[i]);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        Object[] objArr = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
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
                        minusAssign((MutableOrderedScatterSet<E>) objArr[(i << 3) + i3]);
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

    public final void minusAssign(Iterable<? extends E> iterable) {
        iterable.getClass();
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            minusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13._capacity
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.metadata
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.elements
            r11 = r11[r10]
            boolean r11 = defpackage.jh2.k(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.removeElementAt(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.minusAssign(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(nf2 nf2Var) {
        nf2Var.getClass();
        Iterator it = nf2Var.iterator();
        while (it.hasNext()) {
            minusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void minusAssign(E[] eArr) {
        eArr.getClass();
        for (E e : eArr) {
            minusAssign((MutableOrderedScatterSet<E>) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ObjectList<E> objectList) {
        objectList.getClass();
        Object[] objArr = objectList.content;
        int i = objectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            plusAssign((MutableOrderedScatterSet<E>) objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(OrderedScatterSet<E> orderedScatterSet) {
        orderedScatterSet.getClass();
        Object[] objArr = orderedScatterSet.elements;
        long[] jArr = orderedScatterSet.nodes;
        int i = orderedScatterSet.tail;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & SieveCacheKt.NodeLinkMask);
            plusAssign((MutableOrderedScatterSet<E>) objArr[i]);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        Object[] objArr = scatterSet.elements;
        long[] jArr = scatterSet.metadata;
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
                        plusAssign((MutableOrderedScatterSet<E>) objArr[(i << 3) + i3]);
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

    public final void plusAssign(Iterable<? extends E> iterable) {
        iterable.getClass();
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            plusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(E e) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(e);
        this.elements[findAbsoluteInsertIndex] = e;
        long[] jArr = this.nodes;
        int i = this.head;
        jArr[findAbsoluteInsertIndex] = (i & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i != Integer.MAX_VALUE) {
            jArr[i] = ((SieveCacheKt.NodeLinkMask & findAbsoluteInsertIndex) << 31) | (jArr[i] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = findAbsoluteInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = findAbsoluteInsertIndex;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(nf2 nf2Var) {
        nf2Var.getClass();
        Iterator it = nf2Var.iterator();
        while (it.hasNext()) {
            plusAssign((MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(E[] eArr) {
        eArr.getClass();
        for (E e : eArr) {
            plusAssign((MutableOrderedScatterSet<E>) e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = defpackage.jh2.k(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.removeElementAt(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableOrderedScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(ObjectList<E> objectList) {
        objectList.getClass();
        int size = getSize();
        minusAssign((ObjectList) objectList);
        return size != getSize();
    }

    public final boolean removeAll(OrderedScatterSet<E> orderedScatterSet) {
        orderedScatterSet.getClass();
        int size = getSize();
        minusAssign((OrderedScatterSet) orderedScatterSet);
        return size != getSize();
    }

    public final boolean removeAll(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        int size = getSize();
        minusAssign((ScatterSet) scatterSet);
        return size != getSize();
    }

    public final boolean removeAll(Iterable<? extends E> iterable) {
        iterable.getClass();
        int size = getSize();
        minusAssign((Iterable) iterable);
        return size != getSize();
    }

    public final boolean removeAll(nf2 nf2Var) {
        nf2Var.getClass();
        int size = getSize();
        minusAssign(nf2Var);
        return size != getSize();
    }

    public final boolean removeAll(E[] eArr) {
        eArr.getClass();
        int size = getSize();
        minusAssign((Object[]) eArr);
        return size != getSize();
    }

    public final void removeElementAt(int i) {
        this._size--;
        long[] jArr = this.metadata;
        int i2 = this._capacity;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.elements[i] = null;
        long[] jArr2 = this.nodes;
        long j2 = jArr2[i];
        int i5 = (int) ((j2 >> 31) & SieveCacheKt.NodeLinkMask);
        int i6 = (int) (j2 & SieveCacheKt.NodeLinkMask);
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = (jArr2[i5] & SieveCacheKt.NodeMetaAndPreviousMask) | (i6 & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i6;
        }
        if (i6 != Integer.MAX_VALUE) {
            jArr2[i6] = ((i5 & SieveCacheKt.NodeLinkMask) << 31) | (jArr2[i6] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i5;
        }
        jArr2[i] = 4611686018427387903L;
    }

    public final void removeIf(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
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
                        int i4 = (i << 3) + i3;
                        if (((Boolean) ps0Var.invoke(objArr[i4])).booleanValue()) {
                            removeElementAt(i4);
                        }
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

    public final void resizeStorage$collection(int i) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i2 = this._capacity;
        int[] iArr = new int[i2];
        initializeStorage(i);
        long[] jArr4 = this.metadata;
        Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i3 = this._capacity;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr2[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i5 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i5 >>> 7);
                long j = i5 & 127;
                int i6 = findFirstAvailableSlot >> 3;
                int i7 = (findFirstAvailableSlot & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j2 = (jArr4[i6] & (~(255 << i7))) | (j << i7);
                jArr4[i6] = j2;
                jArr4[(((findFirstAvailableSlot - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr3[findFirstAvailableSlot] = obj;
                jArr5[findFirstAvailableSlot] = jArr3[i4];
                iArr[i4] = findFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i4++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(OrderedScatterSet<E> orderedScatterSet) {
        orderedScatterSet.getClass();
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!orderedScatterSet.contains(objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(ScatterSet<E> scatterSet) {
        scatterSet.getClass();
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!scatterSet.contains(objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(Collection<? extends E> collection) {
        collection.getClass();
        Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!kw.l0(collection, objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(ps0 ps0Var) {
        ps0Var.getClass();
        Object[] objArr = this.elements;
        int size = getSize();
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            if (!((Boolean) ps0Var.invoke(objArr[i4])).booleanValue()) {
                                removeElementAt(i4);
                            }
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
        return size != getSize();
    }

    public final int trim() {
        int i = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i) {
            return 0;
        }
        resizeStorage$collection(normalizeCapacity);
        return i - this._capacity;
    }

    public final void trimToSize(int i) {
        int i2;
        long[] jArr = this.nodes;
        int i3 = this.head;
        while (i3 != Integer.MAX_VALUE && (i2 = this._size) > i && i2 != 0) {
            int i4 = (int) (jArr[i3] & SieveCacheKt.NodeLinkMask);
            removeElementAt(i3);
            i3 = i4;
        }
    }
}
