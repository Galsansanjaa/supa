package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qi1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ Drawable m;

    public /* synthetic */ qi1(MaterialButton materialButton, Drawable drawable, int i) {
        this.a = i;
        this.b = materialButton;
        this.m = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Drawable drawable = this.m;
        MaterialButton materialButton = this.b;
        switch (i) {
            case 0:
                MaterialButton.d(materialButton, drawable);
                return;
            default:
                MaterialButton.b(materialButton, drawable);
                return;
        }
    }
}
