package com.google.gson;

import defpackage.q91;
import defpackage.x91;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class b {
    public final b a() {
        return !(this instanceof TypeAdapter$NullSafeTypeAdapter) ? new b() { // from class: com.google.gson.TypeAdapter$NullSafeTypeAdapter
            @Override // com.google.gson.b
            public final Object b(q91 q91Var) {
                if (q91Var.H() != 9) {
                    return b.this.b(q91Var);
                }
                q91Var.D();
                return null;
            }

            @Override // com.google.gson.b
            public final void c(x91 x91Var, Object obj) {
                if (obj == null) {
                    x91Var.q();
                } else {
                    b.this.c(x91Var, obj);
                }
            }

            public final String toString() {
                return "NullSafeTypeAdapter[" + b.this + "]";
            }
        } : this;
    }

    public abstract Object b(q91 q91Var);

    public abstract void c(x91 x91Var, Object obj);
}
