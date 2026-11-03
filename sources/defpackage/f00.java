package defpackage;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class f00 {
    public final /* synthetic */ int a = 1;
    public final List b;
    public final Map c;

    public f00(List list, Map map) {
        this.b = list;
        this.c = map;
    }

    public f00(Map map, List list) {
        this.c = map;
        this.b = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f8, code lost:
    
        if (defpackage.m60.p(r7[0]) != java.lang.String.class) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.bs1 b(com.google.gson.reflect.TypeToken r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f00.b(com.google.gson.reflect.TypeToken, boolean):bs1");
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.c.toString();
            default:
                return super.toString();
        }
    }
}
