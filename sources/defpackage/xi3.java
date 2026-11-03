package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xi3 extends ub3 {
    public static int M;
    public static int N;
    public ConstraintLayout A;
    public TextView B;
    public TextView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public NestedScrollView G;
    public RecyclerView H;
    public yd3 I;
    public boolean J;
    public boolean K;
    public String L;

    public final void a() {
        if (this.J) {
            NestedScrollView nestedScrollView = this.G;
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(0);
            }
            RecyclerView recyclerView = this.H;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            this.J = false;
            return;
        }
        UUID uuid = bk3.a;
        int i = N;
        if (i == 0) {
            jh2.b0("localSwitchItemType");
            throw null;
        }
        int E = sg3.E(i);
        int i2 = 6;
        if (E != 5) {
            if (E != 6) {
                i2 = 7;
                if (E != 7) {
                    i2 = 3;
                }
            } else {
                i2 = 1;
            }
        }
        bk3.b.h("collapseElement", kx.c(i2) + "-id:" + M);
        dismiss();
    }

    @Override // defpackage.ub3, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ViewModelStore viewModelStore = activity.getViewModelStore();
        viewModelStore.getClass();
        this.I = (yd3) new ViewModelProvider(viewModelStore, new jd3(2)).get(yd3.class);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        hi3 hi3Var = context == null ? null : new hi3(context, this);
        if (hi3Var != null) {
            return hi3Var;
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.getClass();
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.dialog_legal_detail, viewGroup, false);
    }

    @Override // defpackage.ub3, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        view.getClass();
        super.onViewCreated(view, bundle);
        TextView textView = this.b;
        if (textView != null) {
            int i = N;
            if (i == 0) {
                jh2.b0("localSwitchItemType");
                throw null;
            }
            int E = sg3.E(i);
            if (E != 4) {
                yd3 yd3Var = this.I;
                if (E != 5) {
                    if (E != 6) {
                        if (yd3Var == null) {
                            jh2.b0("viewModel");
                            throw null;
                        }
                        str = yd3Var.f.e().d;
                    } else {
                        if (yd3Var == null) {
                            jh2.b0("viewModel");
                            throw null;
                        }
                        str = yd3Var.f.e().f;
                    }
                } else {
                    if (yd3Var == null) {
                        jh2.b0("viewModel");
                        throw null;
                    }
                    str = yd3Var.f.e().f;
                }
            } else {
                yd3 yd3Var2 = this.I;
                if (yd3Var2 == null) {
                    jh2.b0("viewModel");
                    throw null;
                }
                str = yd3Var2.f.e().d;
            }
            textView.setText(str);
        }
        ImageView imageView = this.m;
        final int i2 = 0;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: si3
                public final /* synthetic */ xi3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ge3 ge3Var;
                    Integer num;
                    ArrayList arrayList;
                    cg3 a;
                    cg3 a2;
                    cg3 a3;
                    int i3 = i2;
                    xi3 xi3Var = this.b;
                    switch (i3) {
                        case 0:
                            xi3Var.a();
                            return;
                        default:
                            NestedScrollView nestedScrollView = xi3Var.G;
                            if (nestedScrollView != null) {
                                nestedScrollView.setVisibility(8);
                            }
                            RecyclerView recyclerView = xi3Var.H;
                            if (recyclerView != null) {
                                yd3 yd3Var3 = xi3Var.I;
                                if (yd3Var3 == null) {
                                    jh2.b0("viewModel");
                                    throw null;
                                }
                                ph3 ph3Var = yd3Var3.d;
                                wj3 wj3Var = yd3Var3.a;
                                int i4 = xi3.M;
                                int i5 = xi3.N;
                                if (i5 == 0) {
                                    jh2.b0("localSwitchItemType");
                                    throw null;
                                }
                                boolean z = xi3Var.K;
                                String str2 = xi3Var.L;
                                if (str2 == null) {
                                    str2 = "";
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int E2 = sg3.E(i5);
                                if (E2 != 4) {
                                    if (E2 != 5) {
                                        if (E2 != 6) {
                                            if (E2 == 7 && (str2.equals("ALL_VENDORS") || str2.equals("IAB_VENDORS"))) {
                                                ge3 ge3Var2 = wj3Var.a;
                                                if (ge3Var2 != null) {
                                                    LinkedHashMap linkedHashMap = ge3Var2.h;
                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                        if (((ph3) entry.getValue()).k == null) {
                                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                        }
                                                    }
                                                    Iterator it = linkedHashMap2.entrySet().iterator();
                                                    while (it.hasNext()) {
                                                        ph3 ph3Var2 = (ph3) ((Map.Entry) it.next()).getValue();
                                                        Iterator it2 = ph3Var2.i.iterator();
                                                        while (it2.hasNext()) {
                                                            if (((Number) it2.next()).intValue() == i4) {
                                                                ph3 ph3Var3 = ph3Var2;
                                                                arrayList2.add(new cg3(ph3Var3, null, 4, 10, ph3Var2.b, null, 82));
                                                                ph3Var2 = ph3Var3;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (ph3Var != null && (a3 = yd3Var3.a(str2, ph3Var.i, i4)) != null) {
                                                    arrayList2.add(a3);
                                                }
                                            }
                                        } else if (str2.equals("ALL_VENDORS") || str2.equals("IAB_VENDORS")) {
                                            ge3 ge3Var3 = wj3Var.a;
                                            if (ge3Var3 != null) {
                                                LinkedHashMap linkedHashMap3 = ge3Var3.h;
                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                                    if (((ph3) entry2.getValue()).k == null) {
                                                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                                                    }
                                                }
                                                Iterator it3 = linkedHashMap4.entrySet().iterator();
                                                while (it3.hasNext()) {
                                                    ph3 ph3Var4 = (ph3) ((Map.Entry) it3.next()).getValue();
                                                    Iterator it4 = ph3Var4.h.iterator();
                                                    while (it4.hasNext()) {
                                                        if (((Number) it4.next()).intValue() == i4) {
                                                            ph3 ph3Var5 = ph3Var4;
                                                            arrayList2.add(new cg3(ph3Var5, null, 4, 10, ph3Var4.b, null, 82));
                                                            ph3Var4 = ph3Var5;
                                                        }
                                                    }
                                                }
                                            }
                                            if (ph3Var != null && (a2 = yd3Var3.a(str2, ph3Var.h, i4)) != null) {
                                                arrayList2.add(a2);
                                            }
                                        }
                                    } else if (str2.equals("ALL_VENDORS") || str2.equals("IAB_VENDORS")) {
                                        ge3 ge3Var4 = wj3Var.a;
                                        if (ge3Var4 != null) {
                                            LinkedHashMap linkedHashMap5 = ge3Var4.h;
                                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                            for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                                                if (((ph3) entry3.getValue()).k == null) {
                                                    linkedHashMap6.put(entry3.getKey(), entry3.getValue());
                                                }
                                            }
                                            Iterator it5 = linkedHashMap6.entrySet().iterator();
                                            while (it5.hasNext()) {
                                                ph3 ph3Var6 = (ph3) ((Map.Entry) it5.next()).getValue();
                                                Iterator it6 = ph3Var6.g.iterator();
                                                while (it6.hasNext()) {
                                                    if (((Number) it6.next()).intValue() == i4) {
                                                        ph3 ph3Var7 = ph3Var6;
                                                        arrayList2.add(new cg3(ph3Var7, null, 4, 10, ph3Var6.b, null, 82));
                                                        ph3Var6 = ph3Var7;
                                                    }
                                                }
                                            }
                                        }
                                        if (ph3Var != null && (a = yd3Var3.a(str2, ph3Var.g, i4)) != null) {
                                            arrayList2.add(a);
                                        }
                                    }
                                    num = null;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    if ((str2.equals("ALL_VENDORS") || str2.equals("IAB_VENDORS")) && (ge3Var = wj3Var.a) != null) {
                                        LinkedHashMap linkedHashMap7 = ge3Var.h;
                                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                        for (Map.Entry entry4 : linkedHashMap7.entrySet()) {
                                            if (((ph3) entry4.getValue()).k == null) {
                                                linkedHashMap8.put(entry4.getKey(), entry4.getValue());
                                            }
                                        }
                                        num = null;
                                        Iterator it7 = linkedHashMap8.entrySet().iterator();
                                        while (it7.hasNext()) {
                                            ph3 ph3Var8 = (ph3) ((Map.Entry) it7.next()).getValue();
                                            if (z) {
                                                Iterator it8 = ph3Var8.e.iterator();
                                                while (it8.hasNext()) {
                                                    if (((Number) it8.next()).intValue() == i4) {
                                                        arrayList3.add(new cg3(ph3Var8, null, 4, 10, ph3Var8.b, null, 82));
                                                    }
                                                }
                                            } else {
                                                Iterator it9 = ph3Var8.d.iterator();
                                                while (it9.hasNext()) {
                                                    if (((Number) it9.next()).intValue() == i4) {
                                                        ph3 ph3Var9 = ph3Var8;
                                                        arrayList3.add(new cg3(ph3Var9, null, 4, 10, ph3Var8.b, null, 82));
                                                        ph3Var8 = ph3Var9;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        num = null;
                                    }
                                    if (str2.equals("ALL_VENDORS") || str2.equals("NON_IAB_VENDORS")) {
                                        for (xh3 xh3Var : yd3Var3.b.n.t.a) {
                                            if (z) {
                                                ArrayList arrayList4 = xh3Var.g;
                                                int size = arrayList4.size();
                                                int i6 = 0;
                                                while (i6 < size) {
                                                    Object obj = arrayList4.get(i6);
                                                    i6++;
                                                    if (((Number) obj).intValue() == i4) {
                                                        arrayList3.add(new cg3(xh3Var.a(), null, 4, 10, xh3Var.c, null, 82));
                                                    }
                                                }
                                            } else {
                                                ArrayList arrayList5 = xh3Var.f;
                                                int size2 = arrayList5.size();
                                                int i7 = 0;
                                                while (i7 < size2) {
                                                    Object obj2 = arrayList5.get(i7);
                                                    i7++;
                                                    if (((Number) obj2).intValue() == i4) {
                                                        arrayList3.add(new cg3(xh3Var.a(), null, 4, 10, xh3Var.c, null, 82));
                                                    }
                                                }
                                            }
                                        }
                                        if (str2.equals("ALL_VENDORS") && ph3Var != null) {
                                            if (z) {
                                                Iterator it10 = ph3Var.e.iterator();
                                                while (it10.hasNext()) {
                                                    if (((Number) it10.next()).intValue() == i4) {
                                                        ArrayList arrayList6 = arrayList3;
                                                        arrayList6.add(new cg3(ph3Var, null, 4, 10, ph3Var.b, null, 82));
                                                        arrayList3 = arrayList6;
                                                    }
                                                }
                                            } else {
                                                arrayList = arrayList3;
                                                Iterator it11 = ph3Var.d.iterator();
                                                while (it11.hasNext()) {
                                                    if (((Number) it11.next()).intValue() == i4) {
                                                        arrayList.add(new cg3(ph3Var, null, 4, 10, ph3Var.b, null, 82));
                                                    }
                                                }
                                                arrayList2.addAll(arrayList);
                                            }
                                        }
                                    }
                                    arrayList = arrayList3;
                                    arrayList2.addAll(arrayList);
                                }
                                r82 r82Var = new r82(17);
                                le3 le3Var = xi3Var.t;
                                recyclerView.setAdapter(new nf3(arrayList2, r82Var, (String) null, le3Var == null ? num : le3Var.i, (Integer) null, (Integer) null, le3Var == null ? num : le3Var.a, xi3Var.u, xi3Var.w, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR));
                                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                                recyclerView.setVisibility(0);
                            }
                            xi3Var.J = true;
                            return;
                    }
                }
            });
            yd3 yd3Var3 = this.I;
            if (yd3Var3 == null) {
                jh2.b0("viewModel");
                throw null;
            }
            imageView.setContentDescription(yd3Var3.f.e().o);
        }
        this.A = (ConstraintLayout) view.findViewById(R.id.legal_detail_container);
        this.B = (TextView) view.findViewById(R.id.detail_legal_description_label);
        this.C = (TextView) view.findViewById(R.id.detail_legal_description);
        this.D = (TextView) view.findViewById(R.id.detail_description);
        this.E = (TextView) view.findViewById(R.id.detail_title);
        this.F = (TextView) view.findViewById(R.id.tv_show_partners);
        this.G = (NestedScrollView) view.findViewById(R.id.sc_description_container);
        this.H = (RecyclerView) view.findViewById(R.id.rv_purpose_partners_list);
        yd3 yd3Var4 = this.I;
        if (yd3Var4 == null) {
            jh2.b0("viewModel");
            throw null;
        }
        String str2 = yd3Var4.f.e().p;
        if (str2.length() > 0) {
            SpannableString spannableString = new SpannableString(str2);
            spannableString.setSpan(new UnderlineSpan(), 0, str2.length(), 0);
            TextView textView2 = this.F;
            if (textView2 != null) {
                textView2.setText(spannableString);
            }
        }
        TextView textView3 = this.F;
        final int i3 = 1;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: si3
                public final /* synthetic */ xi3 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ge3 ge3Var;
                    Integer num;
                    ArrayList arrayList;
                    cg3 a;
                    cg3 a2;
                    cg3 a3;
                    int i32 = i3;
                    xi3 xi3Var = this.b;
                    switch (i32) {
                        case 0:
                            xi3Var.a();
                            return;
                        default:
                            NestedScrollView nestedScrollView = xi3Var.G;
                            if (nestedScrollView != null) {
                                nestedScrollView.setVisibility(8);
                            }
                            RecyclerView recyclerView = xi3Var.H;
                            if (recyclerView != null) {
                                yd3 yd3Var32 = xi3Var.I;
                                if (yd3Var32 == null) {
                                    jh2.b0("viewModel");
                                    throw null;
                                }
                                ph3 ph3Var = yd3Var32.d;
                                wj3 wj3Var = yd3Var32.a;
                                int i4 = xi3.M;
                                int i5 = xi3.N;
                                if (i5 == 0) {
                                    jh2.b0("localSwitchItemType");
                                    throw null;
                                }
                                boolean z = xi3Var.K;
                                String str22 = xi3Var.L;
                                if (str22 == null) {
                                    str22 = "";
                                }
                                ArrayList arrayList2 = new ArrayList();
                                int E2 = sg3.E(i5);
                                if (E2 != 4) {
                                    if (E2 != 5) {
                                        if (E2 != 6) {
                                            if (E2 == 7 && (str22.equals("ALL_VENDORS") || str22.equals("IAB_VENDORS"))) {
                                                ge3 ge3Var2 = wj3Var.a;
                                                if (ge3Var2 != null) {
                                                    LinkedHashMap linkedHashMap = ge3Var2.h;
                                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                                        if (((ph3) entry.getValue()).k == null) {
                                                            linkedHashMap2.put(entry.getKey(), entry.getValue());
                                                        }
                                                    }
                                                    Iterator it = linkedHashMap2.entrySet().iterator();
                                                    while (it.hasNext()) {
                                                        ph3 ph3Var2 = (ph3) ((Map.Entry) it.next()).getValue();
                                                        Iterator it2 = ph3Var2.i.iterator();
                                                        while (it2.hasNext()) {
                                                            if (((Number) it2.next()).intValue() == i4) {
                                                                ph3 ph3Var3 = ph3Var2;
                                                                arrayList2.add(new cg3(ph3Var3, null, 4, 10, ph3Var2.b, null, 82));
                                                                ph3Var2 = ph3Var3;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (ph3Var != null && (a3 = yd3Var32.a(str22, ph3Var.i, i4)) != null) {
                                                    arrayList2.add(a3);
                                                }
                                            }
                                        } else if (str22.equals("ALL_VENDORS") || str22.equals("IAB_VENDORS")) {
                                            ge3 ge3Var3 = wj3Var.a;
                                            if (ge3Var3 != null) {
                                                LinkedHashMap linkedHashMap3 = ge3Var3.h;
                                                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                                                for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                                                    if (((ph3) entry2.getValue()).k == null) {
                                                        linkedHashMap4.put(entry2.getKey(), entry2.getValue());
                                                    }
                                                }
                                                Iterator it3 = linkedHashMap4.entrySet().iterator();
                                                while (it3.hasNext()) {
                                                    ph3 ph3Var4 = (ph3) ((Map.Entry) it3.next()).getValue();
                                                    Iterator it4 = ph3Var4.h.iterator();
                                                    while (it4.hasNext()) {
                                                        if (((Number) it4.next()).intValue() == i4) {
                                                            ph3 ph3Var5 = ph3Var4;
                                                            arrayList2.add(new cg3(ph3Var5, null, 4, 10, ph3Var4.b, null, 82));
                                                            ph3Var4 = ph3Var5;
                                                        }
                                                    }
                                                }
                                            }
                                            if (ph3Var != null && (a2 = yd3Var32.a(str22, ph3Var.h, i4)) != null) {
                                                arrayList2.add(a2);
                                            }
                                        }
                                    } else if (str22.equals("ALL_VENDORS") || str22.equals("IAB_VENDORS")) {
                                        ge3 ge3Var4 = wj3Var.a;
                                        if (ge3Var4 != null) {
                                            LinkedHashMap linkedHashMap5 = ge3Var4.h;
                                            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                                            for (Map.Entry entry3 : linkedHashMap5.entrySet()) {
                                                if (((ph3) entry3.getValue()).k == null) {
                                                    linkedHashMap6.put(entry3.getKey(), entry3.getValue());
                                                }
                                            }
                                            Iterator it5 = linkedHashMap6.entrySet().iterator();
                                            while (it5.hasNext()) {
                                                ph3 ph3Var6 = (ph3) ((Map.Entry) it5.next()).getValue();
                                                Iterator it6 = ph3Var6.g.iterator();
                                                while (it6.hasNext()) {
                                                    if (((Number) it6.next()).intValue() == i4) {
                                                        ph3 ph3Var7 = ph3Var6;
                                                        arrayList2.add(new cg3(ph3Var7, null, 4, 10, ph3Var6.b, null, 82));
                                                        ph3Var6 = ph3Var7;
                                                    }
                                                }
                                            }
                                        }
                                        if (ph3Var != null && (a = yd3Var32.a(str22, ph3Var.g, i4)) != null) {
                                            arrayList2.add(a);
                                        }
                                    }
                                    num = null;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    if ((str22.equals("ALL_VENDORS") || str22.equals("IAB_VENDORS")) && (ge3Var = wj3Var.a) != null) {
                                        LinkedHashMap linkedHashMap7 = ge3Var.h;
                                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                                        for (Map.Entry entry4 : linkedHashMap7.entrySet()) {
                                            if (((ph3) entry4.getValue()).k == null) {
                                                linkedHashMap8.put(entry4.getKey(), entry4.getValue());
                                            }
                                        }
                                        num = null;
                                        Iterator it7 = linkedHashMap8.entrySet().iterator();
                                        while (it7.hasNext()) {
                                            ph3 ph3Var8 = (ph3) ((Map.Entry) it7.next()).getValue();
                                            if (z) {
                                                Iterator it8 = ph3Var8.e.iterator();
                                                while (it8.hasNext()) {
                                                    if (((Number) it8.next()).intValue() == i4) {
                                                        arrayList3.add(new cg3(ph3Var8, null, 4, 10, ph3Var8.b, null, 82));
                                                    }
                                                }
                                            } else {
                                                Iterator it9 = ph3Var8.d.iterator();
                                                while (it9.hasNext()) {
                                                    if (((Number) it9.next()).intValue() == i4) {
                                                        ph3 ph3Var9 = ph3Var8;
                                                        arrayList3.add(new cg3(ph3Var9, null, 4, 10, ph3Var8.b, null, 82));
                                                        ph3Var8 = ph3Var9;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        num = null;
                                    }
                                    if (str22.equals("ALL_VENDORS") || str22.equals("NON_IAB_VENDORS")) {
                                        for (xh3 xh3Var : yd3Var32.b.n.t.a) {
                                            if (z) {
                                                ArrayList arrayList4 = xh3Var.g;
                                                int size = arrayList4.size();
                                                int i6 = 0;
                                                while (i6 < size) {
                                                    Object obj = arrayList4.get(i6);
                                                    i6++;
                                                    if (((Number) obj).intValue() == i4) {
                                                        arrayList3.add(new cg3(xh3Var.a(), null, 4, 10, xh3Var.c, null, 82));
                                                    }
                                                }
                                            } else {
                                                ArrayList arrayList5 = xh3Var.f;
                                                int size2 = arrayList5.size();
                                                int i7 = 0;
                                                while (i7 < size2) {
                                                    Object obj2 = arrayList5.get(i7);
                                                    i7++;
                                                    if (((Number) obj2).intValue() == i4) {
                                                        arrayList3.add(new cg3(xh3Var.a(), null, 4, 10, xh3Var.c, null, 82));
                                                    }
                                                }
                                            }
                                        }
                                        if (str22.equals("ALL_VENDORS") && ph3Var != null) {
                                            if (z) {
                                                Iterator it10 = ph3Var.e.iterator();
                                                while (it10.hasNext()) {
                                                    if (((Number) it10.next()).intValue() == i4) {
                                                        ArrayList arrayList6 = arrayList3;
                                                        arrayList6.add(new cg3(ph3Var, null, 4, 10, ph3Var.b, null, 82));
                                                        arrayList3 = arrayList6;
                                                    }
                                                }
                                            } else {
                                                arrayList = arrayList3;
                                                Iterator it11 = ph3Var.d.iterator();
                                                while (it11.hasNext()) {
                                                    if (((Number) it11.next()).intValue() == i4) {
                                                        arrayList.add(new cg3(ph3Var, null, 4, 10, ph3Var.b, null, 82));
                                                    }
                                                }
                                                arrayList2.addAll(arrayList);
                                            }
                                        }
                                    }
                                    arrayList = arrayList3;
                                    arrayList2.addAll(arrayList);
                                }
                                r82 r82Var = new r82(17);
                                le3 le3Var = xi3Var.t;
                                recyclerView.setAdapter(new nf3(arrayList2, r82Var, (String) null, le3Var == null ? num : le3Var.i, (Integer) null, (Integer) null, le3Var == null ? num : le3Var.a, xi3Var.u, xi3Var.w, AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR));
                                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                                recyclerView.setVisibility(0);
                            }
                            xi3Var.J = true;
                            return;
                    }
                }
            });
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            TextView textView4 = this.E;
            if (textView4 != null) {
                textView4.setText(arguments.getString("title", ""));
            }
            TextView textView5 = this.D;
            if (textView5 != null) {
                textView5.setText(arguments.getString("description", ""));
            }
            TextView textView6 = this.C;
            if (textView6 != null) {
                textView6.setText(arguments.getString("legal_description", ""));
            }
            TextView textView7 = this.B;
            if (textView7 != null) {
                textView7.setText(arguments.getString("legal_description_label", ""));
            }
            this.K = arguments.getBoolean("legitimate_interest", false);
            this.L = arguments.getString("vendor_type_selected", "");
        }
        le3 le3Var = this.t;
        if (le3Var != null) {
            Integer num = le3Var.i;
            if (num != null) {
                int intValue = num.intValue();
                TextView textView8 = this.E;
                if (textView8 != null) {
                    textView8.setTextColor(intValue);
                }
                TextView textView9 = this.D;
                if (textView9 != null) {
                    textView9.setTextColor(intValue);
                }
                TextView textView10 = this.C;
                if (textView10 != null) {
                    textView10.setTextColor(intValue);
                }
                TextView textView11 = this.B;
                if (textView11 != null) {
                    textView11.setTextColor(intValue);
                }
            }
            Integer num2 = le3Var.l;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                TextView textView12 = this.F;
                if (textView12 != null) {
                    textView12.setTextColor(intValue2);
                }
            }
            Integer num3 = le3Var.g;
            if (num3 != null) {
                int intValue3 = num3.intValue();
                ConstraintLayout constraintLayout = this.A;
                if (constraintLayout != null) {
                    constraintLayout.setBackgroundColor(intValue3);
                }
            }
        }
        ux2.d(this.u, this.E);
        ux2.d(this.w, this.F, this.D, this.C, this.B);
    }
}
