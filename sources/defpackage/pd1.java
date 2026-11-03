package defpackage;

import androidx.compose.runtime.LinkComposer;
import androidx.compose.runtime.tooling.ComposeStackTrace;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class pd1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkComposer b;

    public /* synthetic */ pd1(LinkComposer linkComposer, int i) {
        this.a = i;
        this.b = linkComposer;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        ComposeStackTrace currentStackTrace;
        ComposeStackTrace currentStackTrace2;
        int i = this.a;
        LinkComposer linkComposer = this.b;
        switch (i) {
            case 0:
                currentStackTrace = linkComposer.currentStackTrace();
                return currentStackTrace;
            default:
                currentStackTrace2 = linkComposer.currentStackTrace();
                return currentStackTrace2;
        }
    }
}
