package androidx.compose.material3;

import defpackage.i61;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public interface DatePickerState {
    /* renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    int mo2514getDisplayModejFl4v0();

    long getDisplayedMonthMillis();

    Locale getLocale();

    SelectableDates getSelectableDates();

    Long getSelectedDateMillis();

    i61 getYearRange();

    /* renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    void mo2515setDisplayModevCnGnXg(int i);

    void setDisplayedMonthMillis(long j);

    void setSelectedDateMillis(Long l);
}
