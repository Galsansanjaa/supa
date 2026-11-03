package defpackage;

import android.text.Editable;
import android.text.style.BulletSpan;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class md3 {
    public final BulletSpan a = new BulletSpan(10);

    public void a(Editable editable) {
        if (editable.length() > 0 && editable.charAt(editable.length() - 1) != '\n') {
            editable.append("\n");
        }
        editable.setSpan(this, editable.length(), editable.length(), 17);
    }

    public abstract Object[] b(int i);
}
