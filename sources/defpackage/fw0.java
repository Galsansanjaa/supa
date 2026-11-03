package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class fw0 {
    public final String[] a;

    public fw0(ew0 ew0Var) {
        ArrayList arrayList = ew0Var.a;
        this.a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final String a(String str) {
        String[] strArr = this.a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public final String b(int i) {
        return this.a[i * 2];
    }

    public final ew0 c() {
        ew0 ew0Var = new ew0();
        Collections.addAll(ew0Var.a, this.a);
        return ew0Var;
    }

    public final int d() {
        return this.a.length / 2;
    }

    public final String e(int i) {
        return this.a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fw0) && Arrays.equals(((fw0) obj).a, this.a);
    }

    public final List f(String str) {
        int d = d();
        ArrayList arrayList = null;
        for (int i = 0; i < d; i++) {
            if (str.equalsIgnoreCase(b(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(e(i));
            }
        }
        return arrayList != null ? DesugarCollections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int d = d();
        for (int i = 0; i < d; i++) {
            sb.append(b(i));
            sb.append(": ");
            sb.append(e(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
