package androidx.compose.ui.platform;

import defpackage.et0;
import defpackage.os0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class AndroidComposeView$legacyTextInputServiceAndroid$1$1 extends et0 implements os0 {
    public AndroidComposeView$legacyTextInputServiceAndroid$1$1(Object obj) {
        super(0, obj, Runnable.class, "run", "run()V", 0);
    }

    @Override // defpackage.os0
    public /* bridge */ /* synthetic */ Object invoke() {
        m7131invoke();
        return vy2.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7131invoke() {
        ((Runnable) this.receiver).run();
    }
}
