package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.ui.unit.Density;
import defpackage.ts0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface CacheWindowScope {
    Density getDensity();

    int getFirstVisibleLineIndex();

    boolean getHasVisibleItems();

    int getLastIndexInLine(int i);

    int getLastLineIndex();

    int getLastVisibleLineIndex();

    int getMainAxisExtraSpaceEnd();

    int getMainAxisExtraSpaceStart();

    int getMainAxisViewportSize();

    int getTotalItemsCount();

    int getVisibleItemLine(int i);

    int getVisibleItemSize(int i);

    int getVisibleLineCount();

    Object getVisibleLineKey(int i);

    List<LazyLayoutPrefetchState.PrefetchHandle> schedulePrefetch(int i, ts0 ts0Var);
}
