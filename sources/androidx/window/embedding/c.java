package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import androidx.window.embedding.EmbeddingAdapter;
import defpackage.ps0;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Set b;

    public /* synthetic */ c(Set set, int i) {
        this.a = i;
        this.b = set;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        boolean a;
        int i = this.a;
        Set set = this.b;
        switch (i) {
            case 0:
                a = EmbeddingAdapter.VendorApiLevel1Impl.a(set, (Intent) obj);
                break;
            default:
                a = EmbeddingAdapter.VendorApiLevel1Impl.c(set, (Activity) obj);
                break;
        }
        return Boolean.valueOf(a);
    }
}
