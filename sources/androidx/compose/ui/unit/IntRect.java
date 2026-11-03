package androidx.compose.ui.unit;

import defpackage.sb0;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class IntRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final IntRect Zero = new IntRect(0, 0, 0, 0);
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        public final IntRect getZero() {
            return IntRect.Zero;
        }
    }

    public IntRect(int i, int i2, int i3, int i4) {
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
    }

    public static /* synthetic */ IntRect copy$default(IntRect intRect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = intRect.left;
        }
        if ((i5 & 2) != 0) {
            i2 = intRect.top;
        }
        if ((i5 & 4) != 0) {
            i3 = intRect.right;
        }
        if ((i5 & 8) != 0) {
            i4 = intRect.bottom;
        }
        return intRect.copy(i, i2, i3, i4);
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    public static /* synthetic */ void getLeft$annotations() {
    }

    public static /* synthetic */ void getRight$annotations() {
    }

    /* renamed from: getSize-YbymL2g$annotations, reason: not valid java name */
    public static /* synthetic */ void m8192getSizeYbymL2g$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    /* renamed from: contains--gyyYBs, reason: not valid java name */
    public final boolean m8193containsgyyYBs(long j) {
        return IntOffset.m8173getXimpl(j) >= this.left && IntOffset.m8173getXimpl(j) < this.right && IntOffset.m8174getYimpl(j) >= this.top && IntOffset.m8174getYimpl(j) < this.bottom;
    }

    public final IntRect copy(int i, int i2, int i3, int i4) {
        return new IntRect(i, i2, i3, i4);
    }

    public final IntRect deflate(int i) {
        return inflate(-i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntRect)) {
            return false;
        }
        IntRect intRect = (IntRect) obj;
        return this.left == intRect.left && this.top == intRect.top && this.right == intRect.right && this.bottom == intRect.bottom;
    }

    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-nOcc-ac, reason: not valid java name */
    public final long m8194getBottomCenternOccac() {
        return IntOffset.m8167constructorimpl((((getWidth() / 2) + this.left) << 32) | (this.bottom & 4294967295L));
    }

    /* renamed from: getBottomLeft-nOcc-ac, reason: not valid java name */
    public final long m8195getBottomLeftnOccac() {
        return IntOffset.m8167constructorimpl((this.left << 32) | (this.bottom & 4294967295L));
    }

    /* renamed from: getBottomRight-nOcc-ac, reason: not valid java name */
    public final long m8196getBottomRightnOccac() {
        return IntOffset.m8167constructorimpl((this.right << 32) | (this.bottom & 4294967295L));
    }

    /* renamed from: getCenter-nOcc-ac, reason: not valid java name */
    public final long m8197getCenternOccac() {
        return IntOffset.m8167constructorimpl((((getWidth() / 2) + this.left) << 32) | (((getHeight() / 2) + this.top) & 4294967295L));
    }

    /* renamed from: getCenterLeft-nOcc-ac, reason: not valid java name */
    public final long m8198getCenterLeftnOccac() {
        return IntOffset.m8167constructorimpl((this.left << 32) | (((getHeight() / 2) + this.top) & 4294967295L));
    }

    /* renamed from: getCenterRight-nOcc-ac, reason: not valid java name */
    public final long m8199getCenterRightnOccac() {
        return IntOffset.m8167constructorimpl((this.right << 32) | (((getHeight() / 2) + this.top) & 4294967295L));
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(getWidth()), Math.abs(getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m8200getSizeYbymL2g() {
        return IntSize.m8211constructorimpl((getWidth() << 32) | (getHeight() & 4294967295L));
    }

    public final int getTop() {
        return this.top;
    }

    /* renamed from: getTopCenter-nOcc-ac, reason: not valid java name */
    public final long m8201getTopCenternOccac() {
        return IntOffset.m8167constructorimpl((((getWidth() / 2) + this.left) << 32) | (this.top & 4294967295L));
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name */
    public final long m8202getTopLeftnOccac() {
        return IntOffset.m8167constructorimpl((this.left << 32) | (this.top & 4294967295L));
    }

    /* renamed from: getTopRight-nOcc-ac, reason: not valid java name */
    public final long m8203getTopRightnOccac() {
        return IntOffset.m8167constructorimpl((this.right << 32) | (this.top & 4294967295L));
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((this.left * 31) + this.top) * 31) + this.right) * 31) + this.bottom;
    }

    public final IntRect inflate(int i) {
        return new IntRect(this.left - i, this.top - i, this.right + i, this.bottom + i);
    }

    public final IntRect intersect(IntRect intRect) {
        return new IntRect(Math.max(this.left, intRect.left), Math.max(this.top, intRect.top), Math.min(this.right, intRect.right), Math.min(this.bottom, intRect.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final boolean overlaps(IntRect intRect) {
        return this.right > intRect.left && intRect.right > this.left && this.bottom > intRect.top && intRect.bottom > this.top;
    }

    public String toString() {
        int i = this.left;
        int i2 = this.top;
        int i3 = this.right;
        int i4 = this.bottom;
        StringBuilder E = vg1.E("IntRect.fromLTRB(", i, ", ", i2, ", ");
        E.append(i3);
        E.append(", ");
        E.append(i4);
        E.append(")");
        return E.toString();
    }

    public final IntRect translate(int i, int i2) {
        return new IntRect(this.left + i, this.top + i2, this.right + i, this.bottom + i2);
    }

    /* renamed from: translate--gyyYBs, reason: not valid java name */
    public final IntRect m8204translategyyYBs(long j) {
        return new IntRect(IntOffset.m8173getXimpl(j) + this.left, IntOffset.m8174getYimpl(j) + this.top, IntOffset.m8173getXimpl(j) + this.right, IntOffset.m8174getYimpl(j) + this.bottom);
    }
}
