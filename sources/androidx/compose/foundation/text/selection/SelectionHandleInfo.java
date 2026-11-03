package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    public static final int $stable = 0;
    private final SelectionHandleAnchor anchor;
    private final Handle handle;
    private final long position;
    private final boolean visible;

    private SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.handle = handle;
        this.position = j;
        this.anchor = selectionHandleAnchor;
        this.visible = z;
    }

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z, sb0 sb0Var) {
        this(handle, j, selectionHandleAnchor, z);
    }

    /* renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m2128copyubNVwUQ$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i & 2) != 0) {
            j = selectionHandleInfo.position;
        }
        if ((i & 4) != 0) {
            selectionHandleAnchor = selectionHandleInfo.anchor;
        }
        if ((i & 8) != 0) {
            z = selectionHandleInfo.visible;
        }
        return selectionHandleInfo.m2130copyubNVwUQ(handle, j, selectionHandleAnchor, z);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m2129component2F1C5BW0() {
        return this.position;
    }

    public final SelectionHandleAnchor component3() {
        return this.anchor;
    }

    public final boolean component4() {
        return this.visible;
    }

    /* renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final SelectionHandleInfo m2130copyubNVwUQ(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        return new SelectionHandleInfo(handle, j, selectionHandleAnchor, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m5087equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    public final SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m2131getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return ((this.anchor.hashCode() + ((Offset.m5092hashCodeimpl(this.position) + (this.handle.hashCode() * 31)) * 31)) * 31) + (this.visible ? 1231 : 1237);
    }

    public String toString() {
        return "SelectionHandleInfo(handle=" + this.handle + ", position=" + Offset.m5098toStringimpl(this.position) + ", anchor=" + this.anchor + ", visible=" + this.visible + ")";
    }
}
