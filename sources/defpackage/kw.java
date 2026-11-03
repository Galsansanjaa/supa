package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class kw extends pw {
    public static ArrayList A0(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(lw.Z(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && jh2.k(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList B0(Iterable iterable, Collection collection) {
        collection.getClass();
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            pw.c0(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList C0(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object D0(List list) {
        list.getClass();
        int size = list.size();
        if (size == 0) {
            hu2.n("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        v5.m("List has more than one element.");
        return null;
    }

    public static List E0(i61 i61Var, List list) {
        list.getClass();
        i61Var.getClass();
        return i61Var.isEmpty() ? oi0.a : L0(list.subList(i61Var.a, i61Var.b + 1));
    }

    public static List F0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List N0 = N0(iterable);
            if (((ArrayList) N0).size() > 1) {
                Collections.sort(N0);
            }
            return N0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return L0(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return wd.Z(array);
    }

    public static List G0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List N0 = N0(iterable);
            ow.a0(N0, comparator);
            return N0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return L0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List asList = Arrays.asList(array);
        asList.getClass();
        return asList;
    }

    public static List H0(ArrayList arrayList, int i) {
        if (i < 0) {
            qq.j(sg3.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return oi0.a;
        }
        if (i >= arrayList.size()) {
            return L0(arrayList);
        }
        if (i == 1) {
            return nb0.C(o0(arrayList));
        }
        ArrayList arrayList2 = new ArrayList(i);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            arrayList2.add(obj);
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return nb0.F(arrayList2);
    }

    public static final void I0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] J0(List list) {
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] K0(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List L0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return nb0.F(N0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return oi0.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return nb0.C(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList M0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List N0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        I0(iterable, arrayList);
        return arrayList;
    }

    public static Set O0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        I0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set P0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return jh2.S(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(fi1.P(collection.size()));
                I0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            I0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : jh2.S(linkedHashSet2.iterator().next());
            }
        }
        return ri0.a;
    }

    public static boolean l0(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    nb0.O();
                    throw null;
                }
                if (jh2.k(obj, next)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        } else {
            i = ((List) iterable).indexOf(obj);
        }
        return i >= 0;
    }

    public static List m0(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        iterable.getClass();
        if (i < 0) {
            qq.j(sg3.o(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return L0(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return oi0.a;
            }
            if (size == 1) {
                if (iterable instanceof List) {
                    obj = x0((List) iterable);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        hu2.n("Collection is empty.");
                        return null;
                    }
                    Object next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                    obj = next;
                }
                return nb0.C(obj);
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj2 : iterable) {
            if (i2 >= i) {
                arrayList.add(obj2);
            } else {
                i2++;
            }
        }
        return nb0.F(arrayList);
    }

    public static Object n0(Iterable iterable, int i) {
        iterable.getClass();
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        d5 d5Var = new d5(i, 7);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            d5Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            d5Var.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        d5Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static Object o0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return p0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        hu2.n("Collection is empty.");
        return null;
    }

    public static Object p0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        hu2.n("List is empty.");
        return null;
    }

    public static Object q0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object r0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object s0(int i, List list) {
        list.getClass();
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int t0(List list, Object obj) {
        list.getClass();
        return list.indexOf(obj);
    }

    public static final void u0(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ps0 ps0Var) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            od4.f(sb, obj, ps0Var);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void v0(List list, StringBuilder sb, m mVar, int i) {
        if ((i & 64) != 0) {
            mVar = null;
        }
        u0(list, sb, "\n", "", "", "...", mVar);
    }

    public static String w0(Iterable iterable, String str, String str2, String str3, ps0 ps0Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            ps0Var = null;
        }
        iterable.getClass();
        StringBuilder sb = new StringBuilder();
        u0(iterable, sb, str4, str5, str6, "...", ps0Var);
        return sb.toString();
    }

    public static Object x0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return lt.v(1, list);
        }
        hu2.n("List is empty.");
        return null;
    }

    public static Object y0(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return lt.v(1, list);
    }

    public static Comparable z0(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }
}
