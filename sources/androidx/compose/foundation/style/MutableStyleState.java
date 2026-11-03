package androidx.compose.foundation.style;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.state.ToggleableState;
import defpackage.a10;
import defpackage.e50;
import defpackage.hu2;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableStyleState extends StyleState {
    public static final int $stable = 8;
    private SnapshotStateMap<StyleStateKey<?>, Object> customStates;
    private final InteractionSource interactionSource;
    private MutableStateFlagSet predefinedState;

    public MutableStyleState(InteractionSource interactionSource) {
        super(null);
        this.interactionSource = interactionSource;
        this.customStates = SnapshotStateKt.mutableStateMapOf();
        this.predefinedState = new MutableStateFlagSet(16);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public <T> T get(StyleStateKey<T> styleStateKey) {
        return styleStateKey.getValueFrom$foundation(this);
    }

    public final SnapshotStateMap<StyleStateKey<?>, Object> getCustomStates$foundation() {
        return this.customStates;
    }

    public final <T> T getCustomValue$foundation(StyleStateKey<T> styleStateKey) {
        T t = (T) this.customStates.get(styleStateKey);
        return t == null ? styleStateKey.getDefaultValue$foundation() : t;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public InteractionSource getInteractionSource$foundation() {
        return this.interactionSource;
    }

    public final MutableStateFlagSet getPredefinedState$foundation() {
        return this.predefinedState;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public ToggleableState getTriStateToggle() {
        return PredefinedToggleStateKey.INSTANCE.getValueFrom$foundation(this);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isChecked() {
        return PredefinedToggleStateKey.INSTANCE.getValueFrom$foundation(this) == ToggleableState.On;
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isEnabled() {
        return this.predefinedState.getFlag(16);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isFocused() {
        return this.predefinedState.getFlag(4);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isHovered() {
        return this.predefinedState.getFlag(2);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isPressed() {
        return this.predefinedState.getFlag(1);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public boolean isSelected() {
        return this.predefinedState.getFlag(8);
    }

    @Override // androidx.compose.foundation.style.StyleState
    public Object processInteractions$foundation(InteractionSource interactionSource, a10 a10Var) {
        InteractionSet interactionSet = new InteractionSet();
        InteractionSet interactionSet2 = new InteractionSet();
        InteractionSet interactionSet3 = new InteractionSet();
        setPressed(false);
        setHovered(false);
        setFocused(false);
        Object collect = interactionSource.getInteractions().collect(new MutableStyleState$processInteractions$2(interactionSet, this, interactionSet2, interactionSet3), a10Var);
        return collect == e50.a ? collect : vy2.a;
    }

    public final <T> void remove(StyleStateKey<T> styleStateKey) {
        if (styleStateKey instanceof PredefinedKey) {
            hu2.h("Cannot remove an internal StyleStateKey");
        } else {
            this.customStates.remove(styleStateKey);
        }
    }

    public final <T> void set(StyleStateKey<T> styleStateKey, T t) {
        styleStateKey.setValueTo$foundation(t, this);
    }

    public void setChecked(boolean z) {
        PredefinedToggleStateKey.INSTANCE.setValueTo$foundation(z ? ToggleableState.On : ToggleableState.Off, this);
    }

    public final void setCustomStates$foundation(SnapshotStateMap<StyleStateKey<?>, Object> snapshotStateMap) {
        this.customStates = snapshotStateMap;
    }

    public final <T> void setCustomValue$foundation(StyleStateKey<T> styleStateKey, T t) {
        SnapshotStateMap<StyleStateKey<?>, Object> snapshotStateMap = this.customStates;
        t.getClass();
        snapshotStateMap.put(styleStateKey, t);
    }

    public void setEnabled(boolean z) {
        this.predefinedState.updateFlag(16, z);
    }

    public void setFocused(boolean z) {
        this.predefinedState.updateFlag(4, z);
    }

    public void setHovered(boolean z) {
        this.predefinedState.updateFlag(2, z);
    }

    public final void setPredefinedState$foundation(MutableStateFlagSet mutableStateFlagSet) {
        this.predefinedState = mutableStateFlagSet;
    }

    public void setPressed(boolean z) {
        this.predefinedState.updateFlag(1, z);
    }

    public void setSelected(boolean z) {
        this.predefinedState.updateFlag(8, z);
    }

    public void setTriStateToggle(ToggleableState toggleableState) {
        PredefinedToggleStateKey.INSTANCE.setValueTo$foundation(toggleableState, this);
    }
}
