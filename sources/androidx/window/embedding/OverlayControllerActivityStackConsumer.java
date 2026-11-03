package androidx.window.embedding;

import androidx.window.reflection.Consumer2;
import defpackage.ps0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class OverlayControllerActivityStackConsumer implements Consumer2<List<? extends androidx.window.extensions.embedding.ActivityStack>> {
    private final ps0 block;

    public OverlayControllerActivityStackConsumer(ps0 ps0Var) {
        ps0Var.getClass();
        this.block = ps0Var;
    }

    @Override // androidx.window.reflection.Consumer2
    public void accept(List<? extends androidx.window.extensions.embedding.ActivityStack> list) {
        list.getClass();
        this.block.invoke(list);
    }
}
