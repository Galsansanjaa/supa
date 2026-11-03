package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.app.AppCompatViewInflater;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public class LeanbackAppCompatViewInflater extends AppCompatViewInflater {
    @Override // androidx.appcompat.app.AppCompatViewInflater
    public View createView(Context context, String str, AttributeSet attributeSet) {
        str.getClass();
        if (str.equals("androidx.leanback.widget.GuidedActionEditText")) {
            return new GuidedActionAppCompatEditText(context, attributeSet);
        }
        return null;
    }
}
