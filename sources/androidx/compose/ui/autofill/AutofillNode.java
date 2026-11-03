package androidx.compose.ui.autofill;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import defpackage.hd0;
import defpackage.jh2;
import defpackage.oi0;
import defpackage.ps0;
import defpackage.sb0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@hd0
/* loaded from: classes.dex */
public final class AutofillNode {
    public static final int $stable = 8;
    private final List<AutofillType> autofillTypes;
    private Rect boundingBox;
    private final int id;
    private final ps0 onFill;

    /* JADX WARN: Multi-variable type inference failed */
    public AutofillNode(List<? extends AutofillType> list, Rect rect, ps0 ps0Var) {
        this.autofillTypes = list;
        this.boundingBox = rect;
        this.onFill = ps0Var;
        this.id = SemanticsModifierKt.generateSemanticsId();
    }

    public /* synthetic */ AutofillNode(List list, Rect rect, ps0 ps0Var, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? oi0.a : list, (i & 2) != 0 ? null : rect, ps0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutofillNode)) {
            return false;
        }
        AutofillNode autofillNode = (AutofillNode) obj;
        return jh2.k(this.autofillTypes, autofillNode.autofillTypes) && jh2.k(this.boundingBox, autofillNode.boundingBox) && this.onFill == autofillNode.onFill;
    }

    public final List<AutofillType> getAutofillTypes() {
        return this.autofillTypes;
    }

    public final Rect getBoundingBox() {
        return this.boundingBox;
    }

    public final int getId() {
        return this.id;
    }

    public final ps0 getOnFill() {
        return this.onFill;
    }

    public int hashCode() {
        int hashCode = this.autofillTypes.hashCode() * 31;
        Rect rect = this.boundingBox;
        int hashCode2 = (hashCode + (rect != null ? rect.hashCode() : 0)) * 31;
        ps0 ps0Var = this.onFill;
        return hashCode2 + (ps0Var != null ? ps0Var.hashCode() : 0);
    }

    public final void setBoundingBox(Rect rect) {
        this.boundingBox = rect;
    }
}
