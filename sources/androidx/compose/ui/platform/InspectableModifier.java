package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import defpackage.bl1;
import defpackage.hd0;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.vg1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@hd0
/* loaded from: classes3.dex */
public final class InspectableModifier extends InspectorValueInfo implements Modifier.Element {
    public static final int $stable = 0;
    private final End end;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes3.dex */
    public final class End implements Modifier.Element {
        public End() {
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean all(ps0 ps0Var) {
            return vg1.a(this, ps0Var);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final /* synthetic */ boolean any(ps0 ps0Var) {
            return vg1.c(this, ps0Var);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final Object foldIn(Object obj, ts0 ts0Var) {
            return ts0Var.invoke(obj, this);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public final Object foldOut(Object obj, ts0 ts0Var) {
            return ts0Var.invoke(this, obj);
        }

        @Override // androidx.compose.ui.Modifier
        public final /* synthetic */ Modifier then(Modifier modifier) {
            return bl1.a(this, modifier);
        }
    }

    public InspectableModifier(ps0 ps0Var) {
        super(ps0Var);
        this.end = new End();
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(ps0 ps0Var) {
        return vg1.a(this, ps0Var);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(ps0 ps0Var) {
        return vg1.c(this, ps0Var);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final Object foldIn(Object obj, ts0 ts0Var) {
        return ts0Var.invoke(obj, this);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final Object foldOut(Object obj, ts0 ts0Var) {
        return ts0Var.invoke(this, obj);
    }

    public final End getEnd() {
        return this.end;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return bl1.a(this, modifier);
    }
}
