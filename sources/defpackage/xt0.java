package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public class xt0 implements Iterator, fa1 {
    public final /* synthetic */ int a;
    public Object b;
    public int m;
    public final Object n;

    public xt0(bd0 bd0Var) {
        this.a = 0;
        this.n = bd0Var;
        this.m = -2;
    }

    public xt0(Object obj, Map map) {
        this.a = 1;
        this.b = obj;
        this.n = map;
    }

    public void a() {
        Object invoke;
        int i = this.m;
        bd0 bd0Var = (bd0) this.n;
        if (i == -2) {
            invoke = ((os0) bd0Var.b).invoke();
        } else {
            ps0 ps0Var = (ps0) bd0Var.c;
            Object obj = this.b;
            obj.getClass();
            invoke = ps0Var.invoke(obj);
        }
        this.b = invoke;
        this.m = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.m < 0) {
                    a();
                }
                return this.m == 1;
            default:
                return this.m < ((Map) this.n).size();
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        Object obj = null;
        switch (this.a) {
            case 0:
                if (this.m < 0) {
                    a();
                }
                if (this.m == 0) {
                    f31.b();
                    return null;
                }
                Object obj2 = this.b;
                obj2.getClass();
                this.m = -1;
                return obj2;
            default:
                if (hasNext()) {
                    obj = this.b;
                    this.m++;
                    Object obj3 = ((Map) this.n).get(obj);
                    if (obj3 == null) {
                        throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
                    }
                    this.b = ((ce1) obj3).b;
                } else {
                    f31.b();
                }
                return obj;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
