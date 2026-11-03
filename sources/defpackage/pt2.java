package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class pt2 extends RecyclerView.Adapter {
    public final dc a;
    public final s7 b;
    public final ArrayList c;

    public pt2(dc dcVar, s7 s7Var) {
        s7Var.getClass();
        this.a = dcVar;
        this.b = s7Var;
        this.c = new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        arrayList.getClass();
        ArrayList arrayList2 = this.c;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        ot2 ot2Var = (ot2) viewHolder;
        Object obj = this.c.get(i);
        obj.getClass();
        cc ccVar = (cc) obj;
        int i2 = i + 1;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ot2Var.itemView.getContext().getResources().getDimension(R.dimen.top_horizontal_card_width), -2);
        View view = ot2Var.itemView;
        Context context = view.getContext();
        context.getClass();
        pt2 pt2Var = ot2Var.q;
        yl.a(layoutParams, context, i2, pt2Var.c.size());
        view.setLayoutParams(layoutParams);
        View view2 = ot2Var.itemView;
        view2.getClass();
        yl.b(view2, ot2Var.b, ccVar);
        ot2Var.itemView.setOnLongClickListener(new kc(pt2Var, ccVar, i2, 11));
        TextView textView = ot2Var.n;
        TextView textView2 = ot2Var.o;
        yl.e(ccVar, textView, textView2);
        ot2Var.d(ot2Var.m, ccVar.h());
        ot2Var.c(ccVar.F, ot2Var.p, textView2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View p = yo0.p(viewGroup, R.layout.card, viewGroup, false);
        p.getClass();
        return new ot2(this, p, this.a);
    }
}
