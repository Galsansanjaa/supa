package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class su2 {
    public static final su2 e = new su2(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final bp c;
    public Object[] d;

    public su2(int i, int i2, Object[] objArr, bp bpVar) {
        this.a = i;
        this.b = i2;
        this.c = bpVar;
        this.d = objArr;
    }

    public static su2 k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, bp bpVar) {
        if (i3 > 30) {
            return new su2(0, 0, new Object[]{obj, obj2, obj3, obj4}, bpVar);
        }
        int n = od4.n(i, i3);
        int n2 = od4.n(i2, i3);
        if (n != n2) {
            return new su2((1 << n) | (1 << n2), 0, n < n2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bpVar);
        }
        return new su2(0, 1 << n, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, bpVar)}, bpVar);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, bp bpVar) {
        Object obj3 = this.d[i];
        su2 k = k(obj3 != null ? obj3.hashCode() : 0, obj3, v(i), i3, obj, obj2, i4 + 5, bpVar);
        int t = t(i2);
        int i5 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        wd.o0(objArr, objArr2, 0, 0, i, 6);
        wd.k0(objArr, objArr2, i, i + 2, i5);
        objArr2[t - 1] = k;
        wd.k0(objArr, objArr2, t, i5, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final int c(Object obj) {
        g61 J = ea0.J(ea0.M(0, this.d.length), 2);
        int i = J.a;
        int i2 = J.b;
        int i3 = J.m;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (!jh2.k(obj, this.d[i])) {
            if (i == i2) {
                return -1;
            }
            i += i3;
        }
        return i;
    }

    public final boolean d(int i, Object obj, int i2) {
        int n = 1 << od4.n(i, i2);
        if (i(n)) {
            return jh2.k(obj, this.d[f(n)]);
        }
        if (!j(n)) {
            return false;
        }
        su2 s = s(t(n));
        return i2 == 30 ? s.c(obj) != -1 : s.d(i, obj, i2 + 5);
    }

    public final boolean e(su2 su2Var) {
        if (this == su2Var) {
            return true;
        }
        if (this.b == su2Var.b && this.a == su2Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == su2Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final boolean g(su2 su2Var, ts0 ts0Var) {
        int i;
        su2Var.getClass();
        if (this == su2Var) {
            return true;
        }
        int i2 = this.a;
        if (i2 == su2Var.a && (i = this.b) == su2Var.b) {
            if (i2 != 0 || i != 0) {
                int bitCount = Integer.bitCount(i2) * 2;
                g61 J = ea0.J(ea0.M(0, bitCount), 2);
                int i3 = J.a;
                int i4 = J.b;
                int i5 = J.m;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (jh2.k(this.d[i3], su2Var.d[i3]) && ((Boolean) ts0Var.invoke(v(i3), su2Var.v(i3))).booleanValue()) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                }
                int length = this.d.length;
                while (bitCount < length) {
                    if (s(bitCount).g(su2Var.s(bitCount), ts0Var)) {
                        bitCount++;
                    }
                }
                return true;
            }
            Object[] objArr = this.d;
            if (objArr.length == su2Var.d.length) {
                Iterable J2 = ea0.J(ea0.M(0, objArr.length), 2);
                if ((J2 instanceof Collection) && ((Collection) J2).isEmpty()) {
                    return true;
                }
                Iterator it = J2.iterator();
                while (((h61) it).m) {
                    int nextInt = ((e61) it).nextInt();
                    Object obj = su2Var.d[nextInt];
                    Object v = su2Var.v(nextInt);
                    int c = c(obj);
                    if (!(c != -1 ? ((Boolean) ts0Var.invoke(v(c), v)).booleanValue() : false)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object h(int i, Object obj, int i2) {
        int n = 1 << od4.n(i, i2);
        if (i(n)) {
            int f = f(n);
            if (jh2.k(obj, this.d[f])) {
                return v(f);
            }
            return null;
        }
        if (!j(n)) {
            return null;
        }
        su2 s = s(t(n));
        if (i2 != 30) {
            return s.h(i, obj, i2 + 5);
        }
        int c = s.c(obj);
        if (c != -1) {
            return s.v(c);
        }
        return null;
    }

    public final boolean i(int i) {
        return (this.a & i) != 0;
    }

    public final boolean j(int i) {
        return (this.b & i) != 0;
    }

    public final su2 l(int i, mw1 mw1Var) {
        mw1Var.setSize(mw1Var.size() - 1);
        mw1Var.n = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != mw1Var.b) {
            return new su2(0, 0, od4.u(objArr, i), mw1Var.b);
        }
        this.d = od4.u(objArr, i);
        return this;
    }

    public final su2 m(int i, Object obj, Object obj2, int i2, mw1 mw1Var) {
        su2 m;
        int n = 1 << od4.n(i, i2);
        boolean i3 = i(n);
        bp bpVar = this.c;
        if (i3) {
            int f = f(n);
            if (!jh2.k(obj, this.d[f])) {
                mw1Var.setSize(mw1Var.size() + 1);
                bp bpVar2 = mw1Var.b;
                if (bpVar != bpVar2) {
                    return new su2(this.a ^ n, this.b | n, a(f, n, i, obj, obj2, i2, bpVar2), bpVar2);
                }
                this.d = a(f, n, i, obj, obj2, i2, bpVar2);
                this.a ^= n;
                this.b |= n;
                return this;
            }
            mw1Var.n = v(f);
            if (v(f) != obj2) {
                if (bpVar == mw1Var.b) {
                    this.d[f + 1] = obj2;
                    return this;
                }
                mw1Var.o++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new su2(this.a, this.b, copyOf, mw1Var.b);
            }
        } else {
            if (!j(n)) {
                mw1Var.setSize(mw1Var.size() + 1);
                bp bpVar3 = mw1Var.b;
                int f2 = f(n);
                Object[] objArr2 = this.d;
                if (bpVar != bpVar3) {
                    return new su2(this.a | n, this.b, od4.p(objArr2, f2, obj, obj2), bpVar3);
                }
                this.d = od4.p(objArr2, f2, obj, obj2);
                this.a |= n;
                return this;
            }
            int t = t(n);
            su2 s = s(t);
            if (i2 == 30) {
                int c = s.c(obj);
                if (c != -1) {
                    mw1Var.n = s.v(c);
                    if (s.c == mw1Var.b) {
                        s.d[c + 1] = obj2;
                        m = s;
                    } else {
                        mw1Var.o++;
                        Object[] objArr3 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                        copyOf2[c + 1] = obj2;
                        m = new su2(0, 0, copyOf2, mw1Var.b);
                    }
                } else {
                    mw1Var.setSize(mw1Var.size() + 1);
                    m = new su2(0, 0, od4.p(s.d, 0, obj, obj2), mw1Var.b);
                }
            } else {
                m = s.m(i, obj, obj2, i2 + 5, mw1Var);
            }
            if (s != m) {
                return u(t, n, mw1Var.b, m);
            }
        }
        return this;
    }

    public final su2 n(su2 su2Var, int i, ed0 ed0Var, mw1 mw1Var) {
        Object[] objArr;
        su2 k;
        mw1 mw1Var2 = mw1Var;
        su2Var.getClass();
        if (this == su2Var) {
            ed0Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            bp bpVar = mw1Var2.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + su2Var.d.length);
            int length = this.d.length;
            g61 J = ea0.J(ea0.M(0, su2Var.d.length), 2);
            int i3 = J.a;
            int i4 = J.b;
            int i5 = J.m;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(su2Var.d[i3]) != -1) {
                        ed0Var.a++;
                    } else {
                        Object[] objArr3 = su2Var.d;
                        copyOf[length] = objArr3[i3];
                        copyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != su2Var.d.length) {
                    return length == copyOf.length ? new su2(0, 0, copyOf, bpVar) : new su2(0, 0, Arrays.copyOf(copyOf, length), bpVar);
                }
            }
            return this;
        }
        int i6 = this.b | su2Var.b;
        int i7 = this.a;
        int i8 = su2Var.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i10);
            if (jh2.k(this.d[f(lowestOneBit)], su2Var.d[su2Var.f(lowestOneBit)])) {
                i11 |= lowestOneBit;
            } else {
                i6 |= lowestOneBit;
            }
            i10 ^= lowestOneBit;
        }
        if ((i6 & i11) != 0) {
            hu2.h("Check failed.");
            return null;
        }
        su2 su2Var2 = (jh2.k(this.c, mw1Var2.b) && this.a == i11 && this.b == i6) ? this : new su2(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = su2Var2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (j(lowestOneBit2)) {
                k = s(t(lowestOneBit2));
                if (su2Var.j(lowestOneBit2)) {
                    k = k.n(su2Var.s(su2Var.t(lowestOneBit2)), i + 5, ed0Var, mw1Var2);
                    objArr = objArr4;
                } else {
                    if (su2Var.i(lowestOneBit2)) {
                        int f = su2Var.f(lowestOneBit2);
                        Object obj = su2Var.d[f];
                        Object v = su2Var.v(f);
                        int size = mw1Var2.size();
                        objArr = objArr4;
                        k = k.m(obj != null ? obj.hashCode() : i2, obj, v, i + 5, mw1Var2);
                        if (mw1Var.size() == size) {
                            ed0Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                    mw1Var2 = mw1Var;
                }
            } else {
                objArr = objArr4;
                if (su2Var.j(lowestOneBit2)) {
                    su2 s = su2Var.s(su2Var.t(lowestOneBit2));
                    if (i(lowestOneBit2)) {
                        int f2 = f(lowestOneBit2);
                        Object obj2 = this.d[f2];
                        int i14 = i + 5;
                        if (s.d(obj2 != null ? obj2.hashCode() : 0, obj2, i14)) {
                            ed0Var.a++;
                        } else {
                            mw1Var2 = mw1Var;
                            k = s.m(obj2 != null ? obj2.hashCode() : 0, obj2, v(f2), i14, mw1Var2);
                        }
                    }
                    mw1Var2 = mw1Var;
                    k = s;
                } else {
                    mw1Var2 = mw1Var;
                    int f3 = f(lowestOneBit2);
                    Object obj3 = this.d[f3];
                    Object v2 = v(f3);
                    int f4 = su2Var.f(lowestOneBit2);
                    Object obj4 = su2Var.d[f4];
                    k = k(obj3 != null ? obj3.hashCode() : 0, obj3, v2, obj4 != null ? obj4.hashCode() : 0, obj4, su2Var.v(f4), i + 5, mw1Var2.b);
                }
            }
            objArr[length2] = k;
            i13++;
            i12 ^= lowestOneBit2;
            i2 = 0;
        }
        int i15 = 0;
        while (i11 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i11);
            int i16 = i15 * 2;
            if (su2Var.i(lowestOneBit3)) {
                int f5 = su2Var.f(lowestOneBit3);
                Object[] objArr5 = su2Var2.d;
                objArr5[i16] = su2Var.d[f5];
                objArr5[i16 + 1] = su2Var.v(f5);
                if (i(lowestOneBit3)) {
                    ed0Var.a++;
                }
            } else {
                int f6 = f(lowestOneBit3);
                Object[] objArr6 = su2Var2.d;
                objArr6[i16] = this.d[f6];
                objArr6[i16 + 1] = v(f6);
            }
            i15++;
            i11 ^= lowestOneBit3;
        }
        if (!e(su2Var2)) {
            return su2Var.e(su2Var2) ? su2Var : su2Var2;
        }
        return this;
    }

    public final su2 o(int i, Object obj, int i2, mw1 mw1Var) {
        int n = 1 << od4.n(i, i2);
        if (i(n)) {
            int f = f(n);
            return jh2.k(obj, this.d[f]) ? q(f, n, mw1Var) : this;
        }
        if (!j(n)) {
            return this;
        }
        int t = t(n);
        su2 s = s(t);
        if (i2 == 30) {
            int c = s.c(obj);
            if (c != -1) {
                s = s.l(c, mw1Var);
            }
        } else {
            s = s.o(i, obj, i2 + 5, mw1Var);
        }
        return r(t, n, mw1Var.b, s);
    }

    public final su2 p(int i, Object obj, Object obj2, int i2, mw1 mw1Var) {
        mw1 mw1Var2;
        int n = 1 << od4.n(i, i2);
        if (i(n)) {
            int f = f(n);
            return (jh2.k(obj, this.d[f]) && jh2.k(obj2, v(f))) ? q(f, n, mw1Var) : this;
        }
        if (!j(n)) {
            return this;
        }
        int t = t(n);
        su2 s = s(t);
        if (i2 == 30) {
            int c = s.c(obj);
            if (c != -1 && jh2.k(obj2, s.v(c))) {
                s = s.l(c, mw1Var);
            }
            mw1Var2 = mw1Var;
        } else {
            mw1Var2 = mw1Var;
            s = s.p(i, obj, obj2, i2 + 5, mw1Var2);
        }
        return r(t, n, mw1Var2.b, s);
    }

    public final su2 q(int i, int i2, mw1 mw1Var) {
        mw1Var.setSize(mw1Var.size() - 1);
        mw1Var.n = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != mw1Var.b) {
            return new su2(i2 ^ this.a, this.b, od4.u(objArr, i), mw1Var.b);
        }
        this.d = od4.u(objArr, i);
        this.a ^= i2;
        return this;
    }

    public final su2 r(int i, int i2, bp bpVar, su2 su2Var) {
        if (su2Var != null) {
            return u(i, i2, bpVar, su2Var);
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != bpVar) {
            Object[] objArr2 = new Object[objArr.length - 1];
            wd.o0(objArr, objArr2, 0, 0, i, 6);
            wd.k0(objArr, objArr2, i, i + 1, objArr.length);
            return new su2(this.a, this.b ^ i2, objArr2, bpVar);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        wd.o0(objArr, objArr3, 0, 0, i, 6);
        wd.k0(objArr, objArr3, i, i + 1, objArr.length);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final su2 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (su2) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    public final su2 u(int i, int i2, bp bpVar, su2 su2Var) {
        Object[] objArr = su2Var.d;
        if (objArr.length != 2 || su2Var.b != 0) {
            Object[] objArr2 = this.d;
            if (this.c == bpVar) {
                objArr2[i] = su2Var;
                return this;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = su2Var;
            return new su2(this.a, this.b, copyOf, bpVar);
        }
        if (this.d.length == 1) {
            su2Var.a = this.b;
            return su2Var;
        }
        int f = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        wd.k0(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        wd.k0(copyOf2, copyOf2, f + 2, f, i);
        copyOf2[f] = obj;
        copyOf2[f + 1] = obj2;
        return new su2(this.a ^ i2, this.b ^ i2, copyOf2, bpVar);
    }

    public final Object v(int i) {
        return this.d[i + 1];
    }
}
