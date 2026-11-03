package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.IntSize;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class ContentInViewNodeKt {
    private static final boolean DEBUG = false;
    private static final float MinScrollThreshold = 0.5f;
    private static final String TAG = "ContentInViewModifier";
    private static final long UnspecifiedIntSize = IntSize.m8211constructorimpl(-1);

    /* renamed from: takeOrElse-viCIZxY, reason: not valid java name */
    private static final long m510takeOrElseviCIZxY(long j, os0 os0Var) {
        return IntSize.m8214equalsimpl0(j, UnspecifiedIntSize) ? ((IntSize) os0Var.invoke()).m8220unboximpl() : j;
    }
}
