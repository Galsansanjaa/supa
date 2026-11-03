package defpackage;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k61 implements Consumer {
    public final /* synthetic */ int a;

    public /* synthetic */ k61(int i) {
        this.a = i;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                IntentSanitizer.a(str);
                return;
            default:
                IntentSanitizer.b(str);
                return;
        }
    }
}
