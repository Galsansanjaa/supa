package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import defpackage.jh2;
import defpackage.sb0;
import defpackage.sg3;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class Selection {
    public static final int $stable = 0;
    private final AnchorInfo end;
    private final boolean handlesCrossed;
    private final AnchorInfo start;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class AnchorInfo {
        public static final int $stable = 0;
        private final ResolvedTextDirection direction;
        private final int offset;
        private final long selectableId;

        public AnchorInfo(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            this.direction = resolvedTextDirection;
            this.offset = i;
            this.selectableId = j;
        }

        public static /* synthetic */ AnchorInfo copy$default(AnchorInfo anchorInfo, ResolvedTextDirection resolvedTextDirection, int i, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                resolvedTextDirection = anchorInfo.direction;
            }
            if ((i2 & 2) != 0) {
                i = anchorInfo.offset;
            }
            if ((i2 & 4) != 0) {
                j = anchorInfo.selectableId;
            }
            return anchorInfo.copy(resolvedTextDirection, i, j);
        }

        public final ResolvedTextDirection component1() {
            return this.direction;
        }

        public final int component2() {
            return this.offset;
        }

        public final long component3() {
            return this.selectableId;
        }

        public final AnchorInfo copy(ResolvedTextDirection resolvedTextDirection, int i, long j) {
            return new AnchorInfo(resolvedTextDirection, i, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnchorInfo)) {
                return false;
            }
            AnchorInfo anchorInfo = (AnchorInfo) obj;
            return this.direction == anchorInfo.direction && this.offset == anchorInfo.offset && this.selectableId == anchorInfo.selectableId;
        }

        public final ResolvedTextDirection getDirection() {
            return this.direction;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final long getSelectableId() {
            return this.selectableId;
        }

        public int hashCode() {
            int hashCode = ((this.direction.hashCode() * 31) + this.offset) * 31;
            long j = this.selectableId;
            return hashCode + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            ResolvedTextDirection resolvedTextDirection = this.direction;
            int i = this.offset;
            long j = this.selectableId;
            StringBuilder sb = new StringBuilder("AnchorInfo(direction=");
            sb.append(resolvedTextDirection);
            sb.append(", offset=");
            sb.append(i);
            sb.append(", selectableId=");
            return vg1.C(j, ")", sb);
        }
    }

    public Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z) {
        this.start = anchorInfo;
        this.end = anchorInfo2;
        this.handlesCrossed = z;
    }

    public /* synthetic */ Selection(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i, sb0 sb0Var) {
        this(anchorInfo, anchorInfo2, (i & 4) != 0 ? false : z);
    }

    public static /* synthetic */ Selection copy$default(Selection selection, AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            anchorInfo = selection.start;
        }
        if ((i & 2) != 0) {
            anchorInfo2 = selection.end;
        }
        if ((i & 4) != 0) {
            z = selection.handlesCrossed;
        }
        return selection.copy(anchorInfo, anchorInfo2, z);
    }

    public final AnchorInfo component1() {
        return this.start;
    }

    public final AnchorInfo component2() {
        return this.end;
    }

    public final boolean component3() {
        return this.handlesCrossed;
    }

    public final Selection copy(AnchorInfo anchorInfo, AnchorInfo anchorInfo2, boolean z) {
        return new Selection(anchorInfo, anchorInfo2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Selection)) {
            return false;
        }
        Selection selection = (Selection) obj;
        return jh2.k(this.start, selection.start) && jh2.k(this.end, selection.end) && this.handlesCrossed == selection.handlesCrossed;
    }

    public final AnchorInfo getEnd() {
        return this.end;
    }

    public final boolean getHandlesCrossed() {
        return this.handlesCrossed;
    }

    public final AnchorInfo getStart() {
        return this.start;
    }

    public int hashCode() {
        return ((this.end.hashCode() + (this.start.hashCode() * 31)) * 31) + (this.handlesCrossed ? 1231 : 1237);
    }

    public final Selection merge(Selection selection) {
        if (selection == null) {
            return this;
        }
        boolean z = this.handlesCrossed;
        if (z || selection.handlesCrossed) {
            return new Selection(selection.handlesCrossed ? selection.start : selection.end, z ? this.end : this.start, true);
        }
        return copy$default(this, null, selection.end, false, 5, null);
    }

    public String toString() {
        AnchorInfo anchorInfo = this.start;
        AnchorInfo anchorInfo2 = this.end;
        boolean z = this.handlesCrossed;
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(anchorInfo);
        sb.append(", end=");
        sb.append(anchorInfo2);
        sb.append(", handlesCrossed=");
        return sg3.u(sb, z, ")");
    }

    /* renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m2127toTextRanged9O1mEE() {
        return TextRangeKt.TextRange(this.start.getOffset(), this.end.getOffset());
    }
}
