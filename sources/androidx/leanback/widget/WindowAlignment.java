package androidx.leanback.widget;

import defpackage.z72;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class WindowAlignment {
    public final Axis horizontal;
    private Axis mMainAxis;
    private int mOrientation = 0;
    private Axis mSecondAxis;
    public final Axis vertical;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Axis {
        private static final int PF_KEYLINE_OVER_HIGH_EDGE = 2;
        private static final int PF_KEYLINE_OVER_LOW_EDGE = 1;
        private int mMaxEdge;
        private int mMaxScroll;
        private int mMinEdge;
        private int mMinScroll;
        private int mPaddingMax;
        private int mPaddingMin;
        private boolean mReversedFlow;
        private int mSize;
        private int mPreferredKeyLine = 2;
        private int mWindowAlignment = 3;
        private int mWindowAlignmentOffset = 0;
        private float mWindowAlignmentOffsetPercent = 50.0f;

        public Axis(String str) {
            reset();
        }

        public int calculateKeyline() {
            boolean z = this.mReversedFlow;
            int i = this.mWindowAlignmentOffset;
            if (z) {
                int i2 = i >= 0 ? this.mSize - i : -i;
                float f = this.mWindowAlignmentOffsetPercent;
                return f != -1.0f ? i2 - ((int) ((this.mSize * f) / 100.0f)) : i2;
            }
            if (i < 0) {
                i += this.mSize;
            }
            float f2 = this.mWindowAlignmentOffsetPercent;
            return f2 != -1.0f ? i + ((int) ((this.mSize * f2) / 100.0f)) : i;
        }

        public int calculateScrollToKeyLine(int i, int i2) {
            return i - i2;
        }

        public int getClientSize() {
            return (this.mSize - this.mPaddingMin) - this.mPaddingMax;
        }

        public int getMaxScroll() {
            return this.mMaxScroll;
        }

        public int getMinScroll() {
            return this.mMinScroll;
        }

        public int getPaddingMax() {
            return this.mPaddingMax;
        }

        public int getPaddingMin() {
            return this.mPaddingMin;
        }

        public int getScroll(int i) {
            int i2;
            int i3;
            int size = getSize();
            int calculateKeyline = calculateKeyline();
            boolean isMinUnknown = isMinUnknown();
            boolean isMaxUnknown = isMaxUnknown();
            if (!isMinUnknown) {
                int i4 = this.mPaddingMin;
                int i5 = calculateKeyline - i4;
                boolean z = this.mReversedFlow;
                int i6 = this.mWindowAlignment;
                if (z ? (i6 & 2) != 0 : (i6 & 1) != 0) {
                    int i7 = this.mMinEdge;
                    if (i - i7 <= i5) {
                        int i8 = i7 - i4;
                        return (isMaxUnknown || i8 <= (i3 = this.mMaxScroll)) ? i8 : i3;
                    }
                }
            }
            if (!isMaxUnknown) {
                int i9 = this.mPaddingMax;
                int i10 = (size - calculateKeyline) - i9;
                boolean z2 = this.mReversedFlow;
                int i11 = this.mWindowAlignment;
                if (z2 ? (i11 & 1) != 0 : (i11 & 2) != 0) {
                    int i12 = this.mMaxEdge;
                    if (i12 - i <= i10) {
                        int i13 = i12 - (size - i9);
                        return (isMinUnknown || i13 >= (i2 = this.mMinScroll)) ? i13 : i2;
                    }
                }
            }
            return calculateScrollToKeyLine(i, calculateKeyline);
        }

        public int getSize() {
            return this.mSize;
        }

        public int getWindowAlignment() {
            return this.mWindowAlignment;
        }

        public int getWindowAlignmentOffset() {
            return this.mWindowAlignmentOffset;
        }

        public float getWindowAlignmentOffsetPercent() {
            return this.mWindowAlignmentOffsetPercent;
        }

        public void invalidateScrollMax() {
            this.mMaxEdge = Integer.MAX_VALUE;
            this.mMaxScroll = Integer.MAX_VALUE;
        }

        public void invalidateScrollMin() {
            this.mMinEdge = Integer.MIN_VALUE;
            this.mMinScroll = Integer.MIN_VALUE;
        }

        public boolean isMaxUnknown() {
            return this.mMaxEdge == Integer.MAX_VALUE;
        }

        public boolean isMinUnknown() {
            return this.mMinEdge == Integer.MIN_VALUE;
        }

        public boolean isPreferKeylineOverHighEdge() {
            return (this.mPreferredKeyLine & 2) != 0;
        }

        public boolean isPreferKeylineOverLowEdge() {
            return (this.mPreferredKeyLine & 1) != 0;
        }

        public void reset() {
            this.mMinEdge = Integer.MIN_VALUE;
            this.mMaxEdge = Integer.MAX_VALUE;
        }

        public void setPadding(int i, int i2) {
            this.mPaddingMin = i;
            this.mPaddingMax = i2;
        }

        public void setPreferKeylineOverHighEdge(boolean z) {
            int i = this.mPreferredKeyLine;
            this.mPreferredKeyLine = z ? i | 2 : i & (-3);
        }

        public void setPreferKeylineOverLowEdge(boolean z) {
            int i = this.mPreferredKeyLine;
            this.mPreferredKeyLine = z ? i | 1 : i & (-2);
        }

        public void setReversedFlow(boolean z) {
            this.mReversedFlow = z;
        }

        public void setSize(int i) {
            this.mSize = i;
        }

        public void setWindowAlignment(int i) {
            this.mWindowAlignment = i;
        }

        public void setWindowAlignmentOffset(int i) {
            this.mWindowAlignmentOffset = i;
        }

        public void setWindowAlignmentOffsetPercent(float f) {
            if ((f < 0.0f || f > 100.0f) && f != -1.0f) {
                z72.k();
            } else {
                this.mWindowAlignmentOffsetPercent = f;
            }
        }

        public String toString() {
            return " min:" + this.mMinEdge + " " + this.mMinScroll + " max:" + this.mMaxEdge + " " + this.mMaxScroll;
        }

        public void updateMinMax(int i, int i2, int i3, int i4) {
            this.mMinEdge = i;
            this.mMaxEdge = i2;
            int clientSize = getClientSize();
            int calculateKeyline = calculateKeyline();
            boolean isMinUnknown = isMinUnknown();
            boolean isMaxUnknown = isMaxUnknown();
            if (!isMinUnknown) {
                boolean z = this.mReversedFlow;
                int i5 = this.mWindowAlignment;
                if (z ? (i5 & 2) == 0 : (i5 & 1) == 0) {
                    this.mMinScroll = calculateScrollToKeyLine(i3, calculateKeyline);
                } else {
                    this.mMinScroll = this.mMinEdge - this.mPaddingMin;
                }
            }
            if (!isMaxUnknown) {
                boolean z2 = this.mReversedFlow;
                int i6 = this.mWindowAlignment;
                if (z2 ? (i6 & 1) == 0 : (i6 & 2) == 0) {
                    this.mMaxScroll = calculateScrollToKeyLine(i4, calculateKeyline);
                } else {
                    this.mMaxScroll = (this.mMaxEdge - this.mPaddingMin) - clientSize;
                }
            }
            if (isMaxUnknown || isMinUnknown) {
                return;
            }
            boolean z3 = this.mReversedFlow;
            int i7 = this.mWindowAlignment;
            if (z3) {
                if ((i7 & 1) != 0) {
                    if (isPreferKeylineOverLowEdge()) {
                        this.mMaxScroll = Math.max(this.mMaxScroll, calculateScrollToKeyLine(i3, calculateKeyline));
                    }
                    this.mMinScroll = Math.min(this.mMinScroll, this.mMaxScroll);
                    return;
                } else {
                    if ((i7 & 2) != 0) {
                        if (isPreferKeylineOverHighEdge()) {
                            this.mMinScroll = Math.min(this.mMinScroll, calculateScrollToKeyLine(i4, calculateKeyline));
                        }
                        this.mMaxScroll = Math.max(this.mMinScroll, this.mMaxScroll);
                        return;
                    }
                    return;
                }
            }
            if ((i7 & 1) != 0) {
                if (isPreferKeylineOverLowEdge()) {
                    this.mMinScroll = Math.min(this.mMinScroll, calculateScrollToKeyLine(i4, calculateKeyline));
                }
                this.mMaxScroll = Math.max(this.mMinScroll, this.mMaxScroll);
            } else if ((i7 & 2) != 0) {
                if (isPreferKeylineOverHighEdge()) {
                    this.mMaxScroll = Math.max(this.mMaxScroll, calculateScrollToKeyLine(i3, calculateKeyline));
                }
                this.mMinScroll = Math.min(this.mMinScroll, this.mMaxScroll);
            }
        }
    }

    public WindowAlignment() {
        Axis axis = new Axis("vertical");
        this.vertical = axis;
        Axis axis2 = new Axis("horizontal");
        this.horizontal = axis2;
        this.mMainAxis = axis2;
        this.mSecondAxis = axis;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public Axis mainAxis() {
        return this.mMainAxis;
    }

    public void reset() {
        mainAxis().reset();
    }

    public Axis secondAxis() {
        return this.mSecondAxis;
    }

    public void setOrientation(int i) {
        this.mOrientation = i;
        if (i == 0) {
            this.mMainAxis = this.horizontal;
            this.mSecondAxis = this.vertical;
        } else {
            this.mMainAxis = this.vertical;
            this.mSecondAxis = this.horizontal;
        }
    }

    public String toString() {
        return "horizontal=" + this.horizontal + "; vertical=" + this.vertical;
    }
}
