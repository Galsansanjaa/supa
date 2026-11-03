package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import defpackage.bl1;
import defpackage.jh2;
import defpackage.ps0;
import defpackage.ts0;
import defpackage.v4;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;
    private final Modifier inner;
    private final Modifier outer;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    public static /* synthetic */ StringBuilder a(StringBuilder sb, Modifier.Element element) {
        return toString$lambda$0(sb, element);
    }

    public static final StringBuilder toString$lambda$0(StringBuilder sb, Modifier.Element element) {
        if (sb.length() > 1) {
            sb.append(", ");
        }
        sb.append(element);
        return sb;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(ps0 ps0Var) {
        return this.outer.all(ps0Var) && this.inner.all(ps0Var);
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(ps0 ps0Var) {
        return this.outer.any(ps0Var) || this.inner.any(ps0Var);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CombinedModifier)) {
            return false;
        }
        CombinedModifier combinedModifier = (CombinedModifier) obj;
        return jh2.k(this.outer, combinedModifier.outer) && jh2.k(this.inner, combinedModifier.inner);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R r, ts0 ts0Var) {
        return (R) this.inner.foldIn(this.outer.foldIn(r, ts0Var), ts0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldOut(R r, ts0 ts0Var) {
        return (R) this.outer.foldOut(this.inner.foldOut(r, ts0Var), ts0Var);
    }

    public final Modifier getInner$ui() {
        return this.inner;
    }

    public final Modifier getOuter$ui() {
        return this.outer;
    }

    public int hashCode() {
        return (this.inner.hashCode() * 31) + this.outer.hashCode();
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return bl1.a(this, modifier);
    }

    public String toString() {
        StringBuilder sb = (StringBuilder) foldIn(new StringBuilder("["), new v4(24));
        sb.append("]");
        return sb.toString();
    }
}
