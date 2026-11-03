package defpackage;

import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionAdjustmentKt;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.material3.TimePickerState;
import androidx.compose.material3.carousel.CarouselState;
import androidx.compose.material3.carousel.CarouselStateKt;
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class jt implements os0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object m;

    public /* synthetic */ jt(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.m = obj;
    }

    public /* synthetic */ jt(Object obj, int i, int i2) {
        this.a = i2;
        this.m = obj;
        this.b = i;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        CarouselState rememberCarouselState$lambda$1$lambda$0;
        int updateSelectionBoundary$lambda$0;
        vy2 TimeSelector_SAnMeKU$lambda$58$lambda$57;
        int i = this.a;
        Object obj = this.m;
        int i2 = this.b;
        switch (i) {
            case 0:
                rememberCarouselState$lambda$1$lambda$0 = CarouselStateKt.rememberCarouselState$lambda$1$lambda$0(i2, (os0) obj);
                return rememberCarouselState$lambda$1$lambda$0;
            case 1:
                return LoremIpsum.a((x42) obj, i2);
            case 2:
                updateSelectionBoundary$lambda$0 = SelectionAdjustmentKt.updateSelectionBoundary$lambda$0((SelectableInfo) obj, i2);
                return Integer.valueOf(updateSelectionBoundary$lambda$0);
            default:
                TimeSelector_SAnMeKU$lambda$58$lambda$57 = TimePickerKt.TimeSelector_SAnMeKU$lambda$58$lambda$57(i2, (TimePickerState) obj);
                return TimeSelector_SAnMeKU$lambda$58$lambda$57;
        }
    }
}
