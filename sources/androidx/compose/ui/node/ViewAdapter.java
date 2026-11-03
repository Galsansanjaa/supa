package androidx.compose.ui.node;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public interface ViewAdapter {
    void didInsert(View view, ViewGroup viewGroup);

    void didUpdate(View view, ViewGroup viewGroup);

    int getId();

    void willInsert(View view, ViewGroup viewGroup);
}
