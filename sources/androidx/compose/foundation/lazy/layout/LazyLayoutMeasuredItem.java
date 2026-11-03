package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.Placeable;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface LazyLayoutMeasuredItem {
    /* renamed from: getConstraints-msEJaDk */
    long mo1182getConstraintsmsEJaDk();

    int getHorizontalAxisSize();

    int getHorizontalAxisSpacing();

    int getIndex();

    Object getKey();

    int getLane();

    /* renamed from: getOffset-Bjo55l4 */
    long mo1183getOffsetBjo55l4(int i);

    List<Placeable> getPlaceables();

    int getSpan();

    int getVerticalAxisSize();

    int getVerticalAxisSpacing();

    void makeNonScrollable();

    void position(int i, int i2, int i3, int i4);
}
