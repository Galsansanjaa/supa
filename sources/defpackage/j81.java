package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j81 implements cs1 {
    public final /* synthetic */ int a;

    public /* synthetic */ j81(int i) {
        this.a = i;
    }

    @Override // defpackage.zi0
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                ds1 ds1Var = (ds1) obj2;
                ds1Var.a(c12.f, entry.getKey());
                ds1Var.a(c12.g, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
