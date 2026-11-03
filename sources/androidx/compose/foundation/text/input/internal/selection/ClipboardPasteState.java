package androidx.compose.foundation.text.input.internal.selection;

import android.content.ClipDescription;
import androidx.compose.ui.platform.AndroidClipboard_androidKt;
import androidx.compose.ui.platform.Clipboard;
import defpackage.a10;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ClipboardPasteState {
    public static final int $stable = 8;
    private boolean _hasClip;
    private boolean _hasText;
    private final Clipboard clipboard;

    public ClipboardPasteState(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final boolean getHasClip() {
        return this._hasClip;
    }

    public final boolean getHasText() {
        return this._hasText;
    }

    public final Object update(a10 a10Var) {
        ClipDescription primaryClipDescription;
        boolean hasPrimaryClip = AndroidClipboard_androidKt.getNativeClipboardManager(this.clipboard).hasPrimaryClip();
        this._hasClip = hasPrimaryClip;
        boolean z = false;
        if (hasPrimaryClip && (primaryClipDescription = AndroidClipboard_androidKt.getNativeClipboardManager(this.clipboard).getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
            z = true;
        }
        this._hasText = z;
        return vy2.a;
    }
}
