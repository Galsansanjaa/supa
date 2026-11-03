package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bx2 extends Presenter.ViewHolder {
    public final TextView a;
    public final TextView b;
    public final TextView m;
    public final ProgressBar n;

    public bx2(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.tv_nombre_app);
        findViewById.getClass();
        this.a = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_size_download);
        findViewById2.getClass();
        this.b = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.tv_date_download);
        findViewById3.getClass();
        this.m = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.progressbar_downloading);
        findViewById4.getClass();
        this.n = (ProgressBar) findViewById4;
    }
}
