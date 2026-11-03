package androidx.compose.foundation.style;

import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BooleanPredefinedKey extends StyleStateKey<Boolean> implements PredefinedKey {
    public static final int $stable = 8;
    private final int mask;

    public BooleanPredefinedKey(int i, boolean z) {
        super(Boolean.valueOf(z));
        this.mask = i;
    }

    public /* synthetic */ BooleanPredefinedKey(int i, boolean z, int i2, sb0 sb0Var) {
        this(i, (i2 & 2) != 0 ? false : z);
    }

    public final int getMask() {
        return this.mask;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.foundation.style.StyleStateKey
    public Boolean getValueFrom$foundation(MutableStyleState mutableStyleState) {
        return Boolean.valueOf(mutableStyleState.getPredefinedState$foundation().getFlag(this.mask));
    }

    @Override // androidx.compose.foundation.style.StyleStateKey
    public /* bridge */ /* synthetic */ void setValueTo$foundation(Boolean bool, MutableStyleState mutableStyleState) {
        setValueTo$foundation(bool.booleanValue(), mutableStyleState);
    }

    public void setValueTo$foundation(boolean z, MutableStyleState mutableStyleState) {
        mutableStyleState.getPredefinedState$foundation().updateFlag(this.mask, z);
    }
}
