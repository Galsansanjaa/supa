package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.unit.IntSize;
import defpackage.sb0;
import defpackage.ts0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SizeTransformImpl implements SizeTransform {
    private final boolean clip;
    private final ts0 sizeAnimationSpec;

    public SizeTransformImpl(boolean z, ts0 ts0Var) {
        this.clip = z;
        this.sizeAnimationSpec = ts0Var;
    }

    public /* synthetic */ SizeTransformImpl(boolean z, ts0 ts0Var, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? true : z, ts0Var);
    }

    @Override // androidx.compose.animation.SizeTransform
    /* renamed from: createAnimationSpec-TemP2vQ */
    public FiniteAnimationSpec<IntSize> mo194createAnimationSpecTemP2vQ(long j, long j2) {
        return (FiniteAnimationSpec) this.sizeAnimationSpec.invoke(IntSize.m8208boximpl(j), IntSize.m8208boximpl(j2));
    }

    @Override // androidx.compose.animation.SizeTransform
    public boolean getClip() {
        return this.clip;
    }

    public final ts0 getSizeAnimationSpec() {
        return this.sizeAnimationSpec;
    }

    public String toString() {
        return "SizeTransform(clip=" + getClip() + ")";
    }
}
