package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface SearchBarScrollBehavior {
    NestedScrollConnection getNestedScrollConnection();

    float getScrollOffset();

    float getScrollOffsetLimit();

    Modifier searchBarScrollBehavior(Modifier modifier);

    void setScrollOffset(float f);

    void setScrollOffsetLimit(float f);
}
