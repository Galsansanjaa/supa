package androidx.room.util;

import defpackage.jh2;
import defpackage.vm2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ViewInfoKt {
    public static final boolean equalsCommon(ViewInfo viewInfo, Object obj) {
        viewInfo.getClass();
        if (viewInfo == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo2 = (ViewInfo) obj;
        if (jh2.k(viewInfo.name, viewInfo2.name)) {
            String str = viewInfo.sql;
            String str2 = viewInfo2.sql;
            if (str != null ? jh2.k(str, str2) : str2 == null) {
                return true;
            }
        }
        return false;
    }

    public static final int hashCodeCommon(ViewInfo viewInfo) {
        viewInfo.getClass();
        int hashCode = viewInfo.name.hashCode() * 31;
        String str = viewInfo.sql;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public static final String toStringCommon(ViewInfo viewInfo) {
        viewInfo.getClass();
        return vm2.X("\n            |ViewInfo {\n            |   name = '" + viewInfo.name + "',\n            |   sql = '" + viewInfo.sql + "'\n            |}\n        ");
    }
}
