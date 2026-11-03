package defpackage;

import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.intl.LocaleList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements us0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LocaleList b;

    public /* synthetic */ k7(int i, LocaleList localeList) {
        this.a = i;
        this.b = localeList;
    }

    @Override // defpackage.us0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        String str = (String) obj;
        int intValue = ((Integer) obj2).intValue();
        int intValue2 = ((Integer) obj3).intValue();
        LocaleList localeList = this.b;
        switch (i) {
            case 0:
                return AnnotatedStringKt.d(localeList, str, intValue, intValue2);
            case 1:
                return AnnotatedStringKt.a(localeList, str, intValue, intValue2);
            case 2:
                return AnnotatedStringKt.b(localeList, str, intValue, intValue2);
            default:
                return AnnotatedStringKt.c(localeList, str, intValue, intValue2);
        }
    }
}
