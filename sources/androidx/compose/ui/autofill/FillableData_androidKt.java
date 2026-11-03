package androidx.compose.ui.autofill;

import android.os.Build;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.autofill.FillableData;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class FillableData_androidKt {
    public static final FillableData createFromAutofillValue(FillableData.Companion companion, AutofillValue autofillValue) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new AndroidFillableData(autofillValue);
        }
        return null;
    }

    public static final FillableData createFromBoolean(FillableData.Companion companion, boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new AndroidFillableData(AutofillValue.forToggle(z));
        }
        return null;
    }

    public static final FillableData createFromDateMillis(FillableData.Companion companion, long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new AndroidFillableData(AutofillValue.forDate(j));
        }
        return null;
    }

    public static final FillableData createFromListIndex(FillableData.Companion companion, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new AndroidFillableData(AutofillValue.forList(i));
        }
        return null;
    }

    public static final FillableData createFromText(FillableData.Companion companion, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new AndroidFillableData(AutofillValue.forText(AutofillUtils_androidKt.trimToSafeLength(charSequence)));
        }
        return null;
    }

    public static final AutofillValue toAutofillValue(FillableData fillableData) {
        if (Build.VERSION.SDK_INT >= 26) {
            AndroidFillableData androidFillableData = fillableData instanceof AndroidFillableData ? (AndroidFillableData) fillableData : null;
            if (androidFillableData != null) {
                return androidFillableData.getAutofillValue$ui();
            }
        }
        return null;
    }
}
