package defpackage;

import com.inmobi.cmp.core.model.portalconfig.GBCConsentValue;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class wf3 {
    public final int a;
    public final GBCConsentValue b;

    public wf3(int i, GBCConsentValue gBCConsentValue) {
        gBCConsentValue.getClass();
        this.a = i;
        this.b = gBCConsentValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf3)) {
            return false;
        }
        wf3 wf3Var = (wf3) obj;
        return this.a == wf3Var.a && this.b == wf3Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "GBCApplicablePurpose(id=" + this.a + ", defaultValue=" + this.b + ')';
    }
}
