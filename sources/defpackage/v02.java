package defpackage;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class v02 extends fs implements sa1 {
    private final boolean syntheticJavaProperty;

    public v02(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = false;
    }

    @Override // defpackage.fs
    public ba1 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v02) {
            v02 v02Var = (v02) obj;
            return getOwner().equals(v02Var.getOwner()) && getName().equals(v02Var.getName()) && getSignature().equals(v02Var.getSignature()) && jh2.k(getBoundReceiver(), v02Var.getBoundReceiver());
        }
        if (obj instanceof sa1) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.fs
    public sa1 getReflected() {
        if (this.syntheticJavaProperty) {
            f31.f("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
            return null;
        }
        ba1 compute = compute();
        if (compute != this) {
            return (sa1) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.sa1
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.sa1
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        ba1 compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
