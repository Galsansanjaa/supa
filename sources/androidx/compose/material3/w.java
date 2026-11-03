package androidx.compose.material3;

import defpackage.os0;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements os0 {
    public final /* synthetic */ int a;

    public /* synthetic */ w(int i) {
        this.a = i;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Float.valueOf(DatePickerKt$HorizontalMonthsList$1.b());
            case 1:
                return Float.valueOf(DatePickerKt$HorizontalMonthsList$1.c());
            case 2:
                return Float.valueOf(DateRangePickerKt$VerticalMonthsList$1.c());
            case 3:
                return Float.valueOf(DateRangePickerKt$VerticalMonthsList$1.b());
            case 4:
                return Boolean.valueOf(EnterAlwaysScrollBehavior.a());
            case 5:
                return Boolean.valueOf(ExitAlwaysScrollBehavior.a());
            case 6:
                return Boolean.valueOf(ExitUntilCollapsedScrollBehavior.a());
            default:
                return Boolean.valueOf(PinnedScrollBehavior.a());
        }
    }
}
