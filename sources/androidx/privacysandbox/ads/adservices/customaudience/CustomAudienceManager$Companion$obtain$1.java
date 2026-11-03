package androidx.privacysandbox.ads.adservices.customaudience;

import android.content.Context;
import defpackage.bb1;
import defpackage.ps0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class CustomAudienceManager$Companion$obtain$1 extends bb1 implements ps0 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomAudienceManager$Companion$obtain$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // defpackage.ps0
    public final CustomAudienceManagerApi31Ext9Impl invoke(Context context) {
        context.getClass();
        return new CustomAudienceManagerApi31Ext9Impl(this.$context);
    }
}
