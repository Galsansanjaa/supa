package defpackage;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bz2 extends dz2 {
    public final /* synthetic */ Method b;

    public bz2(Method method) {
        this.b = method;
    }

    @Override // defpackage.dz2
    public final Object a(Class cls) {
        String a = f00.a(cls);
        if (a == null) {
            return this.b.invoke(null, cls, Object.class);
        }
        qq.e("UnsafeAllocator is used for non-instantiable type: ".concat(a));
        return null;
    }
}
