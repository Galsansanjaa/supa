package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.state.ToggleableState;
import defpackage.a10;
import defpackage.e50;
import defpackage.sb0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class StyleStateKey<T> {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final StyleStateKey<Boolean> Enabled = new BooleanPredefinedKey(16, true);
    private static final StyleStateKey<Boolean> Focused;
    private static final StyleStateKey<Boolean> Hovered;
    private static final StyleStateKey<Boolean> Pressed;
    private static final StyleStateKey<Boolean> Selected;
    private final T defaultValue;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final StyleStateKey<Boolean> getEnabled() {
            return StyleStateKey.Enabled;
        }

        public final StyleStateKey<Boolean> getFocused() {
            return StyleStateKey.Focused;
        }

        public final StyleStateKey<Boolean> getHovered() {
            return StyleStateKey.Hovered;
        }

        public final StyleStateKey<Boolean> getPressed() {
            return StyleStateKey.Pressed;
        }

        public final StyleStateKey<Boolean> getSelected() {
            return StyleStateKey.Selected;
        }

        public final StyleStateKey<ToggleableState> getToggle() {
            return PredefinedToggleStateKey.INSTANCE;
        }
    }

    static {
        sb0 sb0Var = null;
        Companion = new Companion(sb0Var);
        boolean z = false;
        int i = 2;
        Pressed = new BooleanPredefinedKey(1, z, i, sb0Var);
        Hovered = new BooleanPredefinedKey(i, z, i, sb0Var);
        Focused = new BooleanPredefinedKey(4, z, i, sb0Var);
        Selected = new BooleanPredefinedKey(8, z, i, sb0Var);
    }

    public StyleStateKey(T t) {
        this.defaultValue = t;
    }

    public static /* synthetic */ <T> Object processInteraction$suspendImpl(StyleStateKey<T> styleStateKey, Interaction interaction, MutableStyleState mutableStyleState, a10 a10Var) {
        return vy2.a;
    }

    public final T getDefaultValue$foundation() {
        return this.defaultValue;
    }

    public T getValueFrom$foundation(MutableStyleState mutableStyleState) {
        return (T) mutableStyleState.getCustomValue$foundation(this);
    }

    public Object processInteraction(Interaction interaction, MutableStyleState mutableStyleState, a10 a10Var) {
        return processInteraction$suspendImpl(this, interaction, mutableStyleState, a10Var);
    }

    public final Object processInteractionAccess$foundation(Interaction interaction, MutableStyleState mutableStyleState, a10 a10Var) {
        Object processInteraction = processInteraction(interaction, mutableStyleState, a10Var);
        return processInteraction == e50.a ? processInteraction : vy2.a;
    }

    public void setValueTo$foundation(T t, MutableStyleState mutableStyleState) {
        mutableStyleState.setCustomValue$foundation(this, t);
    }
}
