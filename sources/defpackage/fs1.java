package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fs1 extends jk3 implements l01 {
    public final Object k;

    public fs1(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 2);
        this.k = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ek3, l01] */
    public static l01 M(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return queryLocalInterface instanceof l01 ? (l01) queryLocalInterface : new ek3(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 2);
    }

    public static Object N(l01 l01Var) {
        if (l01Var instanceof fs1) {
            return ((fs1) l01Var).k;
        }
        IBinder asBinder = l01Var.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            v5.m(wa2.u(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
            return null;
        }
        dn3.o(field);
        if (field.isAccessible()) {
            v5.m("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
