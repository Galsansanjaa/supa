package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import defpackage.f31;
import defpackage.qq;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final class JvmViewModelProviders {
    public static final JvmViewModelProviders INSTANCE = new JvmViewModelProviders();

    private JvmViewModelProviders() {
    }

    public final <T extends ViewModel> T createViewModel(Class<T> cls) {
        cls.getClass();
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                qq.g(cls, "Cannot create an instance of ");
                return null;
            }
            try {
                T newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return newInstance;
            } catch (IllegalAccessException e) {
                f31.h("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                f31.h("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            f31.h("Cannot create an instance of ", cls, e3);
            return null;
        }
    }
}
