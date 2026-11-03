package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements Comparator, Serializable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(f fVar, Comparator comparator) {
        this.c = fVar;
        this.b = comparator;
    }

    public /* synthetic */ e(Function function, Comparator comparator) {
        this.b = comparator;
        this.c = function;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                f fVar = (f) this.c;
                Comparator comparator = this.b;
                int compare = fVar.compare(obj, obj2);
                return compare != 0 ? compare : comparator.compare(obj, obj2);
            default:
                Comparator comparator2 = this.b;
                Function function = (Function) this.c;
                return comparator2.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
