package androidx.compose.ui.platform;

import android.content.ClipData;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ClipEntry {
    public static final int $stable = 8;
    private final ClipData clipData;

    public ClipEntry(ClipData clipData) {
        this.clipData = clipData;
    }

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final ClipMetadata getClipMetadata() {
        return AndroidClipboardManager_androidKt.toClipMetadata(this.clipData.getDescription());
    }
}
