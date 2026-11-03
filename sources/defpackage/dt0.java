package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class dt0 extends fs implements ct0, ea1 {
    private final int arity;
    private final int flags;

    public dt0(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // defpackage.fs
    public ba1 computeReflected() {
        a52.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dt0) {
            dt0 dt0Var = (dt0) obj;
            return getName().equals(dt0Var.getName()) && getSignature().equals(dt0Var.getSignature()) && this.flags == dt0Var.flags && this.arity == dt0Var.arity && jh2.k(getBoundReceiver(), dt0Var.getBoundReceiver()) && jh2.k(getOwner(), dt0Var.getOwner());
        }
        if (obj instanceof ea1) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.ct0
    public int getArity() {
        return this.arity;
    }

    @Override // defpackage.fs
    public ea1 getReflected() {
        ba1 compute = compute();
        if (compute != this) {
            return (ea1) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.ea1
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.ea1
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.ea1
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.ea1
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.fs, defpackage.ba1, defpackage.ea1
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        ba1 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
