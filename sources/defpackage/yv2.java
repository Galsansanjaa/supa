package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.Presenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class yv2 extends RowsSupportFragment {
    public boolean a;
    public final ArrayObjectAdapter b;

    public yv2() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mx2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.leanback.widget.Presenter, bw2] */
    public final void a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            is2 is2Var = (is2) next;
            if (is2Var.a.a == i) {
                if (getContext() != null) {
                    HeaderItem headerItem = new HeaderItem(is2Var.a.b);
                    Context requireContext = requireContext();
                    requireContext.getClass();
                    ?? presenter = new Presenter();
                    presenter.a = requireContext;
                    ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter((Presenter) presenter);
                    arrayObjectAdapter.addAll(0, is2Var.b);
                    ?? obj = new Object();
                    obj.a = is2Var.a;
                    arrayObjectAdapter.add(obj);
                    this.b.add(new ListRow(headerItem, arrayObjectAdapter));
                } else {
                    this.a = false;
                }
                arrayList.remove(is2Var);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [mx2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [zv2, androidx.leanback.widget.Presenter] */
    public final void d(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            is2 is2Var = (is2) next;
            if (is2Var.a.a == i) {
                if (getContext() != null) {
                    HeaderItem headerItem = new HeaderItem(is2Var.a.b);
                    Context requireContext = requireContext();
                    requireContext.getClass();
                    ?? presenter = new Presenter();
                    presenter.a = requireContext;
                    ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter((Presenter) presenter);
                    arrayObjectAdapter.addAll(0, is2Var.b);
                    ?? obj = new Object();
                    obj.a = is2Var.a;
                    arrayObjectAdapter.add(obj);
                    this.b.add(new ListRow(headerItem, arrayObjectAdapter));
                } else {
                    this.a = false;
                }
                arrayList.remove(is2Var);
                return;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.a) {
            return;
        }
        this.b.clear();
        wv2 wv2Var = new wv2(this);
        if (getContext() != null) {
            Context requireContext = requireContext();
            requireContext.getClass();
            p50 p50Var = new p50(requireContext, wv2Var);
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            lifecycleScope.getClass();
            od4.s(lifecycleScope, null, null, new w8(p50Var, (a10) null, 7), 3);
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new zn1(this, 15));
    }
}
