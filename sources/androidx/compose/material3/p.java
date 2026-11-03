package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String m;

    public /* synthetic */ p(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.m = str2;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DateInputKt$DateInputContent$2.a(this.b, this.m, (SemanticsPropertyReceiver) obj);
            case 1:
                return DateRangeInputKt$DateRangeInputContent$2$2.a(this.b, this.m, (SemanticsPropertyReceiver) obj);
            default:
                return DateRangeInputKt$DateRangeInputContent$2$5.a(this.b, this.m, (SemanticsPropertyReceiver) obj);
        }
    }
}
