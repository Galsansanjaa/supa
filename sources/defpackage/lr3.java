package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class lr3 extends cn3 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr3(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.cn3
    public final void h(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (mr3.f) {
                    mr3.b(obj, j, b);
                    return;
                } else {
                    mr3.c(obj, j, b);
                    return;
                }
            default:
                if (mr3.f) {
                    mr3.b(obj, j, b);
                    return;
                } else {
                    mr3.c(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.cn3
    public final boolean j(Object obj, long j) {
        switch (this.b) {
            case 0:
                return mr3.f ? mr3.m(obj, j) : mr3.n(obj, j);
            default:
                return mr3.f ? mr3.m(obj, j) : mr3.n(obj, j);
        }
    }

    @Override // defpackage.cn3
    public final void l(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (mr3.f) {
                    mr3.b(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    mr3.c(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (mr3.f) {
                    mr3.b(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    mr3.c(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.cn3
    public final float n(Object obj, long j) {
        int i = this.b;
        Object obj2 = this.a;
        switch (i) {
            case 0:
                return Float.intBitsToFloat(((Unsafe) obj2).getInt(obj, j));
            default:
                return Float.intBitsToFloat(((Unsafe) obj2).getInt(obj, j));
        }
    }

    @Override // defpackage.cn3
    public final void p(Object obj, long j, float f) {
        int i = this.b;
        Object obj2 = this.a;
        switch (i) {
            case 0:
                ((Unsafe) obj2).putInt(obj, j, Float.floatToIntBits(f));
                return;
            default:
                ((Unsafe) obj2).putInt(obj, j, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // defpackage.cn3
    public final double q(Object obj, long j) {
        int i = this.b;
        Object obj2 = this.a;
        switch (i) {
            case 0:
                return Double.longBitsToDouble(((Unsafe) obj2).getLong(obj, j));
            default:
                return Double.longBitsToDouble(((Unsafe) obj2).getLong(obj, j));
        }
    }

    @Override // defpackage.cn3
    public final void s(Object obj, long j, double d) {
        int i = this.b;
        Object obj2 = this.a;
        switch (i) {
            case 0:
                ((Unsafe) obj2).putLong(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                ((Unsafe) obj2).putLong(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }
}
