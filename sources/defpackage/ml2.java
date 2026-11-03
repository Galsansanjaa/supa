package defpackage;

import com.google.gson.internal.bind.a;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final class ml2 extends a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml2(Class cls, int i) {
        super(cls);
        this.b = i;
    }

    @Override // com.google.gson.internal.bind.a
    public final Date a(Date date) {
        switch (this.b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
