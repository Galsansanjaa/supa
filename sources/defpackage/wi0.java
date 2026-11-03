package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.IntSupplier;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wi0 extends v {
    public final IntSupplier d;

    public wi0(IntSupplier intSupplier, ArrayList arrayList) {
        super(true);
        this.d = intSupplier;
        setValue(arrayList);
    }

    @Override // defpackage.v
    public final void a(String str) {
        try {
            this.c = ro0.a(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.v
    public final String b() {
        try {
            return ro0.b(this.d.getAsInt(), (List) this.c);
        } catch (Exception e) {
            throw new rx(e, 2);
        }
    }

    @Override // defpackage.v
    public final String c(int i, String str) {
        try {
            return str.substring(i, this.d.getAsInt() + i);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override // defpackage.v, defpackage.ia0
    public final Object getValue() {
        return new ArrayList((Collection) this.c);
    }

    @Override // defpackage.v, defpackage.ia0
    public final void setValue(Object obj) {
        int asInt = this.d.getAsInt();
        ArrayList arrayList = new ArrayList((List) obj);
        for (int size = arrayList.size(); size < asInt; size++) {
            arrayList.add(Boolean.FALSE);
        }
        int size2 = arrayList.size();
        List list = arrayList;
        if (size2 > asInt) {
            list = arrayList.subList(0, asInt);
        }
        super.setValue(list);
    }
}
