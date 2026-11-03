package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.LeadingMarginSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.uptodown.core.view.UptodownTextView;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class hq2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ UptodownTextView a;
    public final /* synthetic */ UptodownTextView b;
    public final /* synthetic */ String c;

    public hq2(UptodownTextView uptodownTextView, UptodownTextView uptodownTextView2, String str) {
        this.a = uptodownTextView;
        this.b = uptodownTextView2;
        this.c = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        Layout layout = this.a.getLayout();
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount() - 1;
        float lineWidth = layout.getLineWidth(lineCount);
        UptodownTextView uptodownTextView = this.b;
        float measureText = uptodownTextView.getPaint().measureText(" ") + lineWidth;
        ViewGroup.LayoutParams layoutParams = uptodownTextView.getLayoutParams();
        if (layoutParams == null) {
            hu2.q("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            return;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = layout.getLineTop(lineCount);
        uptodownTextView.setLayoutParams(layoutParams2);
        SpannableString spannableString = new SpannableString(this.c);
        spannableString.setSpan(new LeadingMarginSpan.Standard((int) measureText, 0), 0, spannableString.length(), 18);
        uptodownTextView.setText(spannableString);
    }
}
