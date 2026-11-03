package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import androidx.window.embedding.EmbeddingAdapter;
import defpackage.ts0;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ts0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ e(Set set, int i) {
        this.a = i;
        this.b = set;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        boolean translateActivityIntentPredicates$lambda$4;
        int i = this.a;
        Set set = this.b;
        Activity activity = (Activity) obj;
        switch (i) {
            case 0:
                translateActivityIntentPredicates$lambda$4 = EmbeddingAdapter.VendorApiLevel1Impl.translateActivityIntentPredicates$lambda$4(set, activity, (Intent) obj2);
                break;
            default:
                translateActivityIntentPredicates$lambda$4 = EmbeddingAdapter.VendorApiLevel1Impl.translateActivityPairPredicates$lambda$2(set, activity, (Activity) obj2);
                break;
        }
        return Boolean.valueOf(translateActivityIntentPredicates$lambda$4);
    }
}
