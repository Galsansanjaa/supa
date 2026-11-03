package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ow2 extends Presenter.ViewHolder {
    public final ImageView a;
    public final TextView b;

    public ow2(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.iv_icon);
        findViewById.getClass();
        this.a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_name);
        findViewById2.getClass();
        this.b = (TextView) findViewById2;
    }
}
