package androidx.compose.foundation.interaction;

import defpackage.a10;
import defpackage.e50;
import defpackage.lm1;
import defpackage.od4;
import defpackage.vq;
import defpackage.vy2;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class MutableInteractionSourceImpl implements MutableInteractionSource {
    private final lm1 interactions = od4.b(0, 16, vq.b, 1);

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public Object emit(Interaction interaction, a10 a10Var) {
        Object emit = getInteractions().emit(interaction, a10Var);
        return emit == e50.a ? emit : vy2.a;
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public lm1 getInteractions() {
        return this.interactions;
    }

    @Override // androidx.compose.foundation.interaction.MutableInteractionSource
    public boolean tryEmit(Interaction interaction) {
        return getInteractions().a(interaction);
    }
}
