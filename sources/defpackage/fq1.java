package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class fq1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hq1 b;

    public /* synthetic */ fq1(hq1 hq1Var, int i) {
        this.a = i;
        this.b = hq1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        hq1 hq1Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = hq1Var.b;
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((xc1) obj).a();
                }
                return;
            default:
                ArrayList arrayList2 = hq1Var.b;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    ((xc1) obj2).getClass();
                }
                return;
        }
    }
}
