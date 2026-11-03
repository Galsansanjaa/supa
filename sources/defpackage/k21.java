package defpackage;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class k21 extends y11 implements Set {
    public static final /* synthetic */ int m = 0;
    public transient f21 b;

    public static int m(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        v5.m("collection too large");
        return 0;
    }

    public static k21 n(int i, Object... objArr) {
        if (i == 0) {
            return y52.t;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new mj2(obj);
        }
        int m2 = m(i);
        Object[] objArr2 = new Object[m2];
        int i2 = m2 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i5);
                throw new NullPointerException(sb.toString());
            }
            int hashCode = obj2.hashCode();
            int H = m60.H(hashCode);
            while (true) {
                int i6 = H & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                H++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new mj2(obj4);
        }
        if (m(i4) < m2 / 2) {
            return n(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new y52(objArr, objArr2, i3, i2, i4);
    }

    @Override // defpackage.y11
    public f21 c() {
        f21 f21Var = this.b;
        if (f21Var != null) {
            return f21Var;
        }
        f21 o = o();
        this.b = o;
        return o;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k21) && (this instanceof y52) && (((k21) obj) instanceof y52) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return t61.s(this);
    }

    public f21 o() {
        Object[] array = toArray(y11.a);
        a21 a21Var = f21.b;
        return f21.m(array.length, array);
    }
}
