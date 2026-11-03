package androidx.lifecycle;

import defpackage.a52;
import defpackage.fi1;
import defpackage.kw;
import defpackage.os0;
import defpackage.xu3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public class ViewModelStore {
    private final Map<Object, ViewModel> map = new LinkedHashMap();

    public final void clear() {
        Map U = fi1.U(this.map);
        this.map.clear();
        Iterator it = U.values().iterator();
        while (it.hasNext()) {
            ((ViewModel) it.next()).clear$lifecycle_viewmodel();
        }
    }

    public final ViewModel get(Object obj) {
        return this.map.get(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends ViewModel> T getOrPut(Object obj, os0 os0Var) {
        os0Var.getClass();
        Map<Object, ViewModel> map = this.map;
        Object obj2 = map.get(obj);
        if (obj2 == null) {
            obj2 = os0Var.invoke();
            map.put(obj, obj2);
        }
        obj2.getClass();
        return (T) obj2;
    }

    public final Set<Object> keys() {
        return kw.P0(this.map.keySet());
    }

    public final void put(Object obj, ViewModel viewModel) {
        viewModel.getClass();
        ViewModel put = this.map.put(obj, viewModel);
        if (put != null) {
            put.clear$lifecycle_viewmodel();
        }
    }

    public String toString() {
        String c = a52.a(getClass()).c();
        if (c == null) {
            c = "ViewModelStore";
        }
        int hashCode = hashCode();
        xu3.g(16);
        String num = Integer.toString(hashCode, 16);
        num.getClass();
        return c + "@" + num + "(keys=" + keys() + ")";
    }
}
