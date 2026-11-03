package com.google.android.material.search;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SearchViewAnimationHelper b;

    public /* synthetic */ e(SearchViewAnimationHelper searchViewAnimationHelper, int i) {
        this.a = i;
        this.b = searchViewAnimationHelper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SearchViewAnimationHelper searchViewAnimationHelper = this.b;
        switch (i) {
            case 0:
                searchViewAnimationHelper.hide();
                return;
            case 1:
                SearchViewAnimationHelper.c(searchViewAnimationHelper);
                return;
            default:
                SearchViewAnimationHelper.a(searchViewAnimationHelper);
                return;
        }
    }
}
