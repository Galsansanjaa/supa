package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class h81 implements ta1 {
    public static final h81 a = new Object();
    public static final g81 b = g81.b;

    @Override // defpackage.nd0
    public final Object deserialize(ob0 ob0Var) {
        ob0Var.getClass();
        t61.e(ob0Var);
        return new e81((List) new td(v81.a).f(ob0Var));
    }

    @Override // defpackage.bg2, defpackage.nd0
    public final tf2 getDescriptor() {
        return b;
    }

    @Override // defpackage.bg2
    public final void serialize(yi0 yi0Var, Object obj) {
        e81 e81Var = (e81) obj;
        e81Var.getClass();
        t61.f(yi0Var);
        v81 v81Var = v81.a;
        tf2 descriptor = v81Var.getDescriptor();
        descriptor.getClass();
        qd qdVar = new qd(descriptor, 1);
        int size = e81Var.size();
        kz beginCollection = yi0Var.beginCollection(qdVar, size);
        Iterator<r81> it = e81Var.iterator();
        for (int i = 0; i < size; i++) {
            beginCollection.encodeSerializableElement(qdVar, i, v81Var, it.next());
        }
        beginCollection.endStructure(qdVar);
    }
}
