package androidx.compose.foundation.layout;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FlexAlignContent {
    public static final Companion Companion = new Companion(null);
    private final int bits;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getCenter-d9B3MrI, reason: not valid java name */
        public final int m811getCenterd9B3MrI() {
            return FlexAlignContent.m805constructorimpl(2);
        }

        /* renamed from: getEnd-d9B3MrI, reason: not valid java name */
        public final int m812getEndd9B3MrI() {
            return FlexAlignContent.m805constructorimpl(1);
        }

        /* renamed from: getSpaceAround-d9B3MrI, reason: not valid java name */
        public final int m813getSpaceAroundd9B3MrI() {
            return FlexAlignContent.m805constructorimpl(5);
        }

        /* renamed from: getSpaceBetween-d9B3MrI, reason: not valid java name */
        public final int m814getSpaceBetweend9B3MrI() {
            return FlexAlignContent.m805constructorimpl(4);
        }

        /* renamed from: getStart-d9B3MrI, reason: not valid java name */
        public final int m815getStartd9B3MrI() {
            return FlexAlignContent.m805constructorimpl(0);
        }

        /* renamed from: getStretch-d9B3MrI, reason: not valid java name */
        public final int m816getStretchd9B3MrI() {
            return FlexAlignContent.m805constructorimpl(3);
        }
    }

    private /* synthetic */ FlexAlignContent(int i) {
        this.bits = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FlexAlignContent m804boximpl(int i) {
        return new FlexAlignContent(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m805constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m806equalsimpl(int i, Object obj) {
        return (obj instanceof FlexAlignContent) && i == ((FlexAlignContent) obj).m810unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m807equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m808hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m809toStringimpl(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "INVALID" : "SpaceAround" : "SpaceBetween" : "Stretch" : "Center" : "End" : "Start";
    }

    public boolean equals(Object obj) {
        return m806equalsimpl(this.bits, obj);
    }

    public int hashCode() {
        return m808hashCodeimpl(this.bits);
    }

    public String toString() {
        return m809toStringimpl(this.bits);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m810unboximpl() {
        return this.bits;
    }
}
