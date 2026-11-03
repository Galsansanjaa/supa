package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface PlatformAutofillManager {
    void cancel();

    void commit();

    void notifyValueChanged(View view, int i, AutofillValue autofillValue);

    void notifyViewEntered(View view, int i, Rect rect);

    void notifyViewExited(View view, int i);

    void notifyViewVisibilityChanged(View view, int i, boolean z);

    void requestAutofill(View view, int i, Rect rect);
}
