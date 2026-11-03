package androidx.window.core;

import android.app.Activity;
import android.content.Context;
import androidx.window.reflection.WindowExtensionsConstants;
import defpackage.ca1;
import defpackage.jh2;
import defpackage.ps0;
import defpackage.ux2;
import defpackage.vy2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ConsumerAdapter {
    private final ClassLoader loader;

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public static final class ConsumerHandler<T> implements InvocationHandler {
        private final ca1 clazz;
        private final ps0 consumer;

        public ConsumerHandler(ca1 ca1Var, ps0 ps0Var) {
            ca1Var.getClass();
            ps0Var.getClass();
            this.clazz = ca1Var;
            this.consumer = ps0Var;
        }

        private final boolean isAccept(Method method, Object[] objArr) {
            return jh2.k(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        private final boolean isEquals(Method method, Object[] objArr) {
            return jh2.k(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        private final boolean isHashCode(Method method, Object[] objArr) {
            return jh2.k(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        private final boolean isToString(Method method, Object[] objArr) {
            return jh2.k(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            obj.getClass();
            method.getClass();
            if (isAccept(method, objArr)) {
                ca1 ca1Var = this.clazz;
                Object obj2 = objArr != null ? objArr[0] : null;
                ux2.n(ca1Var, obj2);
                invokeAccept(obj2);
                return vy2.a;
            }
            if (isEquals(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (isHashCode(method, objArr)) {
                return Integer.valueOf(this.consumer.hashCode());
            }
            if (isToString(method, objArr)) {
                return this.consumer.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }

        public final void invokeAccept(T t) {
            t.getClass();
            this.consumer.invoke(t);
        }
    }

    /* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
    /* loaded from: classes4.dex */
    public interface Subscription {
        void dispose();
    }

    public ConsumerAdapter(ClassLoader classLoader) {
        classLoader.getClass();
        this.loader = classLoader;
    }

    private final <T> Object buildConsumer(ca1 ca1Var, ps0 ps0Var) {
        Object newProxyInstance = Proxy.newProxyInstance(this.loader, new Class[]{unsafeConsumerClass()}, new ConsumerHandler(ca1Var, ps0Var));
        newProxyInstance.getClass();
        return newProxyInstance;
    }

    private final Class<?> unsafeConsumerClass() {
        Class<?> loadClass = this.loader.loadClass(WindowExtensionsConstants.JAVA_CONSUMER);
        loadClass.getClass();
        return loadClass;
    }

    public final <T> void addConsumer(Object obj, ca1 ca1Var, String str, ps0 ps0Var) {
        obj.getClass();
        ca1Var.getClass();
        str.getClass();
        ps0Var.getClass();
        obj.getClass().getMethod(str, unsafeConsumerClass()).invoke(obj, buildConsumer(ca1Var, ps0Var));
    }

    public final Class<?> consumerClassOrNull$window_release() {
        try {
            return unsafeConsumerClass();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final <T> void createConsumer(Object obj, ca1 ca1Var, String str, Activity activity, ps0 ps0Var) {
        obj.getClass();
        ca1Var.getClass();
        str.getClass();
        activity.getClass();
        ps0Var.getClass();
        obj.getClass().getMethod(str, Activity.class, unsafeConsumerClass()).invoke(obj, activity, buildConsumer(ca1Var, ps0Var));
    }

    public final <T> Subscription createSubscription(final Object obj, ca1 ca1Var, String str, String str2, Activity activity, ps0 ps0Var) {
        obj.getClass();
        ca1Var.getClass();
        str.getClass();
        str2.getClass();
        activity.getClass();
        ps0Var.getClass();
        final Object buildConsumer = buildConsumer(ca1Var, ps0Var);
        obj.getClass().getMethod(str, Activity.class, unsafeConsumerClass()).invoke(obj, activity, buildConsumer);
        final Method method = obj.getClass().getMethod(str2, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter$createSubscription$1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() {
                method.invoke(obj, buildConsumer);
            }
        };
    }

    public final <T> Subscription createSubscription(final Object obj, ca1 ca1Var, String str, String str2, Context context, ps0 ps0Var) {
        obj.getClass();
        ca1Var.getClass();
        str.getClass();
        str2.getClass();
        context.getClass();
        ps0Var.getClass();
        final Object buildConsumer = buildConsumer(ca1Var, ps0Var);
        obj.getClass().getMethod(str, Context.class, unsafeConsumerClass()).invoke(obj, context, buildConsumer);
        final Method method = obj.getClass().getMethod(str2, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter$createSubscription$2
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() {
                method.invoke(obj, buildConsumer);
            }
        };
    }

    public final <T> Subscription createSubscriptionNoActivity(final Object obj, ca1 ca1Var, String str, String str2, ps0 ps0Var) {
        obj.getClass();
        ca1Var.getClass();
        str.getClass();
        str2.getClass();
        ps0Var.getClass();
        final Object buildConsumer = buildConsumer(ca1Var, ps0Var);
        obj.getClass().getMethod(str, unsafeConsumerClass()).invoke(obj, buildConsumer);
        final Method method = obj.getClass().getMethod(str2, unsafeConsumerClass());
        return new Subscription() { // from class: androidx.window.core.ConsumerAdapter$createSubscriptionNoActivity$1
            @Override // androidx.window.core.ConsumerAdapter.Subscription
            public void dispose() {
                method.invoke(obj, buildConsumer);
            }
        };
    }
}
