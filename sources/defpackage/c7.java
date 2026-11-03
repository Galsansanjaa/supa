package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.viewinterop.AndroidViewHolder;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AndroidViewHolder b;

    public /* synthetic */ c7(AndroidViewHolder androidViewHolder, int i) {
        this.a = i;
        this.b = androidViewHolder;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 layoutNode$lambda$0$3;
        vy2 layoutNode$lambda$0$7;
        int i = this.a;
        AndroidViewHolder androidViewHolder = this.b;
        switch (i) {
            case 0:
                layoutNode$lambda$0$3 = AndroidViewHolder.layoutNode$lambda$0$3(androidViewHolder, (ps0) obj);
                return layoutNode$lambda$0$3;
            case 1:
                layoutNode$lambda$0$7 = AndroidViewHolder.layoutNode$lambda$0$7(androidViewHolder, (Owner) obj);
                return layoutNode$lambda$0$7;
            default:
                return Boolean.valueOf(PointerInteropFilter_androidKt.a(androidViewHolder, (MotionEvent) obj));
        }
    }
}
