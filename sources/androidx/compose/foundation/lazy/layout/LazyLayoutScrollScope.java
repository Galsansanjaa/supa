package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.ScrollScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface LazyLayoutScrollScope extends ScrollScope {
    int calculateDistanceTo(int i, int i2);

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    void snapToItem(int i, int i2);
}
