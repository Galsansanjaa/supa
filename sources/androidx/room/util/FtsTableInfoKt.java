package androidx.room.util;

import defpackage.jh2;
import defpackage.kw;
import defpackage.vm2;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class FtsTableInfoKt {
    public static final boolean equalsCommon(FtsTableInfo ftsTableInfo, Object obj) {
        ftsTableInfo.getClass();
        if (ftsTableInfo == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo2 = (FtsTableInfo) obj;
        if (jh2.k(ftsTableInfo.name, ftsTableInfo2.name) && jh2.k(ftsTableInfo.columns, ftsTableInfo2.columns)) {
            return jh2.k(ftsTableInfo.options, ftsTableInfo2.options);
        }
        return false;
    }

    public static final int hashCodeCommon(FtsTableInfo ftsTableInfo) {
        ftsTableInfo.getClass();
        return ftsTableInfo.options.hashCode() + ((ftsTableInfo.columns.hashCode() + (ftsTableInfo.name.hashCode() * 31)) * 31);
    }

    public static final String toStringCommon(FtsTableInfo ftsTableInfo) {
        ftsTableInfo.getClass();
        return vm2.X("\n            |FtsTableInfo {\n            |   name = '" + ftsTableInfo.name + "',\n            |   columns = {" + TableInfoKt.formatString(kw.F0(ftsTableInfo.columns)) + "\n            |   options = {" + TableInfoKt.formatString(kw.F0(ftsTableInfo.options)) + "\n            |}\n        ");
    }
}
