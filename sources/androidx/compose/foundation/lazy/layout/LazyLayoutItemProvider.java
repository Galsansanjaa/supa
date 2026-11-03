package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface LazyLayoutItemProvider {
    void Item(int i, Object obj, Composer composer, int i2);

    Object getContentType(int i);

    int getIndex(Object obj);

    int getItemCount();

    Object getKey(int i);
}
