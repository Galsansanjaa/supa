package defpackage;

import android.view.View;
import android.widget.TextView;
import com.uptodown.activities.PermissionsActivity;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class aw1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ aw1(TextView textView, int i) {
        this.a = i;
        this.b = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        TextView textView = this.b;
        switch (i) {
            case 0:
                int i2 = PermissionsActivity.V;
                textView.setMaxLines(textView.getMaxLines() != 3 ? 3 : Integer.MAX_VALUE);
                return;
            default:
                int i3 = PermissionsActivity.V;
                textView.setMaxLines(textView.getMaxLines() != 1 ? 1 : Integer.MAX_VALUE);
                return;
        }
    }
}
