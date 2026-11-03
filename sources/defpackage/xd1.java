package defpackage;

import com.google.android.gms.common.api.Scope;
import j$.util.Objects;
import java.io.File;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class xd1 implements Comparator {
    public static final /* synthetic */ xd1 b = new xd1(16);
    public static final /* synthetic */ xd1 m = new xd1(21);
    public final /* synthetic */ int a;

    public /* synthetic */ xd1(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                hf0 hf0Var = (hf0) obj2;
                if (!hf0Var.G.isEmpty() && ((gg0) hf0Var.G.get(0)).r != null) {
                    String str = ((gg0) hf0Var.G.get(0)).r;
                    str.getClass();
                    File file = new File(str);
                    if (file.exists()) {
                        file.lastModified();
                    }
                }
                hf0 hf0Var2 = (hf0) obj;
                if (!hf0Var2.G.isEmpty() && ((gg0) hf0Var2.G.get(0)).r != null) {
                    String str2 = ((gg0) hf0Var2.G.get(0)).r;
                    str2.getClass();
                    File file2 = new File(str2);
                    if (file2.exists()) {
                        file2.lastModified();
                    }
                }
                return ej1.k(0L, 0L);
            case 2:
                return ej1.k(((hf0) obj).x, ((hf0) obj2).x);
            case 3:
                return ej1.k(Long.valueOf(((hf0) obj).j()), Long.valueOf(((hf0) obj2).j()));
            case 4:
                return ej1.k(((cy1) obj).b, ((cy1) obj2).b);
            case 5:
                return ej1.k(((r7) obj).b, ((r7) obj2).b);
            case 6:
                return ej1.k(Long.valueOf(((t33) obj2).c), Long.valueOf(((t33) obj).c));
            case 7:
                return ej1.k(Long.valueOf(((t33) obj2).c), Long.valueOf(((t33) obj).c));
            case 8:
                return ej1.k(Long.valueOf(((t33) obj).c), Long.valueOf(((t33) obj2).c));
            case 9:
                return ej1.k(Long.valueOf(((t33) obj).c), Long.valueOf(((t33) obj2).c));
            case 10:
                return ej1.k(Long.valueOf(((t33) obj2).c), Long.valueOf(((t33) obj).c));
            case 11:
                return ej1.k(Long.valueOf(((t33) obj2).c), Long.valueOf(((t33) obj).c));
            case 12:
                return ej1.k(Long.valueOf(((t33) obj).c), Long.valueOf(((t33) obj2).c));
            case 13:
                return ej1.k(Long.valueOf(((t33) obj2).c), Long.valueOf(((t33) obj).c));
            case 14:
                return ((String) obj).compareTo((String) obj2);
            case 15:
                return ej1.k(((ha3) obj).a, ((ha3) obj2).a);
            case 16:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 17:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
            case 18:
                int b2 = k93.b(obj);
                int b3 = k93.b(obj2);
                if (b2 != b3) {
                    if (b2 == 0) {
                        throw null;
                    }
                    if (b3 != 0) {
                        return b2 - b3;
                    }
                    throw null;
                }
                int E = sg3.E(b2);
                if (E == 0) {
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (E == 1) {
                    return ((String) obj).compareTo((String) obj2);
                }
                if (E == 2) {
                    return ((Long) obj).compareTo((Long) obj2);
                }
                if (E == 3) {
                    return ((Double) obj).compareTo((Double) obj2);
                }
                throw null;
            case 19:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 20:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
