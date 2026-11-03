package defpackage;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class en0 {
    public final boolean a;
    public final boolean b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Map g = fi1.U(pi0.a);

    public en0(boolean z, boolean z2, Long l, Long l2, Long l3, Long l4) {
        this.a = z;
        this.b = z2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.c;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.d;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.e;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.f;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map map = this.g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return kw.w0(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
