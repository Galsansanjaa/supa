package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mv2 extends Presenter.ViewHolder {
    public final TextView a;
    public final TextView b;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final ProgressBar q;
    public final LinearLayout r;
    public final RelativeLayout s;

    public mv2(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.tv_name);
        findViewById.getClass();
        this.a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_short_desc);
        findViewById2.getClass();
        this.b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_description);
        findViewById3.getClass();
        this.m = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tv_percent);
        findViewById4.getClass();
        this.n = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tv_version);
        findViewById5.getClass();
        this.o = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.tv_autor);
        findViewById6.getClass();
        this.p = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.pb_download);
        findViewById7.getClass();
        this.q = (ProgressBar) findViewById7;
        this.r = (LinearLayout) view.findViewById(R.id.ll_screenshots);
        View findViewById8 = view.findViewById(R.id.rl_contaier_valoration_tv_app_detail);
        findViewById8.getClass();
        this.s = (RelativeLayout) findViewById8;
    }

    public final void a(int i) {
        TextView textView = this.n;
        ProgressBar progressBar = this.q;
        if (i <= 0) {
            progressBar.setVisibility(8);
            textView.setVisibility(8);
        } else {
            progressBar.setVisibility(0);
            progressBar.setProgress(i);
            textView.setVisibility(0);
            textView.setText(String.format("%s%%", Arrays.copyOf(new Object[]{String.valueOf(i)}, 1)));
        }
    }
}
