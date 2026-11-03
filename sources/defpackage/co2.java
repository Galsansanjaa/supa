package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class co2 implements nb1, Serializable {
    public os0 a;
    public volatile Object b;
    public final Object m;

    public co2(os0 os0Var) {
        os0Var.getClass();
        this.a = os0Var;
        this.b = jw0.G;
        this.m = this;
    }

    @Override // defpackage.nb1
    public final Object getValue() {
        Object obj;
        Object obj2 = this.b;
        jw0 jw0Var = jw0.G;
        if (obj2 != jw0Var) {
            return obj2;
        }
        synchronized (this.m) {
            obj = this.b;
            if (obj == jw0Var) {
                os0 os0Var = this.a;
                os0Var.getClass();
                obj = os0Var.invoke();
                this.b = obj;
                this.a = null;
            }
        }
        return obj;
    }

    @Override // defpackage.nb1
    public final boolean isInitialized() {
        return this.b != jw0.G;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
