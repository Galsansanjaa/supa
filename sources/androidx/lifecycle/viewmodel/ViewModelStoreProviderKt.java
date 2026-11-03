package androidx.lifecycle.viewmodel;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMap;
import androidx.collection.ScatterMapKt;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class ViewModelStoreProviderKt {
    public static final /* synthetic */ ScatterMap access$toScatterMap(ScatterMap scatterMap) {
        return toScatterMap(scatterMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> ScatterMap<K, V> toScatterMap(ScatterMap<K, V> scatterMap) {
        if (scatterMap.isEmpty()) {
            return ScatterMapKt.emptyScatterMap();
        }
        MutableScatterMap mutableScatterMap = new MutableScatterMap(scatterMap.getSize());
        mutableScatterMap.putAll(scatterMap);
        return mutableScatterMap;
    }
}
