package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ex2 extends Presenter.ViewHolder {
    public final RelativeLayout a;
    public final ImageView b;
    public final TextView m;
    public final TextView n;
    public final TextView o;
    public final ProgressBar p;
    public final TextView q;

    public ex2(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.rl_tv_old_version_item);
        findViewById.getClass();
        this.a = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.iv_icono_version);
        findViewById2.getClass();
        this.b = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_name_version);
        findViewById3.getClass();
        this.m = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.tv_size_version);
        findViewById4.getClass();
        this.n = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.tv_version);
        findViewById5.getClass();
        this.o = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.progressbar_downloading_version);
        findViewById6.getClass();
        this.p = (ProgressBar) findViewById6;
        View findViewById7 = view.findViewById(R.id.tv_action_old_version_item);
        findViewById7.getClass();
        this.q = (TextView) findViewById7;
    }
}
