package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class vi0 extends v {
    public final /* synthetic */ int d;
    public final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(int i, Integer num) {
        super(true);
        this.d = 1;
        this.e = i;
        setValue(num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi0(List list, int i) {
        super(true);
        this.d = i;
        switch (i) {
            case 2:
                super(true);
                this.e = list.size();
                setValue(list);
                return;
            default:
                this.e = list.size();
                setValue(list);
                return;
        }
    }

    @Override // defpackage.v
    public final void a(String str) {
        switch (this.d) {
            case 0:
                try {
                    this.c = ro0.a(str);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            case 1:
                try {
                    this.c = Integer.valueOf(so0.a(str));
                    return;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            default:
                try {
                    this.c = to0.a(this.e, str);
                    return;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
        }
    }

    @Override // defpackage.v
    public final String b() {
        int i = this.d;
        int i2 = this.e;
        switch (i) {
            case 0:
                try {
                    return ro0.b(i2, (List) this.c);
                } catch (Exception e) {
                    throw new rx(e, 2);
                }
            case 1:
                try {
                    return so0.b(((Integer) this.c).intValue(), i2);
                } catch (Exception e2) {
                    throw new rx(e2, 2);
                }
            default:
                try {
                    return to0.b(i2, (List) this.c);
                } catch (Exception e3) {
                    throw new rx(e3, 2);
                }
        }
    }

    @Override // defpackage.v
    public final String c(int i, String str) {
        int i2 = this.d;
        int i3 = this.e;
        switch (i2) {
            case 0:
                try {
                    return str.substring(i, i3 + i);
                } catch (Exception e) {
                    throw new Exception(e);
                }
            case 1:
                try {
                    return str.substring(i, i3 + i);
                } catch (Exception e2) {
                    throw new Exception(e2);
                }
            default:
                try {
                    return str.substring(i, (2 * i3) + i);
                } catch (Exception e3) {
                    throw new Exception(e3);
                }
        }
    }

    @Override // defpackage.v, defpackage.ia0
    public Object getValue() {
        switch (this.d) {
            case 0:
                return new ArrayList((Collection) this.c);
            case 1:
            default:
                return super.getValue();
            case 2:
                return new ArrayList((Collection) this.c);
        }
    }

    @Override // defpackage.v, defpackage.ia0
    public void setValue(Object obj) {
        int i = this.d;
        int i2 = this.e;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList((List) obj);
                for (int size = arrayList.size(); size < i2; size++) {
                    arrayList.add(Boolean.FALSE);
                }
                int size2 = arrayList.size();
                List list = arrayList;
                if (size2 > i2) {
                    list = arrayList.subList(0, i2);
                }
                super.setValue(list);
                return;
            case 1:
            default:
                super.setValue(obj);
                return;
            case 2:
                ArrayList arrayList2 = new ArrayList((List) obj);
                for (int size3 = arrayList2.size(); size3 < i2; size3++) {
                    arrayList2.add(0);
                }
                int size4 = arrayList2.size();
                List list2 = arrayList2;
                if (size4 > i2) {
                    list2 = arrayList2.subList(0, i2);
                }
                super.setValue(list2);
                return;
        }
    }
}
