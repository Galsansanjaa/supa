package androidx.compose.foundation.text;

import androidx.compose.runtime.State;
import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return HeightInLinesNode.a((HeightInLinesNode) obj);
            case 1:
                return HeightInLinesNode.c((HeightInLinesNode) obj);
            default:
                return Boolean.valueOf(CoreTextFieldKt$CoreTextField$5$1.d((State) obj));
        }
    }
}
