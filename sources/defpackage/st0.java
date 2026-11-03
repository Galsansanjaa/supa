package defpackage;

import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.tooling.ComposeStackTrace;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class st0 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ GapComposer b;

    public /* synthetic */ st0(GapComposer gapComposer, int i) {
        this.a = i;
        this.b = gapComposer;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        ComposeStackTrace currentStackTrace;
        ComposeStackTrace currentStackTrace2;
        int i = this.a;
        GapComposer gapComposer = this.b;
        switch (i) {
            case 0:
                currentStackTrace = gapComposer.currentStackTrace();
                return currentStackTrace;
            default:
                currentStackTrace2 = gapComposer.currentStackTrace();
                return currentStackTrace2;
        }
    }
}
