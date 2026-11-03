package androidx.compose.ui.layout;

import defpackage.sb0;
import defpackage.sg3;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
final class SLOperation {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int CancelPausedPrecomposition = m6774constructorimpl(0);
    private static final int ReuseForceSyncDeactivation = m6774constructorimpl(1);
    private static final int ReuseScheduleOutOfFrameDeactivation = m6774constructorimpl(2);
    private static final int ReuseSyncDeactivation = m6774constructorimpl(3);
    private static final int ReuseDeactivationViaHost = m6774constructorimpl(4);
    private static final int TookFromPrecomposeMap = m6774constructorimpl(5);
    private static final int Subcompose = m6774constructorimpl(6);
    private static final int SubcomposeNew = m6774constructorimpl(7);
    private static final int SubcomposePausable = m6774constructorimpl(8);
    private static final int SubcomposeForceReuse = m6774constructorimpl(9);
    private static final int DeactivateOutOfFrame = m6774constructorimpl(10);
    private static final int DeactivateOutOfFrameCancelled = m6774constructorimpl(11);
    private static final int SlotToReusedFromOnDeactivate = m6774constructorimpl(12);
    private static final int SlotToReusedFromOnReuse = m6774constructorimpl(13);
    private static final int Reused = m6774constructorimpl(14);
    private static final int ResumePaused = m6774constructorimpl(15);
    private static final int PausePaused = m6774constructorimpl(16);
    private static final int ApplyPaused = m6774constructorimpl(17);

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        /* renamed from: getApplyPaused-NjRlDlw, reason: not valid java name */
        public final int m6780getApplyPausedNjRlDlw() {
            return SLOperation.ApplyPaused;
        }

        /* renamed from: getCancelPausedPrecomposition-NjRlDlw, reason: not valid java name */
        public final int m6781getCancelPausedPrecompositionNjRlDlw() {
            return SLOperation.CancelPausedPrecomposition;
        }

        /* renamed from: getDeactivateOutOfFrame-NjRlDlw, reason: not valid java name */
        public final int m6782getDeactivateOutOfFrameNjRlDlw() {
            return SLOperation.DeactivateOutOfFrame;
        }

        /* renamed from: getDeactivateOutOfFrameCancelled-NjRlDlw, reason: not valid java name */
        public final int m6783getDeactivateOutOfFrameCancelledNjRlDlw() {
            return SLOperation.DeactivateOutOfFrameCancelled;
        }

        /* renamed from: getPausePaused-NjRlDlw, reason: not valid java name */
        public final int m6784getPausePausedNjRlDlw() {
            return SLOperation.PausePaused;
        }

        /* renamed from: getResumePaused-NjRlDlw, reason: not valid java name */
        public final int m6785getResumePausedNjRlDlw() {
            return SLOperation.ResumePaused;
        }

        /* renamed from: getReuseDeactivationViaHost-NjRlDlw, reason: not valid java name */
        public final int m6786getReuseDeactivationViaHostNjRlDlw() {
            return SLOperation.ReuseDeactivationViaHost;
        }

        /* renamed from: getReuseForceSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m6787getReuseForceSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseForceSyncDeactivation;
        }

        /* renamed from: getReuseScheduleOutOfFrameDeactivation-NjRlDlw, reason: not valid java name */
        public final int m6788getReuseScheduleOutOfFrameDeactivationNjRlDlw() {
            return SLOperation.ReuseScheduleOutOfFrameDeactivation;
        }

        /* renamed from: getReuseSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m6789getReuseSyncDeactivationNjRlDlw() {
            return SLOperation.ReuseSyncDeactivation;
        }

        /* renamed from: getReused-NjRlDlw, reason: not valid java name */
        public final int m6790getReusedNjRlDlw() {
            return SLOperation.Reused;
        }

        /* renamed from: getSlotToReusedFromOnDeactivate-NjRlDlw, reason: not valid java name */
        public final int m6791getSlotToReusedFromOnDeactivateNjRlDlw() {
            return SLOperation.SlotToReusedFromOnDeactivate;
        }

        /* renamed from: getSlotToReusedFromOnReuse-NjRlDlw, reason: not valid java name */
        public final int m6792getSlotToReusedFromOnReuseNjRlDlw() {
            return SLOperation.SlotToReusedFromOnReuse;
        }

        /* renamed from: getSubcompose-NjRlDlw, reason: not valid java name */
        public final int m6793getSubcomposeNjRlDlw() {
            return SLOperation.Subcompose;
        }

        /* renamed from: getSubcomposeForceReuse-NjRlDlw, reason: not valid java name */
        public final int m6794getSubcomposeForceReuseNjRlDlw() {
            return SLOperation.SubcomposeForceReuse;
        }

        /* renamed from: getSubcomposeNew-NjRlDlw, reason: not valid java name */
        public final int m6795getSubcomposeNewNjRlDlw() {
            return SLOperation.SubcomposeNew;
        }

        /* renamed from: getSubcomposePausable-NjRlDlw, reason: not valid java name */
        public final int m6796getSubcomposePausableNjRlDlw() {
            return SLOperation.SubcomposePausable;
        }

        /* renamed from: getTookFromPrecomposeMap-NjRlDlw, reason: not valid java name */
        public final int m6797getTookFromPrecomposeMapNjRlDlw() {
            return SLOperation.TookFromPrecomposeMap;
        }
    }

    private /* synthetic */ SLOperation(int i) {
        this.value = i;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SLOperation m6773boximpl(int i) {
        return new SLOperation(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6774constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6775equalsimpl(int i, Object obj) {
        return (obj instanceof SLOperation) && i == ((SLOperation) obj).m6779unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6776equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6777hashCodeimpl(int i) {
        return i;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6778toStringimpl(int i) {
        return sg3.o(i, "SLOperation(value=", ")");
    }

    public boolean equals(Object obj) {
        return m6775equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m6777hashCodeimpl(this.value);
    }

    public String toString() {
        return m6778toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m6779unboximpl() {
        return this.value;
    }
}
