package defpackage;

import android.text.style.BulletSpan;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ve3 extends md3 {
    @Override // defpackage.md3
    public final Object[] b(int i) {
        int i2 = 10;
        if (i > 1) {
            i2 = 10 - this.a.getLeadingMargin(true);
            if (i > 2) {
                i2 -= (i - 2) * 20;
            }
        }
        return new Object[]{new LeadingMarginSpan.Standard((i - 1) * 20), new BulletSpan(i2)};
    }
}
