package defpackage;

import android.content.Context;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* compiled from: r8-map-id-873963f5d530defb17a8ef05986c59977090e8d51dfa8a657ed00bfc55036756 */
/* loaded from: classes.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ p8(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                AppCompatDelegate.a(context);
                return;
            case 1:
                AppCompatDelegate.b(context);
                return;
            case 2:
                ProfileInstallerInitializer.b(context);
                return;
            default:
                ProfileInstallerInitializer.a(context);
                return;
        }
    }
}
