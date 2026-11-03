package androidx.compose.ui.platform;

import android.content.Context;
import defpackage.a10;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidClipboardImpl implements AndroidClipboard {
    public static final int $stable = 8;
    private final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboardImpl(Context context) {
        this(new AndroidClipboardManager(context));
    }

    public AndroidClipboardImpl(AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object getClipEntry(a10 a10Var) {
        return this.androidClipboardManager.getClip();
    }

    @Override // androidx.compose.ui.platform.AndroidClipboard
    public android.content.ClipboardManager getClipboardManager() {
        return this.androidClipboardManager.getNativeClipboard();
    }

    @Override // androidx.compose.ui.platform.AndroidClipboard, androidx.compose.ui.platform.Clipboard
    public final android.content.ClipboardManager getNativeClipboard() {
        return getClipboardManager();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object setClipEntry(ClipEntry clipEntry, a10 a10Var) {
        this.androidClipboardManager.setClip(clipEntry);
        return vy2.a;
    }
}
