package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ow1 extends y0 {
    public final /* synthetic */ int a;
    public final mw1 b;

    public /* synthetic */ ow1(int i, mw1 mw1Var) {
        this.a = i;
        this.b = mw1Var;
    }

    @Override // defpackage.y0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        mw1 mw1Var = this.b;
        switch (i) {
            case 0:
                mw1Var.clear();
                return;
            default:
                mw1Var.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        mw1 mw1Var = this.b;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = mw1Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && mw1Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return mw1Var.containsKey(obj);
        }
    }

    @Override // defpackage.y0
    public final int getSize() {
        int i = this.a;
        mw1 mw1Var = this.b;
        switch (i) {
            case 0:
                return mw1Var.size();
            default:
                return mw1Var.size();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        mw1 mw1Var = this.b;
        switch (i) {
            case 0:
                return new pw1(mw1Var);
            default:
                tu2[] tu2VarArr = new tu2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    tu2VarArr[i2] = new uu2(1);
                }
                return new nw1(mw1Var, tu2VarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        mw1 mw1Var = this.b;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return mw1Var.remove(entry.getKey(), entry.getValue());
            default:
                if (!mw1Var.containsKey(obj)) {
                    return false;
                }
                mw1Var.remove(obj);
                return true;
        }
    }
}
