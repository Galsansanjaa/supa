package defpackage;

import androidx.profileinstaller.ProfileInstaller;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileInstaller.DiagnosticsCallback b;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public /* synthetic */ uz1(ProfileInstaller.DiagnosticsCallback diagnosticsCallback, int i, Object obj, int i2) {
        this.a = i2;
        this.b = diagnosticsCallback;
        this.m = i;
        this.n = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ProfileInstaller.a(this.b, this.m, this.n);
                return;
            default:
                ProfileInstaller.b(this.b, this.m, this.n);
                return;
        }
    }
}
