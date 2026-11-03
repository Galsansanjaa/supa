package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class av3 extends t44 {
    public long m;
    public String n;

    @Override // defpackage.t44
    public final boolean t() {
        Calendar calendar = Calendar.getInstance();
        this.m = (calendar.get(16) + calendar.get(15)) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.n = sg3.t(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long w() {
        u();
        return this.m;
    }

    public final String x() {
        u();
        return this.n;
    }
}
