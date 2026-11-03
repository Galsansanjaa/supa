package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import defpackage.os0;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ClipboardEventsHandler_jvmAndAndroidKt {
    public static final boolean rememberClipboardEventsHandler(ps0 ps0Var, os0 os0Var, os0 os0Var2, boolean z, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            ClipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$1 clipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$1 = ClipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$1.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            ClipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$2 clipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$2 = new os0() { // from class: androidx.compose.foundation.text.ClipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$2
                @Override // defpackage.os0
                public final Void invoke() {
                    return null;
                }
            };
        }
        if ((i2 & 4) == 0) {
            return false;
        }
        ClipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$3 clipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$3 = ClipboardEventsHandler_jvmAndAndroidKt$rememberClipboardEventsHandler$3.INSTANCE;
        return false;
    }
}
