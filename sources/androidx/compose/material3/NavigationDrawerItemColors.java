package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface NavigationDrawerItemColors {
    State<Color> badgeColor(boolean z, Composer composer, int i);

    State<Color> containerColor(boolean z, Composer composer, int i);

    State<Color> iconColor(boolean z, Composer composer, int i);

    State<Color> textColor(boolean z, Composer composer, int i);
}
