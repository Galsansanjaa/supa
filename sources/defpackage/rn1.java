package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rn1 extends RecyclerView.ViewHolder {
    public final y21 a;
    public final TextView b;
    public final ImageView m;

    public rn1(View view, String str, y21 y21Var) {
        super(view);
        this.a = y21Var;
        View findViewById = view.findViewById(R.id.tv_myappsupdates_title);
        findViewById.getClass();
        TextView textView = (TextView) findViewById;
        this.b = textView;
        this.m = (ImageView) view.findViewById(R.id.iv_myappsupdates_info);
        textView.setText(str);
    }
}
