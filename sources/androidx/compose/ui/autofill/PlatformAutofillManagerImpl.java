package androidx.compose.ui.autofill;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillValue;
import defpackage.hu2;
import defpackage.m1;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class PlatformAutofillManagerImpl implements PlatformAutofillManager {
    public static final int $stable = 8;
    private android.view.autofill.AutofillManager _platformAndroidManager;
    private final Context context;

    public PlatformAutofillManagerImpl(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void cancel() {
        getPlatformAndroidManager().cancel();
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void commit() {
        getPlatformAndroidManager().commit();
    }

    public final Context getContext() {
        return this.context;
    }

    public final android.view.autofill.AutofillManager getPlatformAndroidManager() {
        android.view.autofill.AutofillManager autofillManager = this._platformAndroidManager;
        if (autofillManager != null) {
            return autofillManager;
        }
        android.view.autofill.AutofillManager e = m1.e(this.context.getSystemService(m1.k()));
        if (e != null) {
            this._platformAndroidManager = e;
            return e;
        }
        hu2.h("Could not locate AutofillManager from context");
        return null;
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyValueChanged(View view, int i, AutofillValue autofillValue) {
        getPlatformAndroidManager().notifyValueChanged(view, i, autofillValue);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewEntered(View view, int i, Rect rect) {
        getPlatformAndroidManager().notifyViewEntered(view, i, rect);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewExited(View view, int i) {
        getPlatformAndroidManager().notifyViewExited(view, i);
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void notifyViewVisibilityChanged(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            AutofillApi27Helper.INSTANCE.notifyViewVisibilityChanged(view, getPlatformAndroidManager(), i, z);
        }
    }

    @Override // androidx.compose.ui.autofill.PlatformAutofillManager
    public void requestAutofill(View view, int i, Rect rect) {
        getPlatformAndroidManager().requestAutofill(view, i, rect);
    }
}
