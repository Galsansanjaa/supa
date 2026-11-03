package androidx.core.content;

import android.content.ContentValues;
import defpackage.dv1;
import defpackage.qq;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(dv1... dv1VarArr) {
        ContentValues contentValues = new ContentValues(dv1VarArr.length);
        for (dv1 dv1Var : dv1VarArr) {
            String str = (String) dv1Var.a;
            Object obj = dv1Var.b;
            if (obj == null) {
                contentValues.putNull(str);
            } else if (obj instanceof String) {
                contentValues.put(str, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str, (Byte) obj);
            } else {
                if (!(obj instanceof Short)) {
                    qq.d(34, obj.getClass().getCanonicalName(), " for key \"", str, "Illegal value type ");
                    return null;
                }
                contentValues.put(str, (Short) obj);
            }
        }
        return contentValues;
    }
}
