package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements ps0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        switch (this.a) {
            case 0:
                return AndroidLegacyPlatformTextInputServiceAdapter$startInput$2.AnonymousClass1.C00161.d(l.longValue());
            default:
                return AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1.d(l.longValue());
        }
    }
}
