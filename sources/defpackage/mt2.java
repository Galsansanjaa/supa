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
public final class mt2 extends RecyclerView.Adapter {
    public final dc a;
    public final s7 b;
    public final ArrayList c;

    public mt2(dc dcVar, s7 s7Var) {
        s7Var.getClass();
        this.a = dcVar;
        this.b = s7Var;
        this.c = new ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        lt2 lt2Var = (lt2) viewHolder;
        Object obj = this.c.get(i);
        obj.getClass();
        cc ccVar = (cc) obj;
        int i2 = i + 1;
        TextView textView = lt2Var.p;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i2 == 1) {
            new RelativeLayout.LayoutParams(-2, -2).setMarginStart((int) lt2Var.itemView.getContext().getResources().getDimension(R.dimen.margin_m));
        }
        View view = lt2Var.itemView;
        Context context = view.getContext();
        context.getClass();
        yl.a(layoutParams, context, i2, 20);
        view.setLayoutParams(layoutParams);
        lt2Var.o.setText(String.valueOf(i2));
        View view2 = lt2Var.itemView;
        view2.getClass();
        yl.b(view2, lt2Var.b, ccVar);
        lt2Var.itemView.setOnLongClickListener(new kc(lt2Var.r, ccVar, i, 10));
        yl.e(ccVar, lt2Var.n, textView);
        lt2Var.d(lt2Var.m, ccVar.h());
        lt2Var.c(ccVar.F, lt2Var.q, textView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View p = yo0.p(viewGroup, R.layout.card_top_download, viewGroup, false);
        p.getClass();
        return new lt2(this, p, this.a);
    }
}
