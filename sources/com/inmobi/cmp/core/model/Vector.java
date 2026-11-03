package com.inmobi.cmp.core.model;

import defpackage.bn2;
import defpackage.dg3;
import defpackage.jh2;
import defpackage.kw;
import defpackage.ps0;
import defpackage.sb0;
import defpackage.ts0;
import defpackage.ya3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class Vector {
    private int bitLength;
    private Map<Integer, Boolean> map;

    /* JADX WARN: Multi-variable type inference failed */
    public Vector() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public Vector(Map<Integer, Boolean> map) {
        map.getClass();
        this.map = map;
    }

    public /* synthetic */ Vector(Map map, int i, sb0 sb0Var) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Vector copy$default(Vector vector, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = vector.map;
        }
        return vector.copy(map);
    }

    public final void clear() {
        this.map.clear();
    }

    public final Map<Integer, Boolean> component1() {
        return this.map;
    }

    public final boolean contains(int i) {
        return this.map.containsKey(Integer.valueOf(i));
    }

    public final Vector copy(Map<Integer, Boolean> map) {
        map.getClass();
        return new Vector(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Vector) && jh2.k(this.map, ((Vector) obj).map);
    }

    public final void forEach(ts0 ts0Var) {
        ts0Var.getClass();
        for (Map.Entry<Integer, Boolean> entry : this.map.entrySet()) {
            ts0Var.invoke(entry.getKey(), entry.getValue());
        }
    }

    public final void forEachMap(ps0 ps0Var) {
        ps0Var.getClass();
        Iterator<Map.Entry<Integer, Boolean>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            ps0Var.invoke(it.next());
        }
    }

    public final Boolean get(int i) {
        return this.map.get(Integer.valueOf(i));
    }

    public final Set<Integer> getAcceptedItems() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = getMap().keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            if (jh2.k(get(intValue), Boolean.TRUE)) {
                linkedHashSet.add(Integer.valueOf(intValue));
            }
        }
        return linkedHashSet;
    }

    public final int getBitLength() {
        return this.bitLength;
    }

    public final Set<Integer> getKeys() {
        return this.map.keySet();
    }

    public final Map<Integer, Boolean> getMap() {
        return this.map;
    }

    public final int getMaxId() {
        Integer num = (Integer) kw.z0(this.map.keySet());
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final void set(int i) {
        this.map.put(Integer.valueOf(i), Boolean.TRUE);
    }

    public final void set(Vector vector) {
        if (vector == null) {
            return;
        }
        vector.forEach(new dg3(1, this));
    }

    public final void set(Set<String> set) {
        set.getClass();
        for (String str : set) {
            str.getClass();
            Integer j0 = bn2.j0(10, str);
            if (j0 != null) {
                getMap().put(Integer.valueOf(j0.intValue()), Boolean.TRUE);
                setBitLength(0);
            }
        }
    }

    public final void setAllOwnedItems() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            set(it.next().getKey().intValue());
        }
    }

    public final void setBitLength(int i) {
        this.bitLength = i;
    }

    public final void setItems(Set<Integer> set) {
        set.getClass();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            getMap().put(Integer.valueOf(((Number) it.next()).intValue()), Boolean.TRUE);
            setBitLength(0);
        }
    }

    public final void setMap(Map<Integer, Boolean> map) {
        map.getClass();
        this.map = map;
    }

    public final void setOwnedItems(Vector vector) {
        if (vector == null) {
            return;
        }
        vector.forEach(new dg3(2, this));
    }

    public final int size() {
        return this.map.size();
    }

    public String toString() {
        return "Vector(map=" + this.map + ')';
    }

    public final void unset(int i) {
        this.map.put(Integer.valueOf(i), Boolean.FALSE);
        this.bitLength = 0;
    }

    public final void unset(Vector vector) {
        forEach(new ya3(vector, this));
    }

    public final void unset(Set<Integer> set) {
        set.getClass();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            getMap().put(Integer.valueOf(((Number) it.next()).intValue()), Boolean.FALSE);
            setBitLength(0);
        }
    }

    public final void unsetAllOwnedItems() {
        Iterator<Map.Entry<Integer, Boolean>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            unset(it.next().getKey().intValue());
        }
    }
}
