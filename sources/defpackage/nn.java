package defpackage;

import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.TextLinkScope;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.TextLayoutResult;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class nn implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextLinkScope b;
    public final /* synthetic */ ps0 m;

    public /* synthetic */ nn(TextLinkScope textLinkScope, ps0 ps0Var, int i) {
        this.a = i;
        this.b = textLinkScope;
        this.m = ps0Var;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        vy2 LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0;
        DisposableEffectResult StyleAnnotation$lambda$0$0;
        int i = this.a;
        ps0 ps0Var = this.m;
        TextLinkScope textLinkScope = this.b;
        switch (i) {
            case 0:
                LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0 = BasicTextKt.LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0(textLinkScope, ps0Var, (TextLayoutResult) obj);
                return LayoutWithLinksAndInlineContent_11Od_4g$lambda$6$0;
            default:
                StyleAnnotation$lambda$0$0 = TextLinkScope.StyleAnnotation$lambda$0$0(textLinkScope, ps0Var, (DisposableEffectScope) obj);
                return StyleAnnotation$lambda$0$0;
        }
    }
}
