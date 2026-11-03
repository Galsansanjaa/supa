package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class rw1 extends f1 implements j21 {
    public final /* synthetic */ int a;
    public final kw1 b;

    public /* synthetic */ rw1(kw1 kw1Var, int i) {
        this.a = i;
        this.b = kw1Var;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.a;
        kw1 kw1Var = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = kw1Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && kw1Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return kw1Var.containsKey(obj);
        }
    }

    @Override // defpackage.o
    public final int getSize() {
        int i = this.a;
        kw1 kw1Var = this.b;
        switch (i) {
            case 0:
                return kw1Var.size();
            default:
                return kw1Var.size();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        kw1 kw1Var = this.b;
        switch (i) {
            case 0:
                su2 su2Var = kw1Var.a;
                su2Var.getClass();
                tu2[] tu2VarArr = new tu2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    tu2VarArr[i2] = new uu2(0);
                }
                return new lw1(su2Var, tu2VarArr);
            default:
                su2 su2Var2 = kw1Var.a;
                su2Var2.getClass();
                tu2[] tu2VarArr2 = new tu2[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    tu2VarArr2[i3] = new uu2(1);
                }
                return new lw1(su2Var2, tu2VarArr2);
        }
    }
}
