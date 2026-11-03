package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class p implements ta1 {
    public abstract Object a();

    public abstract int b(Object obj);

    public abstract void c(int i, Object obj);

    public abstract Iterator d(Object obj);

    public Object deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        return f(ob0Var);
    }

    public abstract int e(Object obj);

    public final Object f(ob0 ob0Var) {
        ob0Var.getClass();
        Object a = a();
        int b = b(a);
        jz beginStructure = ob0Var.beginStructure(getDescriptor());
        if (!beginStructure.decodeSequentially()) {
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(getDescriptor());
                if (decodeElementIndex == -1) {
                    break;
                }
                h(beginStructure, decodeElementIndex + b, a);
            }
        } else {
            int decodeCollectionSize = beginStructure.decodeCollectionSize(getDescriptor());
            c(decodeCollectionSize, a);
            g(beginStructure, a, b, decodeCollectionSize);
        }
        beginStructure.endStructure(getDescriptor());
        return j(a);
    }

    public abstract void g(jz jzVar, Object obj, int i, int i2);

    public abstract void h(jz jzVar, int i, Object obj);

    public abstract Object i(Object obj);

    public abstract Object j(Object obj);
}
