package androidx.compose.ui.semantics;

import androidx.compose.ui.unit.IntRect;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface SemanticsRegion {
    boolean difference(IntRect intRect);

    IntRect getBounds();

    boolean intersect(SemanticsRegion semanticsRegion);

    boolean isEmpty();

    void set(IntRect intRect);
}
