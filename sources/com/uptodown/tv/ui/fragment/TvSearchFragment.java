package com.uptodown.tv.ui.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.leanback.R;
import androidx.leanback.app.SearchSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.ObjectAdapter;
import androidx.leanback.widget.SearchBar;
import androidx.lifecycle.LifecycleOwnerKt;
import defpackage.a10;
import defpackage.kx2;
import defpackage.lx2;
import defpackage.od4;
import defpackage.rl2;
import defpackage.zn1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class TvSearchFragment extends SearchSupportFragment implements SearchSupportFragment.SearchResultProvider {
    public static final /* synthetic */ int n = 0;
    public final ArrayObjectAdapter a = new ArrayObjectAdapter(new ListRowPresenter());
    public String b;
    public rl2 m;

    public final void a(String str) {
        this.a.clear();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        rl2 rl2Var = this.m;
        a10 a10Var = null;
        if (rl2Var != null) {
            rl2Var.cancel(null);
        }
        this.m = od4.s(LifecycleOwnerKt.getLifecycleScope(this), null, null, new kx2(this, str, a10Var, 0), 3);
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public final ObjectAdapter getResultsAdapter() {
        return this.a;
    }

    @Override // androidx.leanback.app.SearchSupportFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSearchResultProvider(this);
        setOnItemViewClickedListener(new zn1(this, 17));
    }

    @Override // androidx.leanback.app.SearchSupportFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        rl2 rl2Var = this.m;
        if (rl2Var != null) {
            rl2Var.cancel(null);
        }
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public final boolean onQueryTextChange(String str) {
        if (str == null || str.length() <= 2 || str.equalsIgnoreCase(this.b)) {
            return true;
        }
        this.b = str;
        a(str);
        return true;
    }

    @Override // androidx.leanback.app.SearchSupportFragment.SearchResultProvider
    public final boolean onQueryTextSubmit(String str) {
        if (str == null || str.length() <= 2 || str.equalsIgnoreCase(this.b)) {
            return true;
        }
        this.b = str;
        a(str);
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        SearchBar searchBar = (SearchBar) view.findViewById(R.id.lb_search_bar);
        if (searchBar != null) {
            searchBar.setSearchBarListener(new lx2(this));
        }
    }
}
