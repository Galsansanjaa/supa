package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class eg3 {
    public LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eg3) && this.a.equals(((eg3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GoogleVendorList(googleVendorsInfoList=" + this.a + ')';
    }
}
