package defpackage;

import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Collection;
import java.util.function.Predicate;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public abstract class v implements ia0 {
    public final boolean a;
    public Predicate b = null;
    public Object c;

    public v(boolean z) {
        this.a = z;
    }

    public abstract void a(String str);

    public abstract String b();

    public abstract String c(int i, String str);

    @Override // defpackage.ia0
    public Object getValue() {
        return this.c;
    }

    @Override // defpackage.ia0
    public void setValue(Object obj) {
        Predicate predicate = this.b;
        if (predicate == null || predicate.test(obj)) {
            this.c = obj;
        } else {
            if (obj instanceof Collection) {
                throw new RuntimeException(wa2.v(new StringBuilder("Invalid value '"), (String) Collection.EL.stream((java.util.Collection) obj).map(new f(2)).collect(Collectors.joining(",")), "'"));
            }
            throw new RuntimeException("Invalid value '" + obj + "'");
        }
    }
}
