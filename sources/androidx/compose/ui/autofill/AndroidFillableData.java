package androidx.compose.ui.autofill;

import android.view.autofill.AutofillValue;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class AndroidFillableData implements FillableData {
    public static final int $stable = 8;
    private final AutofillValue autofillValue;

    public AndroidFillableData(AutofillValue autofillValue) {
        this.autofillValue = autofillValue;
    }

    public final AutofillValue getAutofillValue$ui() {
        return this.autofillValue;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Boolean getBooleanValue() {
        if (this.autofillValue.isToggle()) {
            return Boolean.valueOf(this.autofillValue.getToggleValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public final long getDateMillisOrDefault(long j) {
        Long dateMillisValue = getDateMillisValue();
        return dateMillisValue != null ? dateMillisValue.longValue() : j;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Long getDateMillisValue() {
        if (this.autofillValue.isDate()) {
            return Long.valueOf(this.autofillValue.getDateValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public int getListIndexOrDefault(int i) {
        return this.autofillValue.isList() ? this.autofillValue.getListValue() : i;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public Integer getListIndexValue() {
        if (this.autofillValue.isList()) {
            return Integer.valueOf(this.autofillValue.getListValue());
        }
        return null;
    }

    @Override // androidx.compose.ui.autofill.FillableData
    public CharSequence getTextValue() {
        if (this.autofillValue.isText()) {
            return this.autofillValue.getTextValue();
        }
        return null;
    }
}
