package androidx.compose.material3.internal;

import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.text.format.DateFormat;
import defpackage.sg3;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final class CalendarModel_androidKt {
    public static final CalendarModel createCalendarModel(Locale locale) {
        return Build.VERSION.SDK_INT >= 26 ? new CalendarModelImpl(locale) : new LegacyCalendarModelImpl(locale);
    }

    public static final String formatWithSkeleton(long j, String str, Locale locale, Map<String, Object> map) {
        DisplayContext displayContext;
        if (Build.VERSION.SDK_INT < 24) {
            StringBuilder v = sg3.v("S:", str);
            v.append(locale.toLanguageTag());
            String sb = v.toString();
            Object obj = map.get(sb);
            if (obj == null) {
                obj = DateFormat.getBestDateTimePattern(locale, str);
                map.put(sb, obj);
            }
            return LegacyCalendarModelImpl.Companion.formatWithPattern(j, obj.toString(), locale, map);
        }
        StringBuilder v2 = sg3.v("S:", str);
        v2.append(locale.toLanguageTag());
        String sb2 = v2.toString();
        Object obj2 = map.get(sb2);
        Object obj3 = obj2;
        if (obj2 == null) {
            android.icu.text.DateFormat instanceForSkeleton = android.icu.text.DateFormat.getInstanceForSkeleton(str, locale);
            displayContext = DisplayContext.CAPITALIZATION_FOR_STANDALONE;
            instanceForSkeleton.setContext(displayContext);
            instanceForSkeleton.setTimeZone(TimeZone.GMT_ZONE);
            map.put(sb2, instanceForSkeleton);
            obj3 = instanceForSkeleton;
        }
        return ((android.icu.text.DateFormat) obj3).format(new Date(j));
    }
}
