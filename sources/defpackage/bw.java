package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class bw implements cw {
    public final float a;
    public final float b;

    public bw(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean a() {
        return this.a > this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bw)) {
            return false;
        }
        if (a() && ((bw) obj).a()) {
            return true;
        }
        bw bwVar = (bw) obj;
        return this.a == bwVar.a && this.b == bwVar.b;
    }

    @Override // defpackage.dw
    public final Comparable getEndInclusive() {
        return Float.valueOf(this.b);
    }

    @Override // defpackage.dw
    public final Comparable getStart() {
        return Float.valueOf(this.a);
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.floatToIntBits(this.b) + (Float.floatToIntBits(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
