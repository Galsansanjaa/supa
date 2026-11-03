package androidx.core.content;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import defpackage.v5;
import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class MimeTypeFilter {
    private MimeTypeFilter() {
    }

    public static String matches(String str, String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(DomExceptionUtils.SEPARATOR);
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(split, str2.split(DomExceptionUtils.SEPARATOR))) {
                return str2;
            }
        }
        return null;
    }

    public static String matches(String[] strArr, String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split(DomExceptionUtils.SEPARATOR);
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split(DomExceptionUtils.SEPARATOR), split)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean matches(String str, String str2) {
        if (str == null) {
            return false;
        }
        return mimeTypeAgainstFilter(str.split(DomExceptionUtils.SEPARATOR), str2.split(DomExceptionUtils.SEPARATOR));
    }

    public static String[] matchesMany(String[] strArr, String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(DomExceptionUtils.SEPARATOR);
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split(DomExceptionUtils.SEPARATOR), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean mimeTypeAgainstFilter(String[] strArr, String[] strArr2) {
        if (strArr2.length != 2) {
            v5.m("Ill-formatted MIME type filter. Must be type/subtype.");
            return false;
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            v5.m("Ill-formatted MIME type filter. Type or subtype empty.");
            return false;
        }
        if (strArr.length != 2) {
            return false;
        }
        if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }
}
