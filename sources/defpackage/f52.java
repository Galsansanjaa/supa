package defpackage;

import com.google.gson.b;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class f52 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ b e;
    public final /* synthetic */ b f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public f52(String str, Field field, Method method, b bVar, b bVar2, boolean z, boolean z2) {
        this.d = method;
        this.e = bVar;
        this.f = bVar2;
        this.g = z;
        this.h = z2;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(x91 x91Var, Object obj) {
        Object obj2;
        Method method = this.d;
        if (method != null) {
            try {
                obj2 = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new rx(3, k93.m("Accessor ", e52.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            obj2 = this.b.get(obj);
        }
        if (obj2 == obj) {
            return;
        }
        x91Var.m(this.a);
        this.e.c(x91Var, obj2);
    }
}
