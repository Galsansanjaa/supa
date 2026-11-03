package defpackage;

import android.text.Editable;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class he3 extends md3 {
    public int b;

    @Override // defpackage.md3
    public final void a(Editable editable) {
        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
            editable.append("\n");
        }
        editable.setSpan(this, editable.length(), editable.length(), 17);
        int i = this.b;
        this.b = i + 1;
        editable.append((CharSequence) String.valueOf(i)).append(". ");
    }

    @Override // defpackage.md3
    public final Object[] b(int i) {
        int i2 = (i - 1) * 20;
        if (i > 2) {
            i2 -= (i - 2) * 20;
        }
        return new Object[]{new LeadingMarginSpan.Standard(i2)};
    }
}
