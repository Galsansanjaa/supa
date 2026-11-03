package androidx.compose.ui.platform;

import defpackage.a52;
import defpackage.qq;
import defpackage.wa2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class AndroidClipboard_androidKt {
    public static final android.content.ClipboardManager getNativeClipboardManager(Clipboard clipboard) {
        if (clipboard instanceof AndroidClipboard) {
            return ((AndroidClipboard) clipboard).getClipboardManager();
        }
        qq.j(wa2.y("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", a52.a(clipboard.getClass()).b()));
        return null;
    }
}
