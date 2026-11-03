package defpackage;

import com.google.android.material.search.SearchView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class od2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchView b;

    public /* synthetic */ od2(SearchView searchView, int i) {
        this.a = i;
        this.b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SearchView searchView = this.b;
        switch (i) {
            case 0:
                searchView.lambda$clearFocusAndHideKeyboard$11();
                return;
            case 1:
                searchView.lambda$requestFocusAndShowKeyboard$10();
                return;
            case 2:
                searchView.show();
                return;
            case 3:
                searchView.lambda$requestFocusAndShowKeyboardIfNeeded$9();
                return;
            default:
                searchView.requestFocusAndShowKeyboardIfNeeded();
                return;
        }
    }
}
