package androidx.activity.compose;

import defpackage.bb1;
import defpackage.os0;
import defpackage.vy2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class BackHandlerKt$BackHandler$1$1 extends bb1 implements os0 {
    final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 $backCallback;
    final /* synthetic */ boolean $enabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1, boolean z) {
        super(0);
        this.$backCallback = backHandlerKt$BackHandler$backCallback$1$1;
        this.$enabled = z;
    }

    @Override // defpackage.os0
    public /* bridge */ /* synthetic */ Object invoke() {
        m7invoke();
        return vy2.a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m7invoke() {
        setEnabled(this.$enabled);
    }
}
