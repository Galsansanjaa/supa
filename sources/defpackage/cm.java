package defpackage;

import androidx.autofill.HintConstants;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class cm implements a10, f50, Serializable {
    private final a10 completion;

    public cm(a10 a10Var) {
        this.completion = a10Var;
    }

    public a10 create(a10 a10Var) {
        a10Var.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public a10 create(Object obj, a10 a10Var) {
        a10Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // defpackage.f50
    public f50 getCallerFrame() {
        a10 a10Var = this.completion;
        if (a10Var instanceof f50) {
            return (f50) a10Var;
        }
        return null;
    }

    public final a10 getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        lb0 lb0Var = (lb0) getClass().getAnnotation(lb0.class);
        String str2 = null;
        if (lb0Var == null || lb0Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            i = -1;
        }
        int i2 = i >= 0 ? lb0Var.l()[i] : -1;
        f6 f6Var = ej1.b;
        f6 f6Var2 = ej1.m;
        if (f6Var2 == null) {
            try {
                f6 f6Var3 = new f6(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(HintConstants.AUTOFILL_HINT_NAME, null));
                ej1.m = f6Var3;
                f6Var2 = f6Var3;
            } catch (Exception unused2) {
                ej1.m = f6Var;
                f6Var2 = f6Var;
            }
        }
        if (f6Var2 != f6Var && (method = f6Var2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = f6Var2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = f6Var2.c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, null) : null;
            if (invoke3 instanceof String) {
                str2 = (String) invoke3;
            }
        }
        if (str2 == null) {
            str = lb0Var.c();
        } else {
            str = str2 + '/' + lb0Var.c();
        }
        return new StackTraceElement(str, lb0Var.m(), lb0Var.f(), i2);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.a10
    public final void resumeWith(Object obj) {
        while (true) {
            cm cmVar = this;
            a10 a10Var = cmVar.completion;
            a10Var.getClass();
            try {
                obj = cmVar.invokeSuspend(obj);
                if (obj == e50.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = new d82(th);
            }
            cmVar.releaseIntercepted();
            if (!(a10Var instanceof cm)) {
                a10Var.resumeWith(obj);
                return;
            }
            this = a10Var;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
