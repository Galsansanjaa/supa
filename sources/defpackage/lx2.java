package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.leanback.widget.SearchBar;
import com.uptodown.tv.ui.fragment.TvSearchFragment;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class lx2 implements SearchBar.SearchBarListener {
    public final /* synthetic */ TvSearchFragment a;

    public lx2(TvSearchFragment tvSearchFragment) {
        this.a = tvSearchFragment;
    }

    @Override // androidx.leanback.widget.SearchBar.SearchBarListener
    public final void onKeyboardDismiss(String str) {
        str.getClass();
        new Handler(Looper.getMainLooper()).postDelayed(new u3(this.a), 2000L);
    }

    @Override // androidx.leanback.widget.SearchBar.SearchBarListener
    public final void onSearchQueryChange(String str) {
        if (str == null || str.length() <= 2) {
            return;
        }
        TvSearchFragment tvSearchFragment = this.a;
        if (str.equalsIgnoreCase(tvSearchFragment.b)) {
            return;
        }
        tvSearchFragment.b = str;
        tvSearchFragment.a(str);
    }

    @Override // androidx.leanback.widget.SearchBar.SearchBarListener
    public final void onSearchQuerySubmit(String str) {
        if (str == null || str.length() <= 2) {
            return;
        }
        TvSearchFragment tvSearchFragment = this.a;
        if (str.equalsIgnoreCase(tvSearchFragment.b)) {
            return;
        }
        tvSearchFragment.b = str;
        tvSearchFragment.a(str);
    }
}
