package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import defpackage.i61;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class DateInputValidator {
    public static final int $stable = 0;
    private Long currentEndDateMillis;
    private Long currentStartDateMillis;
    private final DatePickerFormatter dateFormatter;
    private final DateInputFormat dateInputFormat;
    private final String errorDateOutOfYearRange;
    private final String errorDatePattern;
    private final String errorInvalidNotAllowed;
    private final String errorInvalidRangeInput;
    private final SelectableDates selectableDates;
    private final i61 yearRange;

    public DateInputValidator(i61 i61Var, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4) {
        this.yearRange = i61Var;
        this.selectableDates = selectableDates;
        this.dateInputFormat = dateInputFormat;
        this.dateFormatter = datePickerFormatter;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
    }

    public final Long getCurrentEndDateMillis() {
        return this.currentEndDateMillis;
    }

    public final Long getCurrentStartDateMillis() {
        return this.currentStartDateMillis;
    }

    public final void setCurrentEndDateMillis(Long l) {
        this.currentEndDateMillis = l;
    }

    public final void setCurrentStartDateMillis(Long l) {
        this.currentStartDateMillis = l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r0 <= (r2 != null ? r2.longValue() : Long.MAX_VALUE)) goto L23;
     */
    /* renamed from: validate-XivgLIo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m2473validateXivgLIo(androidx.compose.material3.internal.CalendarDate r10, int r11, java.util.Locale r12) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L1e
            java.lang.String r10 = r9.errorDatePattern
            androidx.compose.material3.internal.DateInputFormat r9 = r9.dateInputFormat
            java.lang.String r9 = r9.getPatternWithDelimiters()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toUpperCase(r11)
            r9.getClass()
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r1] = r9
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.formatString(r10, r11)
            return r9
        L1e:
            i61 r2 = r9.yearRange
            int r3 = r10.getYear()
            boolean r2 = r2.c(r3)
            if (r2 != 0) goto L4e
            java.lang.String r10 = r9.errorDateOutOfYearRange
            i61 r11 = r9.yearRange
            int r2 = r11.a
            r7 = 7
            r8 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r12
            java.lang.String r11 = androidx.compose.material3.CalendarLocale_jvmKt.toLocalString$default(r2, r3, r4, r5, r6, r7, r8)
            i61 r9 = r9.yearRange
            int r2 = r9.b
            java.lang.String r9 = androidx.compose.material3.CalendarLocale_jvmKt.toLocalString$default(r2, r3, r4, r5, r6, r7, r8)
            r12 = 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            r12[r1] = r11
            r12[r0] = r9
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.formatString(r10, r12)
            return r9
        L4e:
            r6 = r12
            androidx.compose.material3.SelectableDates r12 = r9.selectableDates
            int r2 = r10.getYear()
            boolean r2 = r12.isSelectableYear(r2)
            if (r2 == 0) goto Lab
            long r2 = r10.getUtcTimeMillis()
            boolean r12 = r12.isSelectableDate(r2)
            if (r12 != 0) goto L66
            goto Lab
        L66:
            androidx.compose.material3.InputIdentifier$Companion r12 = androidx.compose.material3.InputIdentifier.Companion
            int r0 = r12.m2710getStartDateInputJ2x2o4M()
            boolean r0 = androidx.compose.material3.InputIdentifier.m2704equalsimpl0(r11, r0)
            if (r0 == 0) goto L88
            long r0 = r10.getUtcTimeMillis()
            java.lang.Long r2 = r9.currentEndDateMillis
            if (r2 == 0) goto L7f
            long r2 = r2.longValue()
            goto L84
        L7f:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L84:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto La5
        L88:
            int r12 = r12.m2708getEndDateInputJ2x2o4M()
            boolean r11 = androidx.compose.material3.InputIdentifier.m2704equalsimpl0(r11, r12)
            if (r11 == 0) goto La8
            long r10 = r10.getUtcTimeMillis()
            java.lang.Long r12 = r9.currentStartDateMillis
            if (r12 == 0) goto L9f
            long r0 = r12.longValue()
            goto La1
        L9f:
            r0 = -9223372036854775808
        La1:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 >= 0) goto La8
        La5:
            java.lang.String r9 = r9.errorInvalidRangeInput
            return r9
        La8:
            java.lang.String r9 = ""
            return r9
        Lab:
            java.lang.String r11 = r9.errorInvalidNotAllowed
            androidx.compose.material3.DatePickerFormatter r9 = r9.dateFormatter
            long r2 = r10.getUtcTimeMillis()
            java.lang.Long r10 = java.lang.Long.valueOf(r2)
            java.lang.String r9 = r9.formatDate(r10, r6, r1)
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r1] = r9
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.formatString(r11, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputValidator.m2473validateXivgLIo(androidx.compose.material3.internal.CalendarDate, int, java.util.Locale):java.lang.String");
    }
}
