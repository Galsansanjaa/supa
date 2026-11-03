package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ew0 implements mn2 {
    public final ArrayList a;

    public ew0() {
        this.a = new ArrayList(20);
    }

    public ew0(int i) {
        this.a = new ArrayList(i);
    }

    public static void e(String str, String str2) {
        if (str == null) {
            hu2.q("name == null");
            return;
        }
        if (str.isEmpty()) {
            v5.m("name is empty");
            return;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= ' ' || charAt >= 127) {
                Object[] objArr = {Integer.valueOf(charAt), Integer.valueOf(i), str};
                byte[] bArr = f63.a;
                v5.m(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", objArr));
                return;
            }
        }
        if (str2 == null) {
            hu2.q(k93.m("value for name ", str, " == null"));
            return;
        }
        int length2 = str2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt2 = str2.charAt(i2);
            if ((charAt2 <= 31 && charAt2 != '\t') || charAt2 >= 127) {
                Object[] objArr2 = {Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2};
                byte[] bArr2 = f63.a;
                v5.m(String.format(Locale.US, "Unexpected char %#04x at %d in %s value: %s", objArr2));
                return;
            }
        }
    }

    public void a(Object obj) {
        this.a.add(obj);
    }

    public void b(String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            c(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            c("", str.substring(1));
        } else {
            c("", str);
        }
    }

    public void c(String str, String str2) {
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    public void d(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.a;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public String f(String str) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 2; size >= 0; size -= 2) {
            if (str.equalsIgnoreCase((String) arrayList.get(size))) {
                return (String) arrayList.get(size + 1);
            }
        }
        return null;
    }

    public void g(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    @Override // defpackage.mn2
    public /* synthetic */ Object get() {
        Object obj = o64.j;
        return new yb4(this.a);
    }
}
