package defpackage;

import androidx.compose.material3.DatePickerStateImpl;
import androidx.compose.material3.DateRangePickerStateImpl;
import androidx.compose.material3.SelectableDates;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class db0 implements ps0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectableDates b;
    public final /* synthetic */ Locale m;

    public /* synthetic */ db0(SelectableDates selectableDates, Locale locale, int i) {
        this.a = i;
        this.b = selectableDates;
        this.m = locale;
    }

    @Override // defpackage.ps0
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return DatePickerStateImpl.Companion.b(this.b, this.m, (List) obj);
            default:
                return DateRangePickerStateImpl.Companion.b(this.b, this.m, (List) obj);
        }
    }
}
