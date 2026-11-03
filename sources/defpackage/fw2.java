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
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fw2 extends RowsSupportFragment {
    public cc a;
    public ArrayList b = new ArrayList();
    public final ArrayList m = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayObjectAdapter o;
    public int p;

    public fw2() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.o = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [mx2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.leanback.widget.Presenter, bw2] */
    public final void a(ArrayList arrayList, int i) {
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            int i3 = i2 + 1;
            is2 is2Var = (is2) it.next();
            if (is2Var.a.a != i) {
                i2 = i3;
            } else if (getContext() != null) {
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
                this.o.add(new ListRow(headerItem, arrayObjectAdapter));
            }
        }
        if (i2 >= 0) {
            arrayList.remove(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [zv2, androidx.leanback.widget.Presenter] */
    /* JADX WARN: Type inference failed for: r2v2, types: [mx2, java.lang.Object] */
    public final void d(is2 is2Var) {
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
            this.o.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [tv2, androidx.leanback.widget.Presenter] */
    /* JADX WARN: Type inference failed for: r5v2, types: [mx2, java.lang.Object] */
    public final void e() {
        int i = this.p;
        if (i < 3) {
            this.p = i + 1;
            return;
        }
        ArrayList arrayList = this.n;
        if (!arrayList.isEmpty()) {
            Object obj = arrayList.get(0);
            obj.getClass();
            d((is2) obj);
        }
        ArrayList arrayList2 = this.m;
        if (!arrayList2.isEmpty()) {
            a(arrayList2, -2);
        }
        if (!arrayList.isEmpty() && arrayList.size() > 1) {
            Object obj2 = arrayList.get(1);
            obj2.getClass();
            d((is2) obj2);
        }
        if (!arrayList2.isEmpty()) {
            a(arrayList2, -1);
        }
        if (!arrayList.isEmpty() && arrayList.size() > 2) {
            Object obj3 = arrayList.get(2);
            obj3.getClass();
            d((is2) obj3);
        }
        if (!arrayList2.isEmpty()) {
            a(arrayList2, 521);
        }
        if (!arrayList2.isEmpty()) {
            a(arrayList2, 523);
        }
        if (!arrayList2.isEmpty()) {
            a(arrayList2, 524);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it = arrayList2.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            is2 is2Var = (is2) next;
            if (getContext() != null) {
                HeaderItem headerItem = new HeaderItem(is2Var.a.b);
                Context requireContext = requireContext();
                requireContext.getClass();
                ?? presenter = new Presenter();
                presenter.a = requireContext;
                ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter((Presenter) presenter);
                arrayObjectAdapter.addAll(0, is2Var.b);
                ?? obj4 = new Object();
                obj4.a = is2Var.a;
                arrayObjectAdapter.add(obj4);
                this.o.add(new ListRow(headerItem, arrayObjectAdapter));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.a != null && !this.b.isEmpty()) {
            getMainFragmentAdapter().getFragmentHost().notifyDataReady(getMainFragmentAdapter());
            return;
        }
        dw2 dw2Var = new dw2(this);
        if (getContext() != null) {
            Context requireContext = requireContext();
            requireContext.getClass();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            new m30(requireContext, dw2Var, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new zn1(this, 16));
    }
}
