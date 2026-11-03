package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class he implements b12 {
    public final int b;

    public he(int i) {
        this.b = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return b12.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b12)) {
            return false;
        }
        b12 b12Var = (b12) obj;
        return this.b == b12Var.tag() && a12.a.equals(b12Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.b ^ 14552422) + (a12.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.b12
    public final a12 intEncoding() {
        return a12.a;
    }

    @Override // defpackage.b12
    public final int tag() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.b + "intEncoding=" + a12.a + ')';
    }
}
