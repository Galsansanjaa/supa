package androidx.compose.ui.text.font;

import androidx.compose.foundation.style.StylePropertiesKt;
import defpackage.a10;
import defpackage.c10;
import defpackage.lb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
@lb0(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, StylePropertiesKt.ContentBrushId}, m = "awaitLoad", v = 1)
/* loaded from: classes3.dex */
public final class AndroidFontLoader$awaitLoad$1 extends c10 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidFontLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(AndroidFontLoader androidFontLoader, a10 a10Var) {
        super(a10Var);
        this.this$0 = androidFontLoader;
    }

    @Override // defpackage.cm
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.awaitLoad(null, this);
    }
}
