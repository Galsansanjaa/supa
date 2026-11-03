package defpackage;

import androidx.compose.runtime.internal.ComposableLambda;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class mv implements ca1, kv {
    public static final Map b;
    public final Class a;

    static {
        int i = 0;
        List D = nb0.D(os0.class, ps0.class, ts0.class, us0.class, vs0.class, ws0.class, xs0.class, ys0.class, zs0.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, qs0.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ComposableLambda.class, ss0.class);
        ArrayList arrayList = new ArrayList(lw.Z(D, 10));
        for (Object obj : D) {
            int i2 = i + 1;
            if (i < 0) {
                nb0.O();
                throw null;
            }
            arrayList.add(new dv1((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = fi1.T(arrayList);
    }

    public mv(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.kv
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String i;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String i2 = od4.i(cls.getName());
            return i2 == null ? cls.getCanonicalName() : i2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (i = od4.i(componentType.getName())) != null) {
            str = i.concat("Array");
        }
        return str == null ? "kotlin.Array" : str;
    }

    public final String c() {
        String x;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String x2 = od4.x(cls.getName());
                return x2 == null ? cls.getSimpleName() : x2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (x = od4.x(componentType.getName())) != null) {
                str = x.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return um2.H0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int t0 = um2.t0('$', 0, 6, simpleName);
            return t0 == -1 ? simpleName : simpleName.substring(t0 + 1, simpleName.length());
        }
        return um2.H0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean d(Object obj) {
        Class cls = this.a;
        cls.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return ux2.G(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = ej1.v(a52.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mv) && ej1.v(this).equals(ej1.v((ca1) obj));
    }

    public final int hashCode() {
        return ej1.v(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
