package androidx.compose.ui.platform;

import androidx.compose.ui.text.AnnotatedString;
import defpackage.hd0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@hd0
/* loaded from: classes3.dex */
public interface ClipboardManager {
    ClipEntry getClip();

    android.content.ClipboardManager getNativeClipboard();

    AnnotatedString getText();

    boolean hasText();

    void setClip(ClipEntry clipEntry);

    void setText(AnnotatedString annotatedString);
}
