package androidx.window.reflection;

import android.util.Log;
import defpackage.ca1;
import defpackage.ej1;
import defpackage.os0;
import defpackage.tj1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ReflectionUtils {
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean validateImplementation$lambda$1$lambda$0(Class cls, Method method) {
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Method method2 = cls.getMethod(name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
        ReflectionUtils reflectionUtils = INSTANCE;
        method2.getClass();
        if (!reflectionUtils.isPublic$window_release(method2)) {
            return false;
        }
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        return reflectionUtils.doesReturn$window_release(method2, returnType);
    }

    public static final boolean validateReflection$window_release(String str, os0 os0Var) {
        str.getClass();
        os0Var.getClass();
        try {
            boolean booleanValue = ((Boolean) os0Var.invoke()).booleanValue();
            if (!booleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public final boolean checkIsPresent$window_release(os0 os0Var) {
        os0Var.getClass();
        try {
            os0Var.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean doesReturn$window_release(Method method, ca1 ca1Var) {
        method.getClass();
        ca1Var.getClass();
        return doesReturn$window_release(method, ej1.u(ca1Var));
    }

    public final boolean doesReturn$window_release(Method method, Class<?> cls) {
        method.getClass();
        cls.getClass();
        return method.getReturnType().equals(cls);
    }

    public final boolean isPublic$window_release(Constructor<?> constructor) {
        constructor.getClass();
        return Modifier.isPublic(constructor.getModifiers());
    }

    public final boolean isPublic$window_release(Field field) {
        field.getClass();
        return Modifier.isPublic(field.getModifiers());
    }

    public final boolean isPublic$window_release(Method method) {
        method.getClass();
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean validateImplementation$window_release(Class<?> cls, Class<?> cls2) {
        cls.getClass();
        cls2.getClass();
        Method[] methods = cls2.getMethods();
        methods.getClass();
        for (Method method : methods) {
            if (!validateReflection$window_release(cls.getName() + '#' + method.getName() + " is not valid", new tj1(9, cls, method))) {
                return false;
            }
        }
        return true;
    }
}
