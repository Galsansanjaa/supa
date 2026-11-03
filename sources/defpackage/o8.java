package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class o8 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ TextView b;

    public /* synthetic */ o8(TextView textView, int i) {
        this.a = i;
        this.b = textView;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        TextView textView = this.b;
        switch (i) {
            case 0:
                AppCompatButton.a((AppCompatButton) textView, (Typeface) obj);
                return;
            case 1:
                AppCompatEditText.a((AppCompatEditText) textView, (Typeface) obj);
                return;
            default:
                AppCompatTextView.a((AppCompatTextView) textView, (Typeface) obj);
                return;
        }
    }
}
