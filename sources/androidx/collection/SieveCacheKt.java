package androidx.collection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SieveCacheKt {
    public static final long EmptyNode = 4611686018427387903L;
    private static final long[] EmptyNodes = new long[0];
    public static final long InvalidMapping = 9223372034707292159L;
    public static final int InvalidMappingLink = Integer.MAX_VALUE;
    private static final long MaxSize = 2147483646;
    public static final int NodeInvalidLink = Integer.MAX_VALUE;
    public static final long NodeLinkMask = 2147483647L;
    public static final long NodeLinksMask = 4611686018427387903L;
    public static final long NodeMetaAndNextMask = -4611686016279904257L;
    public static final long NodeMetaAndPreviousMask = -2147483648L;
    public static final long NodeMetaMask = -4611686018427387904L;
    public static final long NodeVisitedBit = 4611686018427387904L;

    public static final long clearVisitedBit(long j) {
        return j & 4611686018427387903L;
    }

    public static final long createDstMapping(long j, int i) {
        return (j & (-4294967296L)) | i;
    }

    public static final long createLinkToNext(int i) {
        return (i & NodeLinkMask) | 4611686016279904256L;
    }

    public static final long createLinks(long j, int i, int i2, int[] iArr) {
        iArr.getClass();
        return (((j & NodeMetaMask) | (i == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i])) << 31) | (i2 != Integer.MAX_VALUE ? iArr[i2] : Integer.MAX_VALUE);
    }

    public static final long createLinks(long j, int i, int i2, long[] jArr) {
        jArr.getClass();
        return (((j & NodeMetaMask) | (i == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr[i] & 4294967295L))) << 31) | (i2 != Integer.MAX_VALUE ? (int) (jArr[i2] & 4294967295L) : Integer.MAX_VALUE);
    }

    public static final long createMapping(int i, int i2) {
        return i2 | (i << 32);
    }

    public static final long createSrcMapping(long j, int i) {
        return (j & 4294967295L) | (i << 32);
    }

    public static final long eraseSrcMapping(long j) {
        return (j & 4294967295L) | (-4294967296L);
    }

    public static final int getDst(long j) {
        return (int) (j & 4294967295L);
    }

    public static final long[] getEmptyNodes() {
        return EmptyNodes;
    }

    public static final int getNextNode(long j) {
        return (int) (j & NodeLinkMask);
    }

    public static /* synthetic */ void getNextNode$annotations(long j) {
    }

    public static /* synthetic */ void getNodeInvalidLink$annotations() {
    }

    public static /* synthetic */ void getNodeLinkMask$annotations() {
    }

    public static final int getPreviousNode(long j) {
        return (int) ((j >> 31) & NodeLinkMask);
    }

    public static /* synthetic */ void getPreviousNode$annotations(long j) {
    }

    public static final int getSrc(long j) {
        return (int) ((j >> 32) & 4294967295L);
    }

    public static final int getVisited(long j) {
        return (int) ((j >> 62) & 1);
    }

    public static final long setLinkToNext(long j, int i) {
        return (j & NodeMetaAndPreviousMask) | (i & NodeLinkMask);
    }

    public static final long setLinkToPrevious(long j, int i) {
        return (j & NodeMetaAndNextMask) | ((i & NodeLinkMask) << 31);
    }
}
