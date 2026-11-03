package androidx.compose.foundation.draganddrop;

import defpackage.ts0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DragAndDropSourceDefaults {
    public static final int $stable = 0;
    public static final DragAndDropSourceDefaults INSTANCE = new DragAndDropSourceDefaults();
    private static final ts0 DefaultStartDetector = new DragAndDropSourceDefaults$DefaultStartDetector$1(null);

    private DragAndDropSourceDefaults() {
    }

    public final ts0 getDefaultStartDetector() {
        return DefaultStartDetector;
    }
}
