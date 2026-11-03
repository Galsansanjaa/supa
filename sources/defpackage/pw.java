package defpackage;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public abstract class pw extends ow {
    public static void b0(PersistentCollection.Builder builder, nf2 nf2Var) {
        builder.getClass();
        nf2Var.getClass();
        Iterator it = nf2Var.iterator();
        while (it.hasNext()) {
            builder.add(it.next());
        }
    }

    public static void c0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void d0(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        collection.addAll(asList);
    }

    public static final boolean e0(Iterable iterable, ps0 ps0Var) {
        Iterator it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((Boolean) ps0Var.invoke(it.next())).booleanValue()) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static void f0(ps0 ps0Var, List list) {
        int size;
        list.getClass();
        ps0Var.getClass();
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof fa1) && !(list instanceof ga1)) {
                ux2.O(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                e0(list, ps0Var);
                return;
            } catch (ClassCastException e) {
                jh2.Q(e, ux2.class.getName());
                throw e;
            }
        }
        int size2 = list.size() - 1;
        int i = 0;
        if (size2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) ps0Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static void g0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            iterable = kw.L0(iterable);
        }
        collection.removeAll((Collection) iterable);
    }

    public static void h0(Collection collection, nf2 nf2Var) {
        collection.getClass();
        nf2Var.getClass();
        List W = qf2.W(nf2Var);
        if (W.isEmpty()) {
            return;
        }
        collection.removeAll(W);
    }

    public static void i0(Collection collection, Object[] objArr) {
        collection.getClass();
        objArr.getClass();
        if (objArr.length == 0) {
            return;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        collection.removeAll(asList);
    }

    public static Object j0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        hu2.n("List is empty.");
        return null;
    }

    public static Object k0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
}
