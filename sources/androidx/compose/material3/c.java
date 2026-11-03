package androidx.compose.material3;

import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.DateRangePickerStateImpl;
import androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior;
import androidx.compose.material3.TimePickerStateImpl;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import defpackage.ts0;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ts0 {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // defpackage.ts0
    public final Object invoke(Object obj, Object obj2) {
        List Saver$lambda$0;
        List Saver$lambda$02;
        switch (this.a) {
            case 0:
                return AppBarOverflowStateImpl.a((SaverScope) obj, (AppBarOverflowStateImpl) obj2);
            case 1:
                Saver$lambda$0 = DatePickerStateImpl.Companion.Saver$lambda$0((SaverScope) obj, (DatePickerStateImpl) obj2);
                return Saver$lambda$0;
            case 2:
                Saver$lambda$02 = DateRangePickerStateImpl.Companion.Saver$lambda$0((SaverScope) obj, (DateRangePickerStateImpl) obj2);
                return Saver$lambda$02;
            case 3:
                return EnterAlwaysSearchBarScrollBehavior.Companion.b((SaverScope) obj, (EnterAlwaysSearchBarScrollBehavior) obj2);
            case 4:
                return Integer.valueOf(OutlinedTextFieldMeasurePolicy.d((IntrinsicMeasurable) obj, ((Integer) obj2).intValue()));
            case 5:
                return Integer.valueOf(OutlinedTextFieldMeasurePolicy.a((IntrinsicMeasurable) obj, ((Integer) obj2).intValue()));
            case 6:
                return Integer.valueOf(OutlinedTextFieldMeasurePolicy.b((IntrinsicMeasurable) obj, ((Integer) obj2).intValue()));
            case 7:
                return Integer.valueOf(OutlinedTextFieldMeasurePolicy.e((IntrinsicMeasurable) obj, ((Integer) obj2).intValue()));
            case 8:
                return Integer.valueOf(TextFieldMeasurePolicy.c((IntrinsicMeasurable) obj, ((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(TextFieldMeasurePolicy.b((IntrinsicMeasurable) obj, ((Integer) obj2).intValue()));
            case 10:
                return Integer.valueOf(TextFieldMeasurePolicy.a((IntrinsicMeasurable) obj, ((Integer) obj2).intValue()));
            case 11:
                return Integer.valueOf(TextFieldMeasurePolicy.e((IntrinsicMeasurable) obj, ((Integer) obj2).intValue()));
            default:
                return TimePickerStateImpl.Companion.a((SaverScope) obj, (TimePickerStateImpl) obj2);
        }
    }
}
