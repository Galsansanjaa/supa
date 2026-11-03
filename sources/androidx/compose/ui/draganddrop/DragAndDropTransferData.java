package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class DragAndDropTransferData {
    public static final int $stable = 8;
    private final ClipData clipData;
    private final int flags;
    private final Object localState;

    public DragAndDropTransferData(ClipData clipData, Object obj, int i) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i;
    }

    public /* synthetic */ DragAndDropTransferData(ClipData clipData, Object obj, int i, int i2, sb0 sb0Var) {
        this(clipData, (i2 & 2) != 0 ? null : obj, (i2 & 4) != 0 ? 0 : i);
    }

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final Object getLocalState() {
        return this.localState;
    }
}
