package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes4.dex */
public final /* synthetic */ class wk implements os0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xl b;
    public final /* synthetic */ File m;
    public final /* synthetic */ String n;

    public /* synthetic */ wk(xl xlVar, File file, String str) {
        this.b = xlVar;
        this.m = file;
        this.n = str;
    }

    public /* synthetic */ wk(xl xlVar, String str, File file) {
        this.b = xlVar;
        this.n = str;
        this.m = file;
    }

    @Override // defpackage.os0
    public final Object invoke() {
        int i = this.a;
        vy2 vy2Var = vy2.a;
        String str = this.n;
        File file = this.m;
        xl xlVar = this.b;
        switch (i) {
            case 0:
                ConcurrentHashMap concurrentHashMap = i31.a;
                String packageName = xlVar.getPackageName();
                packageName.getClass();
                i31.b(packageName, str);
                xlVar.X(file, null);
                return vy2Var;
            default:
                int i2 = xl.R;
                xlVar.V(file, str);
                return vy2Var;
        }
    }
}
