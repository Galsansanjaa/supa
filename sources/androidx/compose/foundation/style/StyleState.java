package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.state.ToggleableState;
import defpackage.a10;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class StyleState {
    public static final int $stable = 0;

    private StyleState() {
    }

    public /* synthetic */ StyleState(sb0 sb0Var) {
        this();
    }

    public abstract <T> T get(StyleStateKey<T> styleStateKey);

    public abstract InteractionSource getInteractionSource$foundation();

    public abstract ToggleableState getTriStateToggle();

    public abstract boolean isChecked();

    public abstract boolean isEnabled();

    public abstract boolean isFocused();

    public abstract boolean isHovered();

    public abstract boolean isPressed();

    public abstract boolean isSelected();

    public abstract Object processInteractions$foundation(InteractionSource interactionSource, a10 a10Var);
}
