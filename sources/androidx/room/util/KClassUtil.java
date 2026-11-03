package androidx.room.util;

import defpackage.f31;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class KClassUtil {
    public static final <T, C> T findAndInstantiateDatabaseImpl(Class<C> cls, String str) {
        String str2;
        String str3;
        cls.getClass();
        str.getClass();
        Package r0 = cls.getPackage();
        if (r0 == null || (str2 = r0.getName()) == null) {
            str2 = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (str2.length() != 0) {
            canonicalName = canonicalName.substring(str2.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        String replace = canonicalName.replace('.', '_');
        replace.getClass();
        sb.append(replace);
        sb.append(str);
        String sb2 = sb.toString();
        try {
            if (str2.length() == 0) {
                str3 = sb2;
            } else {
                str3 = str2 + '.' + sb2;
            }
            Class<?> cls2 = Class.forName(str3, true, cls.getClassLoader());
            cls2.getClass();
            return (T) cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + sb2 + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            f31.j("Cannot access the constructor ", cls.getCanonicalName(), e2);
            return null;
        } catch (InstantiationException e3) {
            f31.j("Failed to create an instance of ", cls.getCanonicalName(), e3);
            return null;
        }
    }

    public static /* synthetic */ Object findAndInstantiateDatabaseImpl$default(Class cls, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }
}
