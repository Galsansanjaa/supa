package defpackage;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.TrackpadScrollingLogic;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class tl1 implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt b;

    public /* synthetic */ tl1(vt vtVar, int i) {
        this.a = i;
        this.b = vtVar;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        vt vtVar = this.b;
        switch (i) {
            case 0:
                return MouseWheelScrollingLogic.b(vtVar);
            default:
                return TrackpadScrollingLogic.a(vtVar);
        }
    }
}
