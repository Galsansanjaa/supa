package com.google.gson.internal.bind;

import defpackage.q91;
import defpackage.x91;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
abstract class TypeAdapters$IntegerFieldsTypeAdapter<T> extends com.google.gson.b {
    public final List a;

    public TypeAdapters$IntegerFieldsTypeAdapter(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    @Override // com.google.gson.b
    public final Object b(q91 q91Var) {
        if (q91Var.H() == 9) {
            q91Var.D();
            return null;
        }
        q91Var.d();
        List list = this.a;
        long[] jArr = new long[list.size()];
        while (q91Var.H() != 4) {
            int indexOf = list.indexOf(q91Var.B());
            if (indexOf >= 0) {
                jArr[indexOf] = q91Var.A();
            } else {
                q91Var.N();
            }
        }
        q91Var.l();
        return d(jArr);
    }

    @Override // com.google.gson.b
    public final void c(x91 x91Var, Object obj) {
        if (obj == null) {
            x91Var.q();
            return;
        }
        x91Var.e();
        long[] e = e(obj);
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                x91Var.l();
                return;
            } else {
                x91Var.m((String) list.get(i));
                x91Var.z(e[i]);
                i++;
            }
        }
    }

    public abstract Object d(long[] jArr);

    public abstract long[] e(Object obj);
}
