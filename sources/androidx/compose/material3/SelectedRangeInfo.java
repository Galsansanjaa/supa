package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.ui.unit.IntOffset;
import defpackage.sb0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class SelectedRangeInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final boolean firstIsSelectionStart;
    private final long gridEndCoordinates;
    private final long gridStartCoordinates;
    private final boolean lastIsSelectionEnd;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(sb0 sb0Var) {
            this();
        }

        public final SelectedRangeInfo calculateRangeInfo(CalendarMonth calendarMonth, CalendarDate calendarDate, CalendarDate calendarDate2) {
            int daysFromStartOfWeekToFirstOfMonth;
            int numberOfDays;
            if (calendarDate.getUtcTimeMillis() > calendarMonth.getEndUtcTimeMillis() || calendarDate2.getUtcTimeMillis() < calendarMonth.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z = calendarDate.getUtcTimeMillis() >= calendarMonth.getStartUtcTimeMillis();
            boolean z2 = calendarDate2.getUtcTimeMillis() <= calendarMonth.getEndUtcTimeMillis();
            int dayOfMonth = z ? (calendarDate.getDayOfMonth() + calendarMonth.getDaysFromStartOfWeekToFirstOfMonth()) - 1 : calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
            if (z2) {
                daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                numberOfDays = calendarDate2.getDayOfMonth();
            } else {
                daysFromStartOfWeekToFirstOfMonth = calendarMonth.getDaysFromStartOfWeekToFirstOfMonth();
                numberOfDays = calendarMonth.getNumberOfDays();
            }
            int i = (numberOfDays + daysFromStartOfWeekToFirstOfMonth) - 1;
            return new SelectedRangeInfo(IntOffset.m8167constructorimpl(((dayOfMonth / 7) & 4294967295L) | ((dayOfMonth % 7) << 32)), IntOffset.m8167constructorimpl(((i / 7) & 4294967295L) | ((i % 7) << 32)), z, z2, null);
        }
    }

    private SelectedRangeInfo(long j, long j2, boolean z, boolean z2) {
        this.gridStartCoordinates = j;
        this.gridEndCoordinates = j2;
        this.firstIsSelectionStart = z;
        this.lastIsSelectionEnd = z2;
    }

    public /* synthetic */ SelectedRangeInfo(long j, long j2, boolean z, boolean z2, sb0 sb0Var) {
        this(j, j2, z, z2);
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    /* renamed from: getGridEndCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2994getGridEndCoordinatesnOccac() {
        return this.gridEndCoordinates;
    }

    /* renamed from: getGridStartCoordinates-nOcc-ac, reason: not valid java name */
    public final long m2995getGridStartCoordinatesnOccac() {
        return this.gridStartCoordinates;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }
}
