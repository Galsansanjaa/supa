package defpackage;

import android.view.View;
import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class nd2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ nd2(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.lambda$setUpBackButton$2(view);
                return;
            case 1:
                searchView.lambda$setUpClearButton$3(view);
                return;
            default:
                searchView.lambda$setupWithSearchBar$8(view);
                return;
        }
    }
}
