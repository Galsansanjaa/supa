package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class on implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextLinkScope b;

    public /* synthetic */ on(TextLinkScope textLinkScope, int i) {
        this.a = i;
        this.b = textLinkScope;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        boolean e;
        int i = this.a;
        TextLinkScope textLinkScope = this.b;
        switch (i) {
            case 0:
                e = BasicTextKt.e(textLinkScope);
                break;
            case 1:
                e = BasicTextKt.k(textLinkScope);
                break;
            default:
                e = TextLinkScope.l(textLinkScope);
                break;
        }
        return Boolean.valueOf(e);
    }
}
